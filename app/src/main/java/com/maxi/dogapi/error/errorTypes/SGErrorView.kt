package com.maxi.dogapi.error.errorTypes

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.maxi.dogapi.databinding.ErrorViewBinding

class SGErrorView(context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {
    private var  binding:ErrorViewBinding
    init {
        binding = ErrorViewBinding.inflate(LayoutInflater.from(context), this, true)
    }

    fun setData(error: String = "", description: String = "Description") {
        binding.errorText.text = error
        binding.errorDescription.text = description
    }

}