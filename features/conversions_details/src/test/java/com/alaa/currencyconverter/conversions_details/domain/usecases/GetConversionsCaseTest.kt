package com.alaa.currencyconverter.conversions_details.domain.usecases

import com.alaa.currencyconverter.conversions_details.domain.repository.ConversionsDetailsRepository
import io.mockk.mockk
import org.junit.Test
import java.util.*

class GetConversionsCaseTest {

    private val mockRepository = mockk<ConversionsDetailsRepository>()

    private val getConversionsCase = GetConversionsCase(mockRepository)

    @Test
    fun isWithinThreeDysWithOneDaysBefore() {
        // Given
        val calendar = Calendar.getInstance()
        calendar.time = Date()

        calendar.add(Calendar.DATE, -1)
        val twoDayBefore = calendar.time

        // When
        val result = getConversionsCase.isWithinThreeDays(twoDayBefore.time)

        // Then
        assert(result)
    }

    @Test
    fun isWithinThreeDysWithTwoDaysBefore() {
        // Given
        val calendar = Calendar.getInstance()
        calendar.time = Date()

        calendar.add(Calendar.DATE, -2)
        val twoDayBefore = calendar.time

        // When
        val result = getConversionsCase.isWithinThreeDays(twoDayBefore.time)

        // Then
        assert(result)
    }

    @Test
    fun isWithinThreeDysWithThreeDaysBefore() {
        // Given
        val calendar = Calendar.getInstance()
        calendar.time = Date()

        calendar.add(Calendar.DATE, -3)
        val twoDayBefore = calendar.time

        // When
        val result = getConversionsCase.isWithinThreeDays(twoDayBefore.time)

        // Then
        assert(result)
    }

    @Test
    fun isWithinThreeDysWithFourDaysBefore() {
        // Given
        val calendar = Calendar.getInstance()
        calendar.time = Date()

        calendar.add(Calendar.DATE, -4)
        val twoDayBefore = calendar.time

        // When
        val result = getConversionsCase.isWithinThreeDays(twoDayBefore.time)

        // Then
        assert(!result)
    }
}