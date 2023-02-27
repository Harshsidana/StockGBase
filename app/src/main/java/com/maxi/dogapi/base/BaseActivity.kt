package com.maxi.dogapi.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.reflect.ParameterizedType

abstract class BaseActivity<VM : ViewModel, B : ViewDataBinding>(val bindingFactory: (LayoutInflater) -> B) : AppCompatActivity() {

     lateinit var viewModel: VM
     lateinit var binding: B


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(getViewModelClass())
        binding = bindingFactory(layoutInflater)
        setContentView(binding.root)
        binding = getViewBinding()
    }

    private fun getViewModelClass(): Class<VM> {
        val type = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0]
        return type as Class<VM>
    }

     private fun getViewBinding():B{
        return binding
    }

}