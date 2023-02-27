package com.maxi.dogapi.model

import com.maxi.dogapi.error.SGCustomError
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.maxi.dogapi.interceptor.NoConnectivityException
import com.maxi.dogapi.utils.NetworkResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import retrofit2.HttpException
import retrofit2.Response

abstract class BaseApiResponse {

    suspend fun <T> safeApiCall(apiToBeCalled: suspend () -> Response<T>): NetworkResult<T> {
        return withContext(Dispatchers.IO) {
            try {
                val response: Response<T> = apiToBeCalled()

                if (response.isSuccessful) {
                    NetworkResult.Success(data = response.body()!!)
                }
                else {
                    val errorResponse: SGCustomError? = convertErrorBody(response.errorBody())
                    NetworkResult.Error(
                        message = errorResponse?.failureMessage ?: "Something went wrong"
                    )
                }
            } catch (e: HttpException) {
                NetworkResult.Error(message = e.message ?: "Something went wrong")
            } catch (e: NoConnectivityException) {

                NetworkResult.Error("Please check your network connection")
            } catch (e: Exception) {

                NetworkResult.Error(message = "Something went wrong")
            }
        }
    }

    private fun convertErrorBody(errorBody: ResponseBody?): SGCustomError? {
        return try {
            val gson = Gson()
            val type = object : TypeToken<SGCustomError>() {}.type
            gson.fromJson(errorBody?.charStream(), type)
        } catch (exception: Exception) {
            null
        }
    }

}