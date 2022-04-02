package com.alaa.currencyconverter.conversions_details.domain.usecases

import com.alaa.currencyconverter.common_data.data.model.HistoryConversionHeader
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionItem
import com.alaa.currencyconverter.common_data.data.model.HistoryData
import com.alaa.currencyconverter.conversions_details.domain.repository.ConversionsDetailsRepository
import io.mockk.mockk
import org.junit.Test
import java.util.*

class GetConversionsCaseTest {

    private val mockRepository = mockk<ConversionsDetailsRepository>()

    private val getConversionsCase = GetConversionsCase(mockRepository)

    @Test
    fun addHeaderAddsHeaderItem() {
        // Given
        val dateTimestamp = 1648844899000
        val historyConversionItem =
            HistoryConversionItem(0, "", 0.0, "", 0.0, dateTimestamp)
        val allDataList = mutableListOf<HistoryData>()
        val historyHeader = HistoryConversionHeader(getConversionsCase.dayOfWeek(dateTimestamp))

        // When
        getConversionsCase.addHeader(historyConversionItem, allDataList)

        // Then
        assert(allDataList.contains(historyHeader))
    }

    @Test
    fun isWithinThreeDays() {
        for (i in 1..3) {
            // Given
            val calendar = Calendar.getInstance()

            // When
            calendar.add(Calendar.DATE, -i)
            val result = getConversionsCase.isWithinThreeDays(calendar.time.time)

            // Then
            assert(result)
        }
    }

    @Test
    fun isMoreThanThreeDays() {
        // Given
        val calendar = Calendar.getInstance()

        // When
        calendar.add(Calendar.DATE, -4)
        val result = getConversionsCase.isWithinThreeDays(calendar.time.time)

        // Then
        assert(!result)
    }

    @Test
    fun dayOfWeekIsCorrect() {
        // Given
        val fridayTimestamp = 1648844899000

        // When
        val result = getConversionsCase.dayOfWeek(fridayTimestamp)

        // Then
        assert(result == "Friday")
    }
}