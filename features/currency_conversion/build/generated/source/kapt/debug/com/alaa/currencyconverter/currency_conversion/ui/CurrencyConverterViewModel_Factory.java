package com.alaa.currencyconverter.currency_conversion.ui;

import com.alaa.currencyconverter.currency_conversion.domain.usecases.GetCurrencyDataCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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

  public CurrencyConverterViewModel_Factory(
      Provider<GetCurrencyDataCase> getCurrencyDataCaseProvider) {
    this.getCurrencyDataCaseProvider = getCurrencyDataCaseProvider;
  }

  @Override
  public CurrencyConverterViewModel get() {
    return newInstance(getCurrencyDataCaseProvider.get());
  }

  public static CurrencyConverterViewModel_Factory create(
      Provider<GetCurrencyDataCase> getCurrencyDataCaseProvider) {
    return new CurrencyConverterViewModel_Factory(getCurrencyDataCaseProvider);
  }

  public static CurrencyConverterViewModel newInstance(GetCurrencyDataCase getCurrencyDataCase) {
    return new CurrencyConverterViewModel(getCurrencyDataCase);
  }
}
