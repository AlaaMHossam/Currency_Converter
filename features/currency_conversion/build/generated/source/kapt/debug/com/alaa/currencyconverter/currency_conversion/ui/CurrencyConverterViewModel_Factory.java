package com.alaa.currencyconverter.currency_conversion.ui;

import com.alaa.currencyconverter.currency_conversion.domain.usecases.GetCurrencyDataCase;
import com.alaa.currencyconverter.currency_conversion.domain.usecases.SaveConversionCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrencyConverterViewModel_Factory implements Factory<CurrencyConverterViewModel> {
  private final Provider<GetCurrencyDataCase> getCurrencyDataCaseProvider;

  private final Provider<SaveConversionCase> saveConversionCaseProvider;

  public CurrencyConverterViewModel_Factory(
      Provider<GetCurrencyDataCase> getCurrencyDataCaseProvider,
      Provider<SaveConversionCase> saveConversionCaseProvider) {
    this.getCurrencyDataCaseProvider = getCurrencyDataCaseProvider;
    this.saveConversionCaseProvider = saveConversionCaseProvider;
  }

  @Override
  public CurrencyConverterViewModel get() {
    return newInstance(getCurrencyDataCaseProvider.get(), saveConversionCaseProvider.get());
  }

  public static CurrencyConverterViewModel_Factory create(
      Provider<GetCurrencyDataCase> getCurrencyDataCaseProvider,
      Provider<SaveConversionCase> saveConversionCaseProvider) {
    return new CurrencyConverterViewModel_Factory(getCurrencyDataCaseProvider, saveConversionCaseProvider);
  }

  public static CurrencyConverterViewModel newInstance(GetCurrencyDataCase getCurrencyDataCase,
      SaveConversionCase saveConversionCase) {
    return new CurrencyConverterViewModel(getCurrencyDataCase, saveConversionCase);
  }
}
