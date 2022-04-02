package com.alaa.currencyconverter.conversions_details.domain.usecases

import com.alaa.currencyconverter.common_data.data.model.HistoryConversionHeader
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionItem
import com.alaa.currencyconverter.common_data.data.model.HistoryData
import com.alaa.currencyconverter.conversions_details.domain.repository.ConversionsDetailsRepository
import com.alaa.currencyconverter.core.states.DataState
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class GetConversionsCase
@Inject constructor(private val repository: ConversionsDetailsRepository) {
    suspend operator fun invoke() = try {
        DataState.Success(sectionByDays(repository.fetchConversions()))
    } catch (exception: Exception) {
        DataState.Error(exception)
    }

    private fun sectionByDays(conversionItems: List<HistoryConversionItem>): List<HistoryData> {
        val allDataList = mutableListOf<HistoryData>()
        for (item in conversionItems) {
            if (isWithinThreeDays(item.timestamp)) {
                addHeader(item, allDataList)
                allDataList.add(item)
            }
        }
        return allDataList.toList()
    }

    private fun addHeader(item: HistoryConversionItem, allDataList: MutableList<HistoryData>) {
        val historyConversionHeader = HistoryConversionHeader(dayOfWeek(item.timestamp))
        if (!allDataList.contains(historyConversionHeader)) allDataList.add(historyConversionHeader)
    }

    fun isWithinThreeDays(timestamp: Long): Boolean {
        val itemDate = Date(timestamp)
        val difference = Date().time.minus(itemDate.time)
        val toDays = TimeUnit.MILLISECONDS.toDays(difference)
        return toDays <= 3
    }

    private fun dayOfWeek(timestamp: Long): String {
        val formatter = SimpleDateFormat("EEEE", Locale.US)
        return formatter.format(Date(timestamp))
    }
}