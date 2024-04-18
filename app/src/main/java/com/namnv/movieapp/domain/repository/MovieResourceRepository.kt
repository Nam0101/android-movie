package com.namnv.movieapp.domain.repository

import com.namnv.movieapp.data.apis.MovieResourceApi
import com.namnv.movieapp.data.apis.MovieResourceResourceApi

class MovieResourceRepository(
    private val movieResourceApi: MovieResourceResourceApi,
) {
    suspend fun getMovieResource(
        id: Long
    ) = movieResourceApi.getMovieResource(id)
}