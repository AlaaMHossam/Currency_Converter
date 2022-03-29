// Generated by data binding compiler. Do not edit!
package com.alaa.currencyconverter.currency_conversion.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.alaa.currencyconverter.currency_conversion.R;
import com.alaa.currencyconverter.currency_conversion.ui.ConversionViewModel;
import com.alaa.currencyconverter.currency_conversion.ui.CurrencyConversionFragment;
import com.alaa.currencyconverter.currency_conversion.ui.CurrencyConverterViewModel;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCurrencyConversionBinding extends ViewDataBinding {
  @NonNull
  public final MaterialAutoCompleteTextView actvFromCurrency;

  @NonNull
  public final MaterialAutoCompleteTextView actvToCurrency;

  @NonNull
  public final Button btnCurrencyConversionRetry;

  @NonNull
  public final Button btnMainDetails;

  @NonNull
  public final ConstraintLayout clMainData;

  @NonNull
  public final Guideline glMainHor30;

  @NonNull
  public final LayoutMainAmountsBinding includedAmounts;

  @NonNull
  public final ImageButton ivToCurrency;

  @NonNull
  public final ProgressBar pbMain;

  @NonNull
  public final TextInputLayout tilFromCurrency;

  @NonNull
  public final TextInputLayout tilToCurrency;

  @Bindable
  protected CurrencyConverterViewModel mViewModel;

  @Bindable
  protected ConversionViewModel mConversionViewModel;

  @Bindable
  protected CurrencyConversionFragment mFragment;

  protected FragmentCurrencyConversionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, MaterialAutoCompleteTextView actvFromCurrency,
      MaterialAutoCompleteTextView actvToCurrency, Button btnCurrencyConversionRetry,
      Button btnMainDetails, ConstraintLayout clMainData, Guideline glMainHor30,
      LayoutMainAmountsBinding includedAmounts, ImageButton ivToCurrency, ProgressBar pbMain,
      TextInputLayout tilFromCurrency, TextInputLayout tilToCurrency) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actvFromCurrency = actvFromCurrency;
    this.actvToCurrency = actvToCurrency;
    this.btnCurrencyConversionRetry = btnCurrencyConversionRetry;
    this.btnMainDetails = btnMainDetails;
    this.clMainData = clMainData;
    this.glMainHor30 = glMainHor30;
    this.includedAmounts = includedAmounts;
    this.ivToCurrency = ivToCurrency;
    this.pbMain = pbMain;
    this.tilFromCurrency = tilFromCurrency;
    this.tilToCurrency = tilToCurrency;
  }

  public abstract void setViewModel(@Nullable CurrencyConverterViewModel viewModel);

  @Nullable
  public CurrencyConverterViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setConversionViewModel(@Nullable ConversionViewModel conversionViewModel);

  @Nullable
  public ConversionViewModel getConversionViewModel() {
    return mConversionViewModel;
  }

  public abstract void setFragment(@Nullable CurrencyConversionFragment fragment);

  @Nullable
  public CurrencyConversionFragment getFragment() {
    return mFragment;
  }

  @NonNull
  public static FragmentCurrencyConversionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_currency_conversion, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCurrencyConversionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCurrencyConversionBinding>inflateInternal(inflater, R.layout.fragment_currency_conversion, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCurrencyConversionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_currency_conversion, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCurrencyConversionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCurrencyConversionBinding>inflateInternal(inflater, R.layout.fragment_currency_conversion, null, false, component);
  }

  public static FragmentCurrencyConversionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentCurrencyConversionBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentCurrencyConversionBinding)bind(component, view, R.layout.fragment_currency_conversion);
  }
}