package com.alaa.currencyconverter.data.model.symbols

import com.google.gson.annotations.SerializedName

data class SymbolsDTO(
    @SerializedName("success")
    val success: Boolean? = false,
    @SerializedName("symbols")
    val symbols: Symbols? = Symbols(),
    val symbolsList : List<Symbol>? = symbolsList()
)