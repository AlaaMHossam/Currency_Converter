package com.alaa.currencyconverter.currency_conversion.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/alaa/currencyconverter/currency_conversion/ui/ConversionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "calculateRatesCase", "Lcom/alaa/currencyconverter/currency_conversion/domain/usecases/CalculateRatesCase;", "currencyData", "Lcom/alaa/currencyconverter/currency_conversion/domain/model/CurrencyData;", "getCurrencyData", "()Lcom/alaa/currencyconverter/currency_conversion/domain/model/CurrencyData;", "setCurrencyData", "(Lcom/alaa/currencyconverter/currency_conversion/domain/model/CurrencyData;)V", "fromAmount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getFromAmount", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "fromRate", "", "toAmount", "getToAmount", "toRate", "calculateCurrency", "", "getAmount", "selectedCurrencyAbv", "setFromRate", "setToRate", "currency_conversion_debug"})
public final class ConversionViewModel extends androidx.lifecycle.ViewModel {
    private final com.alaa.currencyconverter.currency_conversion.domain.usecases.CalculateRatesCase calculateRatesCase = null;
    @org.jetbrains.annotations.Nullable()
    private com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData currencyData;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> fromAmount = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> toAmount = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> fromRate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> toRate = null;
    
    public ConversionViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData getCurrencyData() {
        return null;
    }
    
    public final void setCurrencyData(@org.jetbrains.annotations.Nullable()
    com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getFromAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getToAmount() {
        return null;
    }
    
    public final void setFromRate(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedCurrencyAbv) {
    }
    
    public final void setToRate(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedCurrencyAbv) {
    }
    
    private final double getAmount(java.lang.String selectedCurrencyAbv) {
        return 0.0;
    }
    
    public final void calculateCurrency() {
    }
}