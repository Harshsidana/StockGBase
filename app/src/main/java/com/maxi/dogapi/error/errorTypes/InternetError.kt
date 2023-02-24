package com.maxi.dogapi.error.errorTypes

import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.maxi.dogapi.error.ErrorViewWithWarning
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize

@Parcelize
class InternetError(private val showWarning: Boolean) : ErrorViewWithWarning {

    @IgnoredOnParcel
    override var warning: Snackbar? = null

    override fun setupView(erroView: SGErrorView) {
        erroView.setData("Internet Error","Internet Error description")
        if (showWarning) {
            showWarning(erroView)
        }
    }

    override fun showWarning(root: View) {
        warning = Snackbar.make(root, "Internet error!", Snackbar.LENGTH_SHORT)
        warning?.show()
    }

    override fun dismissWarning() {
        warning?.dismiss()
        warning = null
    }
}