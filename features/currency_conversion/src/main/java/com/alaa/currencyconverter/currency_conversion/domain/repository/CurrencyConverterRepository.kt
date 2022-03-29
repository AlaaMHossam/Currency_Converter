package com.alaa.currencyconverter.currency_conversion.domain.repository

import com.alaa.currencyconverter.core.states.DataState
import com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData
import com.alaa.currencyconverter.currency_conversion.domain.model.Rates
import com.alaa.currencyconverter.currency_conversion.domain.model.Symbols

interface CurrencyConverterRepository {
    suspend fun fetchCurrencyData() : DataState<CurrencyData>
}