package com.maxi.dogapi

import android.os.Bundle
import android.view.View
import android.widget.Toast
import coil.load
import coil.transform.RoundedCornersTransformation
import com.maxi.dogapi.base.BaseActivity
import com.maxi.dogapi.databinding.ActivityMainBinding
import com.maxi.dogapi.utils.NetworkResult
import com.maxi.dogapi.utils.Utils.setVisibility
import com.maxi.dogapi.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity :
    BaseActivity<MainViewModel, ActivityMainBinding>(ActivityMainBinding::inflate) {

    private var imageUrl: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        fetchData()
        getData()
        binding.imgRefresh.setOnClickListener {
            getData()
        }

    }


    private fun getData() {
        viewModel.fetchDogResponse()
    }

    private fun fetchData() {
        viewModel.response.observe(this) { response ->
            when (response) {
                is NetworkResult.Success -> {
                    response.data?.let {
                        binding.imgDog.visibility = View.VISIBLE
                        imageUrl = response.data.message
                        binding.imgDog.load(
                            response.data.message
                        ) {
                            transformations(RoundedCornersTransformation(16f))
                        }
                    }
                    setVisibility(View.GONE, binding.sgErrorView, binding.pbDog)

                }

                is NetworkResult.Error -> {
                    val result = binding.sgErrorView
                    result.setData(response.message ?: "")
                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                    binding.sgErrorView.visibility = View.VISIBLE
                    setVisibility(View.GONE, binding.imgDog, binding.pbDog)

                }

                is NetworkResult.Loading -> {
                    binding.pbDog.visibility = View.VISIBLE
                }
            }
        }
    }


}
