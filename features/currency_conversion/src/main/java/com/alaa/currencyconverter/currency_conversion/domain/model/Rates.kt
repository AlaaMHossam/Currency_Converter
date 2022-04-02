package com.alaa.currencyconverter.currency_conversion.domain.model

import com.alaa.currencyconverter.currency_conversion.data.model.rates.Rate

data class Rates(
    val success: Boolean,
    val ratesList: List<Rate>
)
