package com.alaa.currencyconverter.currency_conversion.domain.model

import com.alaa.currencyconverter.currency_conversion.data.model.symbols.Symbol

data class Symbols(
    val symbolsList: List<Symbol>,
    val currenciesList: List<String>
)
