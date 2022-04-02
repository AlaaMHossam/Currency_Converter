package com.alaa.currencyconverter.conversions_details.data.di

import com.alaa.currencyconverter.conversions_details.data.repository.ConversionsDetailsRepositoryImpl
import com.alaa.currencyconverter.conversions_details.domain.repository.ConversionsDetailsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ConversionsDetailsDIModule {
    
    @Singleton
    @Provides
    internal fun providesConversionsDetailsRepository(ConversionsDetailsRepositoryImpl: ConversionsDetailsRepositoryImpl)
            : ConversionsDetailsRepository = ConversionsDetailsRepositoryImpl
}