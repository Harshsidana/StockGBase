
package com.maxi.dogapi.viewmodel

import com.maxi.dogapi.base.BaseTest
import com.maxi.dogapi.data.Repository
import com.maxi.dogapi.data.remote.DogService
import com.maxi.dogapi.data.remote.RemoteDataSource
import com.maxi.dogapi.extension.getOrAwaitValue
import com.maxi.dogapi.model.DogResponse
import com.maxi.dogapi.utils.NetworkResult
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito


@OptIn(ExperimentalCoroutinesApi::class)
class MainViewModelTest:BaseTest() {
    private lateinit var mainViewModel: MainViewModel
   @Mock
    lateinit var apiService: DogService
    @Mock
    lateinit var repository:Repository
    lateinit var remoteDataSource: RemoteDataSource


    @Before
     override fun setup() {
        super.setup()
        remoteDataSource = RemoteDataSource(apiService)
        mainViewModel = MainViewModel(repository)

    }

    @Test
    fun `success response case`() {
        runTest {
            Mockito.`when`(repository.getDog())
                .thenReturn(NetworkResult.Success(DogResponse("harsh","status")))
            mainViewModel.fetchDogResponse()
            testDispatcher.scheduler.advanceUntilIdle()
            val result = mainViewModel.response.getOrAwaitValue()
            assertEquals(result.data, DogResponse("harsh","status"))
        }
    }

    @Test
    fun `failure cases`() {
        runTest {
            Mockito.`when`(repository.getDog())
                .thenReturn(NetworkResult.Error("Error found"))
            mainViewModel.fetchDogResponse()
            testDispatcher.scheduler.advanceUntilIdle()
            val result = mainViewModel.response.getOrAwaitValue()
            assertEquals(result.message,"Error found")
        }
    }


}