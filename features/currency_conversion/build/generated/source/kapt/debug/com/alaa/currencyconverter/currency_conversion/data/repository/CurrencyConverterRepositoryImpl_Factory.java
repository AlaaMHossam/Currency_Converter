package com.alaa.currencyconverter.currency_conversion.data.repository;

import com.alaa.currencyconverter.common_data.data.model.HistoryConversionDao;
import com.alaa.currencyconverter.currency_conversion.data.client.CurrencyConverterClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class CurrencyConverterRepositoryImpl_Factory implements Factory<CurrencyConverterRepositoryImpl> {
  private final Provider<CurrencyConverterClient> clientProvider;

  private final Provider<HistoryConversionDao> historyConversionDaoProvider;

  public CurrencyConverterRepositoryImpl_Factory(Provider<CurrencyConverterClient> clientProvider,
      Provider<HistoryConversionDao> historyConversionDaoProvider) {
    this.clientProvider = clientProvider;
    this.historyConversionDaoProvider = historyConversionDaoProvider;
  }

  @Override
  public CurrencyConverterRepositoryImpl get() {
    return newInstance(clientProvider.get(), historyConversionDaoProvider.get());
  }

  public static CurrencyConverterRepositoryImpl_Factory create(
      Provider<CurrencyConverterClient> clientProvider,
      Provider<HistoryConversionDao> historyConversionDaoProvider) {
    return new CurrencyConverterRepositoryImpl_Factory(clientProvider, historyConversionDaoProvider);
  }

  public static CurrencyConverterRepositoryImpl newInstance(CurrencyConverterClient client,
      HistoryConversionDao historyConversionDao) {
    return new CurrencyConverterRepositoryImpl(client, historyConversionDao);
  }
}
