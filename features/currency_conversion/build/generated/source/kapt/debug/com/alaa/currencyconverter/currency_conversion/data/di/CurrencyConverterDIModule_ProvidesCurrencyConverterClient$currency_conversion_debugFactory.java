package com.alaa.currencyconverter.currency_conversion.data.di;

import com.alaa.currencyconverter.currency_conversion.data.client.CurrencyConverterClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class CurrencyConverterDIModule_ProvidesCurrencyConverterClient$currency_conversion_debugFactory implements Factory<CurrencyConverterClient> {
  private final CurrencyConverterDIModule module;

  private final Provider<Retrofit> retrofitProvider;

  public CurrencyConverterDIModule_ProvidesCurrencyConverterClient$currency_conversion_debugFactory(
      CurrencyConverterDIModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CurrencyConverterClient get() {
    return providesCurrencyConverterClient$currency_conversion_debug(module, retrofitProvider.get());
  }

  public static CurrencyConverterDIModule_ProvidesCurrencyConverterClient$currency_conversion_debugFactory create(
      CurrencyConverterDIModule module, Provider<Retrofit> retrofitProvider) {
    return new CurrencyConverterDIModule_ProvidesCurrencyConverterClient$currency_conversion_debugFactory(module, retrofitProvider);
  }

  public static CurrencyConverterClient providesCurrencyConverterClient$currency_conversion_debug(
      CurrencyConverterDIModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesCurrencyConverterClient$currency_conversion_debug(retrofit));
  }
}
