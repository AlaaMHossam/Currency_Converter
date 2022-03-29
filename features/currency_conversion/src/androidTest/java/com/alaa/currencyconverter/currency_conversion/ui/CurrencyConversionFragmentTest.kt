package com.alaa.currencyconverter.currency_conversion.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.RootMatchers.isPlatformPopup
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.alaa.currencyconverter.core.launchFragmentInHiltContainer
import com.alaa.currencyconverter.core.states.DataState
import com.alaa.currencyconverter.core.states.ViewState
import com.alaa.currencyconverter.currency_conversion.R
import com.alaa.currencyconverter.currency_conversion.data.model.rates.RatesDTO
import com.alaa.currencyconverter.currency_conversion.data.model.rates.toDomainModel
import com.alaa.currencyconverter.currency_conversion.data.model.symbols.SymbolsDTO
import com.alaa.currencyconverter.currency_conversion.data.model.symbols.toDomainModel
import com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData
import com.alaa.currencyconverter.currency_conversion.domain.model.Rates
import com.alaa.currencyconverter.currency_conversion.domain.model.Symbols
import com.alaa.currencyconverter.currency_conversion.domain.usecases.CalculateRatesCase
import com.google.gson.Gson
import dagger.hilt.android.testing.BindValue
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import io.mockk.every
import io.mockk.mockk
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@HiltAndroidTest
class CurrencyConversionFragmentTest {

    @BindValue
    val mockViewModel = mockk<CurrencyConverterViewModel>(relaxed = true)

    @BindValue
    val mockConversionViewModel = mockk<ConversionViewModel>(relaxed = true)

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Before
    fun setUp() {
        hiltRule.inject()
    }

    @Test
    fun loading_view_state() {
        // Given
        every { mockViewModel.viewSate.value } returns ViewState.LOADING
        every { mockConversionViewModel.fromAmount.value } returns ""
        every { mockConversionViewModel.toAmount.value } returns ""

        // When
        launchFragmentInHiltContainer<CurrencyConversionFragment>()

        // Then
        onView(withId(R.id.pb_main)).check(matches(isDisplayed()))
    }

    @Test
    fun from_list_has_data() {
        // Given
        every { mockViewModel.viewSate.value } returns ViewState.SHOW_CONTENT
        every { mockConversionViewModel.fromAmount.value } returns ""
        every { mockConversionViewModel.toAmount.value } returns ""

        // When
        launchFragmentInHiltContainer<CurrencyConversionFragment> {
            this as CurrencyConversionFragment
            updateUI(DataState.Success(currencyData()))
        }

        // Then
        onView(withId(R.id.actv_from_currency)).perform(click())
        onView(withText("AED")).inRoot(isPlatformPopup()).check(matches(isDisplayed()))

        onView(withId(R.id.actv_to_currency)).perform(click())
        onView(withText("AED")).inRoot(isPlatformPopup()).check(matches(isDisplayed()))
    }

    private fun currencyData(): CurrencyData =
        CurrencyData(
            rates().success,
            symbols().symbolsList,
            symbols().currenciesList,
            rates().ratesList
        )

    private fun symbols(): Symbols {
        val symbolsSuccess =
            UITestFunctions.getJson("network_responses/Symbols/symbols_success_response.json")
        return Gson().fromJson(symbolsSuccess, SymbolsDTO::class.java).toDomainModel()
    }

    private fun rates(): Rates {
        val ratesSuccess =
            UITestFunctions.getJson("network_responses/Rates/rates_success_response.json")
        return Gson().fromJson(ratesSuccess, RatesDTO::class.java).toDomainModel()
    }
}