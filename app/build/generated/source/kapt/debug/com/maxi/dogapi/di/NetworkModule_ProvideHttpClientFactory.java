// Generated by Dagger (https://dagger.dev).
package com.maxi.dogapi.di;

import com.maxi.dogapi.interceptor.NetworkInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<NetworkInterceptor> networkInterceptorProvider;

  public NetworkModule_ProvideHttpClientFactory(
      Provider<NetworkInterceptor> networkInterceptorProvider) {
    this.networkInterceptorProvider = networkInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideHttpClient(networkInterceptorProvider.get());
  }

  public static NetworkModule_ProvideHttpClientFactory create(
      Provider<NetworkInterceptor> networkInterceptorProvider) {
    return new NetworkModule_ProvideHttpClientFactory(networkInterceptorProvider);
  }

  public static OkHttpClient provideHttpClient(NetworkInterceptor networkInterceptor) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideHttpClient(networkInterceptor));
  }
}
