package com.iamageo.ghibli.data.network

import com.iamageo.ghibli.core.RetrofitHelper
import com.iamageo.ghibli.data.model.Film
import com.iamageo.ghibli.data.network.response.ResponseGhibli
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GhibliService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getAllMovies(): List<Film> {
        return withContext(Dispatchers.IO) {
            retrofit.create(GhibliAPI::class.java).getAllMovies()
        }
    }


}