package com.alaa.currencyconverter.conversions_details.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionData
import com.alaa.currencyconverter.conversions_details.domain.usecases.GetConversionsCase
import com.alaa.currencyconverter.core.states.DataState
import com.alaa.currencyconverter.core.states.DataState.Success
import com.alaa.currencyconverter.core.states.ViewState.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ConversionsViewModel
@Inject constructor(private val getConversionsCase: GetConversionsCase) : ViewModel() {

    private val _conversionsData =
        MutableStateFlow<DataState<List<HistoryConversionData.HistoryConversionItem>>>(Success(listOf()))
    val conversionsData = _conversionsData.asStateFlow()

    private val _viewState = MutableStateFlow(LOADING)
    val viewState = _viewState.asStateFlow()

    init {
        fetchConversions()
    }

    fun fetchConversions() = viewModelScope.launch {
        _viewState.value = LOADING

        val conversionData = getConversionsCase()
        _conversionsData.value = conversionData

        if (conversionData is Success) _viewState.value = SHOW_CONTENT
        else _viewState.value = SHOW_ERROR
    }
}