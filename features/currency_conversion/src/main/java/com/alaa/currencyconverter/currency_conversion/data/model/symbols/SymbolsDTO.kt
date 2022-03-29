package com.alaa.currencyconverter.currency_conversion.data.model.symbols

import com.alaa.currencyconverter.currency_conversion.domain.model.Symbols
import com.google.gson.annotations.SerializedName

data class SymbolsDTO(
    @SerializedName("success")
    val success: Boolean? = false,
    @SerializedName("symbols")
    val symbolsObject: SymbolsObject? = SymbolsObject()
)

fun SymbolsDTO.toDomainModel() = Symbols(
    symbolsList = getSymbolsList(symbolsObject),
    currenciesList = getSymbolsList(symbolsObject).map { it.abv })