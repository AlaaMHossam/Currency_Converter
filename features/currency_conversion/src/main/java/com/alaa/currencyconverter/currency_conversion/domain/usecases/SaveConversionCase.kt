package com.alaa.currencyconverter.currency_conversion.domain.usecases

import com.alaa.currencyconverter.common_data.data.model.HistoryConversionItem
import com.alaa.currencyconverter.currency_conversion.domain.repository.CurrencyConverterRepository
import javax.inject.Inject

class SaveConversionCase
@Inject constructor(private val repository: CurrencyConverterRepository) {
    suspend operator fun invoke(historyConversionItem: HistoryConversionItem) =
        repository.saveConversion(historyConversionItem)
}