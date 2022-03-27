package com.alaa.currencyconverter.currency_conversion.data.client

import com.alaa.currencyconverter.currency_conversion.data.model.rates.RatesDTO
import com.alaa.currencyconverter.currency_conversion.data.model.symbols.SymbolsDTO
import retrofit2.http.GET

interface CurrencyConverterClient {

    @GET("symbols")
    suspend fun fetchSymbols(): SymbolsDTO

    @GET("latest")
    suspend fun fetchRates(): RatesDTO
}