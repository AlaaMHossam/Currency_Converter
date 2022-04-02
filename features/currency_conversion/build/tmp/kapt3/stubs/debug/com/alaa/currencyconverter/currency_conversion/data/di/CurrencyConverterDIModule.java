package com.alaa.currencyconverter.currency_conversion.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001\u00a2\u0006\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/alaa/currencyconverter/currency_conversion/data/di/CurrencyConverterDIModule;", "", "()V", "providesCurrencyConverterClient", "Lcom/alaa/currencyconverter/currency_conversion/data/client/CurrencyConverterClient;", "retrofit", "Lretrofit2/Retrofit;", "providesCurrencyConverterClient$currency_conversion_debug", "providesCurrencyConverterRepository", "Lcom/alaa/currencyconverter/currency_conversion/domain/repository/CurrencyConverterRepository;", "CurrencyConverterRepositoryImpl", "Lcom/alaa/currencyconverter/currency_conversion/data/repository/CurrencyConverterRepositoryImpl;", "providesCurrencyConverterRepository$currency_conversion_debug", "currency_conversion_debug"})
@dagger.Module()
public final class CurrencyConverterDIModule {
    
    public CurrencyConverterDIModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.alaa.currencyconverter.currency_conversion.data.client.CurrencyConverterClient providesCurrencyConverterClient$currency_conversion_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.alaa.currencyconverter.currency_conversion.domain.repository.CurrencyConverterRepository providesCurrencyConverterRepository$currency_conversion_debug(@org.jetbrains.annotations.NotNull()
    com.alaa.currencyconverter.currency_conversion.data.repository.CurrencyConverterRepositoryImpl CurrencyConverterRepositoryImpl) {
        return null;
    }
}