package com.alaa.currencyconverter.currency_conversion.ui

interface CurrencyConversionCallback {
    fun onConversionSuccess(fromAmount: Double, toAmount: Double)
    fun onConversionFail(exception: Exception)
}