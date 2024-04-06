package com.namnv.movieapp.domain.repository

import com.namnv.movieapp.data.apis.MovieResourceApi
import com.namnv.movieapp.data.models.MovieDTO
import retrofit2.Response

class MovieRepository(private val api: MovieResourceApi) {

    //        suspend fun getAllMovies(@Query("page") page: kotlin.Int? = 0, @Query("size") size: kotlin.Int? = 20, @Query("sort") sort: @JvmSuppressWildcards kotlin.collections.MutableList<kotlin.String>? = null, @Query("eagerload") eagerload: kotlin.Boolean? = true): Response<MutableList<MovieDTO>>
    suspend fun getAllMovies(
        page: Int? = 0,
        size: Int? = 20,
        sort: MutableList<String>? = null,
        eagerload: Boolean? = true
    ): Response<MutableList<MovieDTO>> {
        return api.getAllMovies(
            page = page,
            size = size,
            sort = sort,
            eagerload = eagerload
        )
    }

}