package com.alaa.currencyconverter.currency_conversion.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/alaa/currencyconverter/currency_conversion/data/repository/CurrencyConverterRepositoryImpl;", "Lcom/alaa/currencyconverter/currency_conversion/domain/repository/CurrencyConverterRepository;", "client", "Lcom/alaa/currencyconverter/currency_conversion/data/client/CurrencyConverterClient;", "historyConversionDao", "Lcom/alaa/currencyconverter/common_data/data/model/HistoryConversionDao;", "(Lcom/alaa/currencyconverter/currency_conversion/data/client/CurrencyConverterClient;Lcom/alaa/currencyconverter/common_data/data/model/HistoryConversionDao;)V", "fetchCurrencyData", "Lcom/alaa/currencyconverter/core/states/DataState;", "Lcom/alaa/currencyconverter/currency_conversion/domain/model/CurrencyData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveConversion", "", "historyConversionItem", "Lcom/alaa/currencyconverter/common_data/data/model/HistoryConversionData$HistoryConversionItem;", "(Lcom/alaa/currencyconverter/common_data/data/model/HistoryConversionData$HistoryConversionItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currency_conversion_debug"})
@javax.inject.Singleton()
public final class CurrencyConverterRepositoryImpl implements com.alaa.currencyconverter.currency_conversion.domain.repository.CurrencyConverterRepository {
    private final com.alaa.currencyconverter.currency_conversion.data.client.CurrencyConverterClient client = null;
    private final com.alaa.currencyconverter.common_data.data.model.HistoryConversionDao historyConversionDao = null;
    
    @javax.inject.Inject()
    public CurrencyConverterRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.alaa.currencyconverter.currency_conversion.data.client.CurrencyConverterClient client, @org.jetbrains.annotations.NotNull()
    com.alaa.currencyconverter.common_data.data.model.HistoryConversionDao historyConversionDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchCurrencyData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.alaa.currencyconverter.core.states.DataState<com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveConversion(@org.jetbrains.annotations.NotNull()
    com.alaa.currencyconverter.common_data.data.model.HistoryConversionData.HistoryConversionItem historyConversionItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.alaa.currencyconverter.core.states.DataState<kotlin.Unit>> continuation) {
        return null;
    }
}