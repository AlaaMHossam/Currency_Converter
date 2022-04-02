package com.alaa.currencyconverter.currency_conversion.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u001bJ&\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020 R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013\u00a8\u0006#"}, d2 = {"Lcom/alaa/currencyconverter/currency_conversion/ui/CurrencyConverterViewModel;", "Landroidx/lifecycle/ViewModel;", "getCurrencyDataCase", "Lcom/alaa/currencyconverter/currency_conversion/domain/usecases/GetCurrencyDataCase;", "saveConversionCase", "Lcom/alaa/currencyconverter/currency_conversion/domain/usecases/SaveConversionCase;", "(Lcom/alaa/currencyconverter/currency_conversion/domain/usecases/GetCurrencyDataCase;Lcom/alaa/currencyconverter/currency_conversion/domain/usecases/SaveConversionCase;)V", "_currencyData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/alaa/currencyconverter/core/states/DataState;", "Lcom/alaa/currencyconverter/currency_conversion/domain/model/CurrencyData;", "_saveConversionData", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "_viewState", "Lcom/alaa/currencyconverter/core/states/ViewState;", "currencyData", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrencyData", "()Lkotlinx/coroutines/flow/StateFlow;", "saveConversionData", "Lkotlinx/coroutines/flow/SharedFlow;", "getSaveConversionData", "()Lkotlinx/coroutines/flow/SharedFlow;", "viewSate", "getViewSate", "fetchData", "Lkotlinx/coroutines/Job;", "saveConversion", "fromCurrency", "", "fromAmount", "", "toCurrency", "toAmount", "currency_conversion_debug"})
public final class CurrencyConverterViewModel extends androidx.lifecycle.ViewModel {
    private final com.alaa.currencyconverter.currency_conversion.domain.usecases.GetCurrencyDataCase getCurrencyDataCase = null;
    private final com.alaa.currencyconverter.currency_conversion.domain.usecases.SaveConversionCase saveConversionCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.alaa.currencyconverter.core.states.ViewState> _viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.alaa.currencyconverter.core.states.ViewState> viewSate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.alaa.currencyconverter.core.states.DataState<com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData>> _currencyData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.alaa.currencyconverter.core.states.DataState<com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData>> currencyData = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.alaa.currencyconverter.core.states.DataState<kotlin.Unit>> _saveConversionData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.alaa.currencyconverter.core.states.DataState<kotlin.Unit>> saveConversionData = null;
    
    @javax.inject.Inject()
    public CurrencyConverterViewModel(@org.jetbrains.annotations.NotNull()
    com.alaa.currencyconverter.currency_conversion.domain.usecases.GetCurrencyDataCase getCurrencyDataCase, @org.jetbrains.annotations.NotNull()
    com.alaa.currencyconverter.currency_conversion.domain.usecases.SaveConversionCase saveConversionCase) {
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
    public final kotlinx.coroutines.flow.SharedFlow<com.alaa.currencyconverter.core.states.DataState<kotlin.Unit>> getSaveConversionData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job fetchData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveConversion(@org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrency, double fromAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurrency, double toAmount) {
        return null;
    }
}