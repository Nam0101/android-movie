package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.MovieDTO

interface MovieResourceApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param movieDTO 
     * @return [MovieDTO]
     */
    @POST("api/movies")
    suspend fun createMovie(@Body movieDTO: MovieDTO): Response<MovieDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Unit]
     */
    @DELETE("api/movies/{id}")
    suspend fun deleteMovie(@Path("id") id: kotlin.Long): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param page Zero-based page index (0..N) (optional, default to 0)
     * @param size The size of the page to be returned (optional, default to 20)
     * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param eagerload  (optional, default to true)
     * @return [kotlin.collections.MutableList<MovieDTO>]
     */
    @GET("api/movies")
    suspend fun getAllMovies(@Query("page") page: kotlin.Int? = 0, @Query("size") size: kotlin.Int? = 20, @Query("sort") sort: @JvmSuppressWildcards kotlin.collections.MutableList<kotlin.String>? = null, @Query("eagerload") eagerload: kotlin.Boolean? = true): Response<kotlin.collections.MutableList<MovieDTO>>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [MovieDTO]
     */
    @GET("api/movies/{id}")
    suspend fun getMovie(@Path("id") id: kotlin.Long): Response<MovieDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param movieDTO 
     * @return [MovieDTO]
     */
    @PATCH("api/movies/{id}")
    suspend fun partialUpdateMovie(@Path("id") id: kotlin.Long, @Body movieDTO: MovieDTO): Response<MovieDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param movieDTO 
     * @return [MovieDTO]
     */
    @PUT("api/movies/{id}")
    suspend fun updateMovie(@Path("id") id: kotlin.Long, @Body movieDTO: MovieDTO): Response<MovieDTO>

}
