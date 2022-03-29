package com.alaa.currencyconverter.currency_conversion.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionItem
import com.alaa.currencyconverter.core.states.DataState
import com.alaa.currencyconverter.core.states.DataState.Success
import com.alaa.currencyconverter.core.states.ViewState.*
import com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData
import com.alaa.currencyconverter.currency_conversion.domain.usecases.CalculateRatesCase
import com.alaa.currencyconverter.currency_conversion.domain.usecases.GetCurrencyDataCase
import com.alaa.currencyconverter.currency_conversion.domain.usecases.SaveConversionCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@HiltViewModel
class CurrencyConverterViewModel
@Inject constructor(
    private val getCurrencyDataCase: GetCurrencyDataCase,
    private val saveConversionCase: SaveConversionCase
) : ViewModel() {

    private val _viewState = MutableStateFlow(LOADING)
    val viewSate = _viewState.asStateFlow()

    private val _currencyData = MutableStateFlow<DataState<CurrencyData>>(
        Success(CurrencyData(false, listOf(), listOf(), listOf()))
    )
    val currencyData = _currencyData.asStateFlow()

    private val _saveConversionData = MutableSharedFlow<DataState<Unit>>()
    val saveConversionData = _saveConversionData.asSharedFlow()

    init {
        fetchData()
    }

    fun fetchData() = viewModelScope.launch {
        _viewState.value = LOADING

        val currencyData = getCurrencyDataCase()
        _currencyData.emit(currencyData)

        if (currencyData is Success) _viewState.value = SHOW_CONTENT
        else _viewState.value = SHOW_ERROR
    }

    fun saveConversion(
        fromCurrency: String,
        fromAmount: Double,
        toCurrency: String,
        toAmount: Double
    ) = viewModelScope.launch {
        val timestamp = Calendar.getInstance().timeInMillis
        val historyConversionItem =
            HistoryConversionItem(0, fromCurrency, fromAmount, toCurrency, toAmount, timestamp)

        val saveConversionResult = saveConversionCase(historyConversionItem)
        _saveConversionData.emit(saveConversionResult)
    }
}