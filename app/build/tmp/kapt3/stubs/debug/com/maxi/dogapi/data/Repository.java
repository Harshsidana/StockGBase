package com.maxi.dogapi.data;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityRetainedScoped()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/maxi/dogapi/data/Repository;", "Lcom/maxi/dogapi/model/BaseApiResponse;", "remoteDataSource", "Lcom/maxi/dogapi/data/remote/RemoteDataSource;", "(Lcom/maxi/dogapi/data/remote/RemoteDataSource;)V", "getDog", "Lkotlinx/coroutines/flow/Flow;", "Lcom/maxi/dogapi/utils/NetworkResult;", "Lcom/maxi/dogapi/model/DogResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class Repository extends com.maxi.dogapi.model.BaseApiResponse {
    private final com.maxi.dogapi.data.remote.RemoteDataSource remoteDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDog(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.maxi.dogapi.utils.NetworkResult<com.maxi.dogapi.model.DogResponse>>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.maxi.dogapi.data.remote.RemoteDataSource remoteDataSource) {
        super();
    }
}