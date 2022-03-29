package com.alaa.currencyconverter.currency_conversion.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0014\u0010\u001a\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016J\u0012\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0016\u0010%\u001a\u00020\u00172\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\'H\u0002J\u0016\u0010(\u001a\u00020\u00172\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\'H\u0002J\u0018\u0010)\u001a\u00020\u00172\u000e\u0010\u001b\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0002J\u0016\u0010*\u001a\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170,H\u0002J\u0012\u0010-\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0014\u00100\u001a\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u00020/0,R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012\u00a8\u00061"}, d2 = {"Lcom/alaa/currencyconverter/currency_conversion/ui/CurrencyConversionFragment;", "Lcom/alaa/currencyconverter/core/base/BaseFragment;", "Lcom/alaa/currencyconverter/currency_conversion/databinding/FragmentCurrencyConversionBinding;", "Lcom/alaa/currencyconverter/currency_conversion/ui/CurrencyConversionCallback;", "()V", "binding", "conversionViewModel", "Lcom/alaa/currencyconverter/currency_conversion/ui/ConversionViewModel;", "getConversionViewModel", "()Lcom/alaa/currencyconverter/currency_conversion/ui/ConversionViewModel;", "conversionViewModel$delegate", "Lkotlin/Lazy;", "currenciesAdapter", "Landroid/widget/ArrayAdapter;", "", "viewModel", "Lcom/alaa/currencyconverter/currency_conversion/ui/CurrencyConverterViewModel;", "getViewModel", "()Lcom/alaa/currencyconverter/currency_conversion/ui/CurrencyConverterViewModel;", "viewModel$delegate", "getLayoutResourceId", "", "initView", "", "invertCurrencies", "onBindData", "onConversionFail", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onConversionSuccess", "fromAmount", "", "toAmount", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupCurrenciesAdapter", "currenciesList", "", "setupCurrenciesListeners", "updateErrorUI", "updateSaveConversionUI", "dataState", "Lcom/alaa/currencyconverter/core/states/DataState;", "updateSuccessUI", "currencyData", "Lcom/alaa/currencyconverter/currency_conversion/domain/model/CurrencyData;", "updateUI", "currency_conversion_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CurrencyConversionFragment extends com.alaa.currencyconverter.core.base.BaseFragment<com.alaa.currencyconverter.currency_conversion.databinding.FragmentCurrencyConversionBinding> implements com.alaa.currencyconverter.currency_conversion.ui.CurrencyConversionCallback {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy conversionViewModel$delegate = null;
    private com.alaa.currencyconverter.currency_conversion.databinding.FragmentCurrencyConversionBinding binding;
    private android.widget.ArrayAdapter<java.lang.String> currenciesAdapter;
    
    public CurrencyConversionFragment() {
        super();
    }
    
    private final com.alaa.currencyconverter.currency_conversion.ui.CurrencyConverterViewModel getViewModel() {
        return null;
    }
    
    private final com.alaa.currencyconverter.currency_conversion.ui.ConversionViewModel getConversionViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutResourceId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindData(@org.jetbrains.annotations.NotNull()
    com.alaa.currencyconverter.currency_conversion.databinding.FragmentCurrencyConversionBinding binding) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    public final void updateUI(@org.jetbrains.annotations.NotNull()
    com.alaa.currencyconverter.core.states.DataState<com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData> dataState) {
    }
    
    private final void updateSuccessUI(com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData currencyData) {
    }
    
    private final void updateErrorUI(java.lang.Exception exception) {
    }
    
    private final void setupCurrenciesAdapter(java.util.List<java.lang.String> currenciesList) {
    }
    
    private final void setupCurrenciesListeners(java.util.List<java.lang.String> currenciesList) {
    }
    
    public final void invertCurrencies() {
    }
    
    @java.lang.Override()
    public void onConversionSuccess(double fromAmount, double toAmount) {
    }
    
    @java.lang.Override()
    public void onConversionFail(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception) {
    }
    
    private final void updateSaveConversionUI(com.alaa.currencyconverter.core.states.DataState<kotlin.Unit> dataState) {
    }
}