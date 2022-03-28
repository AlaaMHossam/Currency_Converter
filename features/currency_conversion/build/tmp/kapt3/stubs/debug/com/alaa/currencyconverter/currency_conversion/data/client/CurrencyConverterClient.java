package com.alaa.currencyconverter.currency_conversion.data.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/alaa/currencyconverter/currency_conversion/data/client/CurrencyConverterClient;", "", "fetchRates", "Lcom/alaa/currencyconverter/currency_conversion/data/model/rates/RatesDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSymbols", "Lcom/alaa/currencyconverter/currency_conversion/data/model/symbols/SymbolsDTO;", "currency_conversion_debug"})
public abstract interface CurrencyConverterClient {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "symbols")
    public abstract java.lang.Object fetchSymbols(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.alaa.currencyconverter.currency_conversion.data.model.symbols.SymbolsDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "latest")
    public abstract java.lang.Object fetchRates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.alaa.currencyconverter.currency_conversion.data.model.rates.RatesDTO> continuation);
}