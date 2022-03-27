package com.alaa.currencyconverter.currency_conversion.ui

import androidx.test.ext.junit.runners.AndroidJUnit4
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@HiltAndroidTest
class CurrencyConversionFragmentTest {

   /* private val mockGetSymbolsCase = mockk<GetSymbolsCase>(relaxed = true)
    private val mockGetRatesCase = mockk<GetRatesCase>(relaxed = true)
    private val mockCalculateRatesCase = mockk<CalculateRatesCase>(relaxed = true)

    private val symbolsObject = symbolsDTO().apply { addSymbolsList() }
    private val ratesDTO = ratesDTO().apply { addRatesList() }

    @BindValue
    val mockViewModel =
        CurrencyConverterViewModel(
            mockGetSymbolsCase,
            mockGetRatesCase
        )

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Before
    fun setUp() {
        hiltRule.inject()
    }

    @Test
    fun loading_currencies_state() {
        // Given
        mockViewModel.symbolsViewState.postValue(ViewState.LOADING)

        // When
        launchFragmentInHiltContainer<CurrencyConversionFragment>()

        // Then
        onView(withId(R.id.cl_main_data)).check(matches(not(isDisplayed())))
        onView(withId(R.id.pb_main)).check(matches(isDisplayed()))
    }

    @Test
    fun from_currency_field_has_currencies() {
        // Given
        val symbolsObject = symbolsDTO()

        // When
        launchFragmentInHiltContainer<CurrencyConversionFragment> {
            (this as CurrencyConversionFragment).updateUI(DataState.Success(symbolsObject))
        }
        onView(withId(R.id.actv_from_currency)).perform(click())

        // Then
        onView(withText("AED")).inRoot(isPlatformPopup()).check(matches(isDisplayed()))
    }

    @Test
    fun to_currency_field_has_currencies() {
        // Given
        val symbolsObject = symbolsDTO()

        // When
        launchFragmentInHiltContainer<CurrencyConversionFragment> {
            (this as CurrencyConversionFragment).updateUI(DataState.Success(symbolsObject))
        }
        onView(withId(R.id.actv_to_currency)).perform(click())

        // Then
        onView(withText("AED")).inRoot(isPlatformPopup()).check(matches(isDisplayed()))
    }

    @Test
    fun currencies_changed_in_viewModel() {
        // Given
        mockViewModel.symbolsViewState.postValue(ViewState.SHOW_CONTENT)
        val symbolsObject = symbolsDTO()

        // When
        launchFragmentInHiltContainer<CurrencyConversionFragment> {
            (this as CurrencyConversionFragment).updateUI(DataState.Success(symbolsObject))
        }
        onView(withId(R.id.actv_from_currency)).perform(click())
        onView(withText("AED")).inRoot(isPlatformPopup()).perform(click())

        // Then
        Thread.sleep(5000)
        assert(mockViewModel.fromCurrenciesLiveData.value == "AED")
    }

    @Test
    fun base_rate_changed_in_viewModel() {
        // Given
        val ratesDTO = ratesDTO()

        // When
        launchFragmentInHiltContainer<CurrencyConversionFragment> {
            (this as CurrencyConversionFragment).updateRatesUI(DataState.Success(ratesDTO))
        }

        // Then
        assert(mockViewModel.baseRate == ratesDTO.ratesList?.find { it.name == ratesDTO.base }?.amount)
        Log.d("TAG", "base_rate_changed_in_viewModel:${mockViewModel.baseRate} ")
    }

    @Test
    fun conversion_test() {
        // Given

        // When
        launchFragmentInHiltContainer<CurrencyConversionFragment> {
            this as CurrencyConversionFragment
            updateUI(DataState.Success(symbolsObject))
            updateRatesUI(DataState.Success(ratesDTO))
        }
        selectAEDInLists()

        onView(withId(R.id.et_amounts_from)).perform(typeText("40.0"))

        // Then
        mockViewModel.calculateRate()

        Thread.sleep(2000)
        Log.d("TAG", "conversion_test:${mockViewModel.convertedRate.value} ")
        assert(mockViewModel.convertedRate.value == 40.0)
    }

    private fun selectAEDInLists() {
        onView(withId(R.id.actv_from_currency)).perform(click())
        Thread.sleep(2000)
        onView(withText("AED")).inRoot(isPlatformPopup()).perform(click())

        onView(withId(R.id.actv_to_currency)).perform(click())
        Thread.sleep(2000)
        onView(withText("AED")).inRoot(isPlatformPopup()).perform(click())

    }

    private fun symbolsDTO(): SymbolsDTO {
        val symbolsSuccess =
            UITestFunctions.getJson("network_responses/Symbols/symbols_success_response.json")
        return Gson().fromJson(symbolsSuccess, SymbolsDTO::class.java)
    }

    private fun ratesDTO(): RatesDTO {
        val ratesSuccess =
            UITestFunctions.getJson("network_responses/Rates/rates_success_response.json")
        return Gson().fromJson(ratesSuccess, RatesDTO::class.java)
    }*/
}