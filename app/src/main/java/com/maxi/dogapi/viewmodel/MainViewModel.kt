package com.maxi.dogapi.viewmodel

import android.app.Application
import android.content.Context
import android.graphics.Bitmap
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import androidx.lifecycle.*
import com.maxi.dogapi.data.Repository
import com.maxi.dogapi.model.DogResponse
import com.maxi.dogapi.utils.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.io.File
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor
    (
    private val repository: Repository,
    application: Application
) : AndroidViewModel(application) {

    fun fetchDogResponse():LiveData<NetworkResult<DogResponse>> = liveData{
        emit(NetworkResult.Loading())
        val result=repository.getDog()
        emit(result)
    }






}