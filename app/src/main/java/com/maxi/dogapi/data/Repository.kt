package com.maxi.dogapi.data

import android.graphics.Bitmap
import android.os.Environment
import androidx.core.content.ContextCompat.getExternalFilesDirs
import com.maxi.dogapi.data.remote.RemoteDataSource
import com.maxi.dogapi.model.BaseApiResponse
import com.maxi.dogapi.model.DogResponse
import com.maxi.dogapi.utils.NetworkResult
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream
import javax.inject.Inject


@ActivityRetainedScoped
class Repository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseApiResponse() {
    suspend fun getDog(): NetworkResult<DogResponse> {
      return safeApiCall { remoteDataSource.getDog() }
    }
}

