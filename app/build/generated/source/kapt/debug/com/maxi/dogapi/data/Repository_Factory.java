// Generated by Dagger (https://dagger.dev).
package com.maxi.dogapi.data;

import com.maxi.dogapi.data.remote.RemoteDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  public Repository_Factory(Provider<RemoteDataSource> remoteDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public Repository get() {
    return newInstance(remoteDataSourceProvider.get());
  }

  public static Repository_Factory create(Provider<RemoteDataSource> remoteDataSourceProvider) {
    return new Repository_Factory(remoteDataSourceProvider);
  }

  public static Repository newInstance(RemoteDataSource remoteDataSource) {
    return new Repository(remoteDataSource);
  }
}
