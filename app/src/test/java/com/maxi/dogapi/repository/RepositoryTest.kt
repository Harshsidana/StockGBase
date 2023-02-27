package com.maxi.dogapi.repository

import com.maxi.dogapi.base.BaseTest
import com.maxi.dogapi.data.Repository
import com.maxi.dogapi.data.remote.DogService
import com.maxi.dogapi.data.remote.RemoteDataSource
import com.maxi.dogapi.model.DogResponse
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import okhttp3.ResponseBody.Companion.toResponseBody
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import retrofit2.Response

@OptIn(ExperimentalCoroutinesApi::class)
class RepositoryTest : BaseTest() {
    lateinit var remoteDataSource: RemoteDataSource
    lateinit var repo: Repository
    @Mock
    lateinit var apiService: DogService
    @Before
    override fun setup() {
        super.setup()
        remoteDataSource=RemoteDataSource(apiService)
        repo=Repository(remoteDataSource)
    }

    @Test
    fun `success response from api` () {
        runTest {
            Mockito.`when`(remoteDataSource.getDog())
                .thenReturn(Response.success(DogResponse("Message", "Success")))
            val result = repo.getDog()
            Assert.assertEquals(result.data, DogResponse("Message", "Success"))
        }
    }

        @Test
        fun `failure api response` (){
            runTest {
                Mockito.`when`(remoteDataSource.getDog())
                    .thenReturn( Response.error(500,"Unautorized".toResponseBody()))
                val result=repo.getDog()
                Assert.assertEquals(result.message,"Something went wrong")
            }
    }


}