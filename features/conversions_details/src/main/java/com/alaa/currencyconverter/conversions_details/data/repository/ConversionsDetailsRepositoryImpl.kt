package com.alaa.currencyconverter.conversions_details.data.repository

import com.alaa.currencyconverter.common_data.data.model.HistoryConversionDao
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionData
import com.alaa.currencyconverter.conversions_details.domain.repository.ConversionsDetailsRepository
import com.alaa.currencyconverter.core.states.DataState
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ConversionsDetailsRepositoryImpl
@Inject constructor(private val historyConversionDao: HistoryConversionDao) :
    ConversionsDetailsRepository {
    override suspend fun fetchConversions(): DataState<List<HistoryConversionData.HistoryConversionItem>> =
        try {
            val conversionItems = historyConversionDao.getAllConversions()
            DataState.Success(historyConversionDao.getAllConversions())
        } catch (exception: Exception) {
            DataState.Error(exception)
        }
}