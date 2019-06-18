package com.thomasmacquart.apps.coroutinesworkshop

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MainRepo {

    suspend fun doRequest() : NetworkResult<MovieResult> {

        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()


        val retrofit = Retrofit.Builder()
            .baseUrl("http://www.omdbapi.com")
            .addConverterFactory(MoshiConverterFactory.create())
            //.addCallAdapterFactory(CoroutineCallAdapterFactory())
            .client(client)
            .build()


        val api = retrofit.create(ImdbApi::class.java)

        val response = api.getMovie()
        //return NetworkResult.onSuccess(response)

        if (response.isSuccessful) {
            val movie = response.body()
            if (movie != null) {
                return NetworkResult.onSuccess(movie)
            }
            return NetworkResult.Failed("oops empty result")
        } else {
            return NetworkResult.Failed("oops I did it again")
        }
    }
}