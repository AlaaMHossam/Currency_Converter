package com.alaa.currencyconverter.currency_conversion.domain.model

import com.alaa.currencyconverter.currency_conversion.data.model.rates.Rate
import com.alaa.currencyconverter.currency_conversion.data.model.symbols.Symbol

data class CurrencyData(
    val success: Boolean?,
    val symbolsList: List<Symbol>,
    val currenciesList: List<String>,
    val ratesList: List<Rate>
)
