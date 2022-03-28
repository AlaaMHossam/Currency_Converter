package com.alaa.currencyconverter.currency_conversion.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrencyConverterViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static CurrencyConverterViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(CurrencyConverterViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final CurrencyConverterViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new CurrencyConverterViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
