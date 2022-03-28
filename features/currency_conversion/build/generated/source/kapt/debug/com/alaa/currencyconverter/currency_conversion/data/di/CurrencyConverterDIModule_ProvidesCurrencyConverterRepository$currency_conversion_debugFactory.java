package com.alaa.currencyconverter.currency_conversion.data.di;

import com.alaa.currencyconverter.currency_conversion.data.repository.CurrencyConverterRepositoryImpl;
import com.alaa.currencyconverter.currency_conversion.domain.repository.CurrencyConverterRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class CurrencyConverterDIModule_ProvidesCurrencyConverterRepository$currency_conversion_debugFactory implements Factory<CurrencyConverterRepository> {
  private final CurrencyConverterDIModule module;

  private final Provider<CurrencyConverterRepositoryImpl> currencyConverterRepositoryImplProvider;

  public CurrencyConverterDIModule_ProvidesCurrencyConverterRepository$currency_conversion_debugFactory(
      CurrencyConverterDIModule module,
      Provider<CurrencyConverterRepositoryImpl> currencyConverterRepositoryImplProvider) {
    this.module = module;
    this.currencyConverterRepositoryImplProvider = currencyConverterRepositoryImplProvider;
  }

  @Override
  public CurrencyConverterRepository get() {
    return providesCurrencyConverterRepository$currency_conversion_debug(module, currencyConverterRepositoryImplProvider.get());
  }

  public static CurrencyConverterDIModule_ProvidesCurrencyConverterRepository$currency_conversion_debugFactory create(
      CurrencyConverterDIModule module,
      Provider<CurrencyConverterRepositoryImpl> currencyConverterRepositoryImplProvider) {
    return new CurrencyConverterDIModule_ProvidesCurrencyConverterRepository$currency_conversion_debugFactory(module, currencyConverterRepositoryImplProvider);
  }

  public static CurrencyConverterRepository providesCurrencyConverterRepository$currency_conversion_debug(
      CurrencyConverterDIModule instance,
      CurrencyConverterRepositoryImpl CurrencyConverterRepositoryImpl) {
    return Preconditions.checkNotNullFromProvides(instance.providesCurrencyConverterRepository$currency_conversion_debug(CurrencyConverterRepositoryImpl));
  }
}
