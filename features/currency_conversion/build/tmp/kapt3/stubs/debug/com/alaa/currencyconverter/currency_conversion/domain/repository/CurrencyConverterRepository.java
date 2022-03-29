package com.alaa.currencyconverter.currency_conversion.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/alaa/currencyconverter/currency_conversion/domain/repository/CurrencyConverterRepository;", "", "fetchCurrencyData", "Lcom/alaa/currencyconverter/core/states/DataState;", "Lcom/alaa/currencyconverter/currency_conversion/domain/model/CurrencyData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currency_conversion_debug"})
public abstract interface CurrencyConverterRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchCurrencyData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.alaa.currencyconverter.core.states.DataState<com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData>> continuation);
}