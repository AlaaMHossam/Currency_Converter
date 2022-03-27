package com.alaa.currencyconverter.currency_conversion.data.model.rates

import com.alaa.currencyconverter.currency_conversion.domain.model.Rates
import com.google.gson.annotations.SerializedName

data class RatesDTO(
    @SerializedName("base")
    val base: String? = "",
    @SerializedName("date")
    val date: String? = "",
    @SerializedName("rates")
    val ratesObject: RatesObject? = RatesObject(),
    @SerializedName("success")
    val success: Boolean? = false,
    @SerializedName("timestamp")
    val timestamp: Int? = 0
)

fun RatesDTO.toDomainModel() =
    Rates(success = success ?: false, ratesList = getRatesList(ratesObject))