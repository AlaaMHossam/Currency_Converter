package com.alaa.currencyconverter.currency_conversion.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/alaa/currencyconverter/currency_conversion/domain/model/CurrencyData;", "", "success", "", "symbolsList", "", "Lcom/alaa/currencyconverter/currency_conversion/data/model/symbols/Symbol;", "currenciesList", "", "ratesList", "Lcom/alaa/currencyconverter/currency_conversion/data/model/rates/Rate;", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCurrenciesList", "()Ljava/util/List;", "getRatesList", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSymbolsList", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/alaa/currencyconverter/currency_conversion/domain/model/CurrencyData;", "equals", "other", "hashCode", "", "toString", "currency_conversion_debug"})
public final class CurrencyData {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean success = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.alaa.currencyconverter.currency_conversion.data.model.symbols.Symbol> symbolsList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> currenciesList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.alaa.currencyconverter.currency_conversion.data.model.rates.Rate> ratesList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData copy(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean success, @org.jetbrains.annotations.NotNull()
    java.util.List<com.alaa.currencyconverter.currency_conversion.data.model.symbols.Symbol> symbolsList, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> currenciesList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.alaa.currencyconverter.currency_conversion.data.model.rates.Rate> ratesList) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CurrencyData(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean success, @org.jetbrains.annotations.NotNull()
    java.util.List<com.alaa.currencyconverter.currency_conversion.data.model.symbols.Symbol> symbolsList, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> currenciesList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.alaa.currencyconverter.currency_conversion.data.model.rates.Rate> ratesList) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.alaa.currencyconverter.currency_conversion.data.model.symbols.Symbol> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.alaa.currencyconverter.currency_conversion.data.model.symbols.Symbol> getSymbolsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCurrenciesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.alaa.currencyconverter.currency_conversion.data.model.rates.Rate> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.alaa.currencyconverter.currency_conversion.data.model.rates.Rate> getRatesList() {
        return null;
    }
}