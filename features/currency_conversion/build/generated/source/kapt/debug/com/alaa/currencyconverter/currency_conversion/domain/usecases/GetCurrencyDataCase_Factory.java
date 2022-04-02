package com.alaa.currencyconverter.currency_conversion.domain.usecases;

import com.alaa.currencyconverter.currency_conversion.domain.repository.CurrencyConverterRepository;
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
public final class GetCurrencyDataCase_Factory implements Factory<GetCurrencyDataCase> {
  private final Provider<CurrencyConverterRepository> repositoryProvider;

  public GetCurrencyDataCase_Factory(Provider<CurrencyConverterRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetCurrencyDataCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetCurrencyDataCase_Factory create(
      Provider<CurrencyConverterRepository> repositoryProvider) {
    return new GetCurrencyDataCase_Factory(repositoryProvider);
  }

  public static GetCurrencyDataCase newInstance(CurrencyConverterRepository repository) {
    return new GetCurrencyDataCase(repository);
  }
}
