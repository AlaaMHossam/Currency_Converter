package com.alaa.currencyconverter.db

import android.content.Context
import androidx.room.Room
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomModule {

    @Singleton
    @Provides
    internal fun providesAppDatabase(@ApplicationContext context: Context): AppDatabase = Room
        .databaseBuilder(context, AppDatabase::class.java, "AppDatabase")
        .fallbackToDestructiveMigration()
        .build()

    @Singleton
    @Provides
    internal fun providesUserDao(appDatabase: AppDatabase):
            HistoryConversionDao = appDatabase.historyConversionDao()
}
