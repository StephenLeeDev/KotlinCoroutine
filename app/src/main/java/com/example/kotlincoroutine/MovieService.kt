package com.example.kotlincoroutine

import retrofit2.Response
import retrofit2.http.*

interface MovieService {

    @GET("/data/movies")
    suspend fun getMovies(): Response<Movies>

}