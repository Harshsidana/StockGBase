// Generated by Dagger (https://dagger.dev).
package com.maxi.dogapi.di;

import com.maxi.dogapi.data.remote.DogService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideCurrencyServiceFactory implements Factory<DogService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideCurrencyServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public DogService get() {
    return provideCurrencyService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideCurrencyServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideCurrencyServiceFactory(retrofitProvider);
  }

  public static DogService provideCurrencyService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideCurrencyService(retrofit));
  }
}