package com.maxi.dogapi.error

import android.os.Parcelable
import com.maxi.dogapi.error.errorTypes.SGErrorView

interface ErrorView : Parcelable {
    fun setupView(errorView: SGErrorView)
}