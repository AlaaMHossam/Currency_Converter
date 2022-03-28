package com.alaa.currencyconverter.currency_conversion.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/alaa/currencyconverter/currency_conversion/ui/CurrencyConverterViewModel;", "Landroidx/lifecycle/ViewModel;", "getCurrencyDataCase", "Lcom/alaa/currencyconverter/currency_conversion/domain/usecases/GetCurrencyDataCase;", "(Lcom/alaa/currencyconverter/currency_conversion/domain/usecases/GetCurrencyDataCase;)V", "_currencyData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/alaa/currencyconverter/core/states/DataState;", "Lcom/alaa/currencyconverter/currency_conversion/domain/model/CurrencyData;", "_viewState", "Lcom/alaa/currencyconverter/core/states/ViewState;", "currencyData", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrencyData", "()Lkotlinx/coroutines/flow/StateFlow;", "viewSate", "getViewSate", "fetchData", "Lkotlinx/coroutines/Job;", "currency_conversion_debug"})
public final class CurrencyConverterViewModel extends androidx.lifecycle.ViewModel {
    private final com.alaa.currencyconverter.currency_conversion.domain.usecases.GetCurrencyDataCase getCurrencyDataCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.alaa.currencyconverter.core.states.ViewState> _viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.alaa.currencyconverter.core.states.ViewState> viewSate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.alaa.currencyconverter.core.states.DataState<com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData>> _currencyData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.alaa.currencyconverter.core.states.DataState<com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData>> currencyData = null;
    
    @javax.inject.Inject()
    public CurrencyConverterViewModel(@org.jetbrains.annotations.NotNull()
    com.alaa.currencyconverter.currency_conversion.domain.usecases.GetCurrencyDataCase getCurrencyDataCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.alaa.currencyconverter.core.states.ViewState> getViewSate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.alaa.currencyconverter.core.states.DataState<com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData>> getCurrencyData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job fetchData() {
        return null;
    }
}