package com.thomasmacquart.apps.coroutinesworkshop

import retrofit2.Response
import retrofit2.http.GET

interface ImdbApi {
    @GET("?apikey=1b23a42&t=inception")
    suspend fun  getMovie(): Response<MovieResult>
}