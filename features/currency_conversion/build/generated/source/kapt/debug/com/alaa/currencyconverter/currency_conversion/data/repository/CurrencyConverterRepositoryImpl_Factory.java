package com.alaa.currencyconverter.currency_conversion.data.repository;

import com.alaa.currencyconverter.currency_conversion.data.client.CurrencyConverterClient;
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
public final class CurrencyConverterRepositoryImpl_Factory implements Factory<CurrencyConverterRepositoryImpl> {
  private final Provider<CurrencyConverterClient> clientProvider;

  public CurrencyConverterRepositoryImpl_Factory(Provider<CurrencyConverterClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public CurrencyConverterRepositoryImpl get() {
    return newInstance(clientProvider.get());
  }

  public static CurrencyConverterRepositoryImpl_Factory create(
      Provider<CurrencyConverterClient> clientProvider) {
    return new CurrencyConverterRepositoryImpl_Factory(clientProvider);
  }

  public static CurrencyConverterRepositoryImpl newInstance(CurrencyConverterClient client) {
    return new CurrencyConverterRepositoryImpl(client);
  }
}
