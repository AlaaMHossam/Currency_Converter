package com.alaa.currencyconverter.conversions_details.domain.usecases

import com.alaa.currencyconverter.conversions_details.domain.repository.ConversionsDetailsRepository
import javax.inject.Inject

class GetConversionsCase
@Inject constructor(private val repository: ConversionsDetailsRepository) {
    suspend operator fun invoke() = repository.fetchConversions()
}