package com.alaa.currencyconverter.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionDao
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionItem

@Database(entities = [HistoryConversionItem::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyConversionDao(): HistoryConversionDao
}
