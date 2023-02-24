package com.maxi.dogapi.error.errorTypes

import com.maxi.dogapi.error.ErrorView
import kotlinx.android.parcel.Parcelize

@Parcelize
class ServerError : ErrorView {
    override fun setupView(erroView: SGErrorView) {
        erroView.setData("Not Found error","Not found Error description")
    }

}