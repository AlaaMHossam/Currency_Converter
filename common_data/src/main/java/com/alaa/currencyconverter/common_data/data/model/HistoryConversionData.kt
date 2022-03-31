package com.alaa.currencyconverter.common_data.data.model

import androidx.recyclerview.widget.DiffUtil
import androidx.room.Entity
import androidx.room.PrimaryKey

sealed class HistoryConversionData {

    @Entity
    data class HistoryConversionItem(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        val fromCurrency: String,
        val fromAmount: Double,
        val toCurrency: String,
        val toAmount: Double,
        val timestamp: Long
    ) : HistoryConversionData()

    data class HistoryConversionHeader(val date: String) : HistoryConversionData()
}/*

class HistoryConversionDataDiffUtil : DiffUtil.ItemCallback<HistoryConversionData>() {
    override fun areContentsTheSame(oldItem: HistoryConversionData, newItem: HistoryConversionData)
            : Boolean = oldItem.id == newItem.id

    override fun areItemsTheSame(oldItem: HistoryConversionData, newItem: HistoryConversionData)
            : Boolean = oldItem == newItem
}*/