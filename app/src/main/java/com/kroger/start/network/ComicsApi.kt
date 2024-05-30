package com.kroger.start.network

import com.kroger.start.model.Comic
import retrofit2.http.GET

interface ComicsApi {

    @GET("/info.0.json")
    suspend fun getCurrentComic(): Comic
}
