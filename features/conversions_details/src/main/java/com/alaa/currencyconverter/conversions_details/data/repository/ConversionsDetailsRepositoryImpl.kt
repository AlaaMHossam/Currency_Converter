package com.alaa.currencyconverter.conversions_details.data.repository

import com.alaa.currencyconverter.common_data.data.model.HistoryConversionDao
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionHeader
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionItem
import com.alaa.currencyconverter.common_data.data.model.HistoryData
import com.alaa.currencyconverter.conversions_details.domain.repository.ConversionsDetailsRepository
import com.alaa.currencyconverter.core.states.DataState
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ConversionsDetailsRepositoryImpl
@Inject constructor(private val historyConversionDao: HistoryConversionDao) :
    ConversionsDetailsRepository {
    override suspend fun fetchConversions(): List<HistoryConversionItem> =
        historyConversionDao.getAllConversions()
}