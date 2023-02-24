package com.maxi.dogapi.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.view.View

object Utils {

    fun setVisibility(visibility: Int, vararg views: View?) {
        for (view in views) {
            view?.visibility = visibility
        }
    }

}