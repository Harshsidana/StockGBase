package com.maxi.dogapi

import android.app.Application
import com.maxi.dogapi.interceptor.WifiService
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DogApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        WifiService.instance.initializeWithApplicationContext(this)
    }

}