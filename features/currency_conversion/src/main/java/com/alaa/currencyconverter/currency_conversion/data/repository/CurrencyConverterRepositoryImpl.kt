package com.alaa.currencyconverter.currency_conversion.data.repository

import com.alaa.currencyconverter.core.states.DataState
import com.alaa.currencyconverter.currency_conversion.data.client.CurrencyConverterClient
import com.alaa.currencyconverter.currency_conversion.data.model.rates.toDomainModel
import com.alaa.currencyconverter.currency_conversion.data.model.symbols.toDomainModel
import com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData
import com.alaa.currencyconverter.currency_conversion.domain.model.Rates
import com.alaa.currencyconverter.currency_conversion.domain.model.Symbols
import com.alaa.currencyconverter.currency_conversion.domain.repository.CurrencyConverterRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CurrencyConverterRepositoryImpl
@Inject
constructor(private val client: CurrencyConverterClient) : CurrencyConverterRepository {
    override suspend fun fetchCurrencyData(): DataState<CurrencyData> =
        try {
            val symbolsResponse = client.fetchSymbols().toDomainModel()
            val ratesResponse = client.fetchRates().toDomainModel()
            val currencyData = CurrencyData(
                ratesResponse.success,
                symbolsResponse.symbolsList,
                symbolsResponse.currenciesList,
                ratesResponse.ratesList
            )
            DataState.Success(currencyData)
        } catch (exception: Exception) {
            DataState.Error(exception)
        }
}