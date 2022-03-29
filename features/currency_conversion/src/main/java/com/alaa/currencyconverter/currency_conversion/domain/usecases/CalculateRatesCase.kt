package com.alaa.currencyconverter.currency_conversion.domain.usecases

class CalculateRatesCase {
    operator fun invoke(fromAmount: Double, fromRate: Double, toRate: Double): String =
        (fromAmount.div(fromRate)).times(toRate).toString()
}