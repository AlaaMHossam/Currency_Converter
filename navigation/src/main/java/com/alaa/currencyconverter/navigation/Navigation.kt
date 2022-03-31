package com.alaa.currencyconverter.navigation

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Navigation {

    @Provides
    @Singleton
    fun providesMainNavigator() = MainNavigator()

}