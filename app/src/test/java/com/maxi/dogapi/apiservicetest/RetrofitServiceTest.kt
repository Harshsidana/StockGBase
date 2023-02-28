package com.maxi.dogapi.apiservicetest

import com.google.gson.Gson
import com.maxi.dogapi.base.BaseTest
import com.maxi.dogapi.data.remote.DogService
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@OptIn(ExperimentalCoroutinesApi::class)
class RetrofitServiceTest:BaseTest() {

    lateinit var mockWebServer: MockWebServer
    lateinit var apiService: DogService
    lateinit var gson: Gson

    @Before
    override fun setup() {
        super.setup()
        gson = Gson()
        mockWebServer = MockWebServer()
        apiService = Retrofit.Builder()
            .baseUrl(mockWebServer.url("/"))
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build().create(DogService::class.java)
    }


    @Test
    fun `get success response test`() {
        runBlocking {
            val mockResponse = MockResponse()
            mockWebServer.enqueue(mockResponse.setBody(" {\"message\":\"https:\\/\\/images.dog.ceo\\/breeds\\/keeshond\\/n02112350_4282.jpg\",\"status\":\"success\"}"))
            val response = apiService.getDog()
            val request = mockWebServer.takeRequest()
            assertEquals("/api/breeds/image/random",request.path)
            assertEquals(true, response.body()?.message?.equals("https://images.dog.ceo/breeds/keeshond/n02112350_4282.jpg"))
        }
    }

    @Test
    fun `get empty output test`() {
        runBlocking {
            val mockResponse = MockResponse()
            mockWebServer.enqueue(mockResponse.setBody("{}"))
            val response = apiService.getDog()
            val request = mockWebServer.takeRequest()
            assertEquals("/api/breeds/image/random",request.path)
            assertEquals(true, response.body()?.message==null)
        }
    }



}