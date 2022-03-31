package com.alaa.currencyconverter.common_data.data.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface HistoryConversionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addConversion(historyConversionItem: HistoryConversionData.HistoryConversionItem)

    @Query("SELECT * FROM HistoryConversionItem")
    suspend fun getAllConversions(): List<HistoryConversionData.HistoryConversionItem>
}