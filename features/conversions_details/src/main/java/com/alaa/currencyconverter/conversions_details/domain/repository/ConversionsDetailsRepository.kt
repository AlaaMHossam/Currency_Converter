package com.alaa.currencyconverter.conversions_details.domain.repository

import com.alaa.currencyconverter.common_data.data.model.HistoryConversionItem
import com.alaa.currencyconverter.common_data.data.model.HistoryData
import com.alaa.currencyconverter.core.states.DataState

interface ConversionsDetailsRepository {
    suspend fun fetchConversions() : List<HistoryConversionItem>
}