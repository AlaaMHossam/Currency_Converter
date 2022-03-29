package com.alaa.currencyconverter.currency_conversion.data.di

import com.alaa.currencyconverter.currency_conversion.data.client.CurrencyConverterClient
import com.alaa.currencyconverter.currency_conversion.data.repository.CurrencyConverterRepositoryImpl
import com.alaa.currencyconverter.currency_conversion.domain.repository.CurrencyConverterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CurrencyConverterDIModule {
    @Singleton
    @Provides
    internal fun providesCurrencyConverterClient(retrofit: Retrofit):
            CurrencyConverterClient = retrofit.create(CurrencyConverterClient::class.java)

    @Singleton
    @Provides
    internal fun providesCurrencyConverterRepository(CurrencyConverterRepositoryImpl: CurrencyConverterRepositoryImpl)
            : CurrencyConverterRepository = CurrencyConverterRepositoryImpl
}