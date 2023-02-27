package com.maxi.dogapi.data.remote

import javax.inject.Inject

open class RemoteDataSource @Inject constructor(private val dogService: DogService) {

    suspend fun getDog() = dogService.getDog()

}