package com.alaa.currencyconverter.currency_conversion.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/alaa/currencyconverter/currency_conversion/data/repository/CurrencyConverterRepositoryImpl;", "Lcom/alaa/currencyconverter/currency_conversion/domain/repository/CurrencyConverterRepository;", "client", "Lcom/alaa/currencyconverter/currency_conversion/data/client/CurrencyConverterClient;", "(Lcom/alaa/currencyconverter/currency_conversion/data/client/CurrencyConverterClient;)V", "fetchCurrencyData", "Lcom/alaa/currencyconverter/core/states/DataState;", "Lcom/alaa/currencyconverter/currency_conversion/domain/model/CurrencyData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currency_conversion_debug"})
@javax.inject.Singleton()
public final class CurrencyConverterRepositoryImpl implements com.alaa.currencyconverter.currency_conversion.domain.repository.CurrencyConverterRepository {
    private final com.alaa.currencyconverter.currency_conversion.data.client.CurrencyConverterClient client = null;
    
    @javax.inject.Inject()
    public CurrencyConverterRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.alaa.currencyconverter.currency_conversion.data.client.CurrencyConverterClient client) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchCurrencyData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.alaa.currencyconverter.core.states.DataState<com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData>> continuation) {
        return null;
    }
}