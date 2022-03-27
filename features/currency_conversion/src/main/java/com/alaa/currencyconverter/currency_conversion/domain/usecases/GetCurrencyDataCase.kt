package com.alaa.currencyconverter.currency_conversion.domain.usecases

import com.alaa.currencyconverter.currency_conversion.domain.repository.CurrencyConverterRepository
import javax.inject.Inject

class GetCurrencyDataCase
@Inject constructor(private val repository: CurrencyConverterRepository){
    suspend operator fun invoke() = repository.fetchCurrencyData()
}