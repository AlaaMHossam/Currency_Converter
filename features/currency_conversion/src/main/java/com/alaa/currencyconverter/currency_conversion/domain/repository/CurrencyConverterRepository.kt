package com.alaa.currencyconverter.currency_conversion.domain.repository

import com.alaa.currencyconverter.common_data.data.model.HistoryConversionItem
import com.alaa.currencyconverter.core.states.DataState
import com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData

interface CurrencyConverterRepository {
    suspend fun fetchCurrencyData() : DataState<CurrencyData>
    suspend fun saveConversion(historyConversionItem: HistoryConversionItem): DataState<Unit>
}