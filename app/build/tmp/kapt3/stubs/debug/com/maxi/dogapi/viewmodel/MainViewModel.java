package com.maxi.dogapi.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/maxi/dogapi/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "repository", "Lcom/maxi/dogapi/data/Repository;", "application", "Landroid/app/Application;", "(Lcom/maxi/dogapi/data/Repository;Landroid/app/Application;)V", "_response", "Landroidx/lifecycle/MutableLiveData;", "Lcom/maxi/dogapi/utils/NetworkResult;", "Lcom/maxi/dogapi/model/DogResponse;", "response", "Landroidx/lifecycle/LiveData;", "getResponse", "()Landroidx/lifecycle/LiveData;", "fetchDogResponse", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<com.maxi.dogapi.utils.NetworkResult<com.maxi.dogapi.model.DogResponse>> _response = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.maxi.dogapi.utils.NetworkResult<com.maxi.dogapi.model.DogResponse>> response = null;
    private final com.maxi.dogapi.data.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maxi.dogapi.utils.NetworkResult<com.maxi.dogapi.model.DogResponse>> getResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job fetchDogResponse() {
        return null;
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.maxi.dogapi.data.Repository repository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}