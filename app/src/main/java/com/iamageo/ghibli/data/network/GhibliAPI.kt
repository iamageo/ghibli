package com.iamageo.ghibli.data.network

import com.iamageo.ghibli.data.model.Film
import com.iamageo.ghibli.data.network.response.ResponseGhibli
import retrofit2.http.GET

interface GhibliAPI {

    @GET("films/")
    suspend fun getAllMovies(): List<Film>

}