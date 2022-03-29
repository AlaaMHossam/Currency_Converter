package com.alaa.currencyconverter.common_data.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class HistoryConversionItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val fromCurrency: String,
    val fromAmount: Double,
    val toCurrency: String,
    val toAmount: Double
)
