package com.alaa.currencyconverter.currency_conversion.ui

import androidx.lifecycle.ViewModel
import com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData
import com.alaa.currencyconverter.currency_conversion.domain.usecases.CalculateRatesCase
import kotlinx.coroutines.flow.MutableStateFlow

class ConversionViewModel : ViewModel() {

    private val calculateRatesCase = CalculateRatesCase()

    var currencyData: CurrencyData? = null

    val fromAmount = MutableStateFlow("1")
    val toAmount = MutableStateFlow("0.0")

    private val fromRate = MutableStateFlow(0.0)
    private val toRate = MutableStateFlow(0.0)

    fun setFromRate(selectedCurrencyAbv: String) {
        fromRate.value = getAmount(selectedCurrencyAbv)
    }

    fun setToRate(selectedCurrencyAbv: String) {
        toRate.value = getAmount(selectedCurrencyAbv)
    }

    private fun getAmount(selectedCurrencyAbv: String) =
        currencyData?.ratesList?.find { it.name == selectedCurrencyAbv }?.amount ?: 0.0

    fun calculateCurrency() {
        toAmount.value = calculateRatesCase(
            if (fromAmount.value.isNotEmpty()) fromAmount.value.toDouble() else 0.0,
            fromRate.value,
            toRate.value
        )
    }
}