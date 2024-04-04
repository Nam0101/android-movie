package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.MovieResourceDTO

interface MovieResourceResourceApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param movieResourceDTO 
     * @return [MovieResourceDTO]
     */
    @POST("api/movie-resources")
    suspend fun createMovieResource(@Body movieResourceDTO: MovieResourceDTO): Response<MovieResourceDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Unit]
     */
    @DELETE("api/movie-resources/{id}")
    suspend fun deleteMovieResource(@Path("id") id: kotlin.Long): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param page Zero-based page index (0..N) (optional, default to 0)
     * @param size The size of the page to be returned (optional, default to 20)
     * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return [kotlin.collections.MutableList<MovieResourceDTO>]
     */
    @GET("api/movie-resources")
    suspend fun getAllMovieResources(@Query("page") page: kotlin.Int? = 0, @Query("size") size: kotlin.Int? = 20, @Query("sort") sort: @JvmSuppressWildcards kotlin.collections.MutableList<kotlin.String>? = null): Response<kotlin.collections.MutableList<MovieResourceDTO>>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [MovieResourceDTO]
     */
    @GET("api/movie-resources/{id}")
    suspend fun getMovieResource(@Path("id") id: kotlin.Long): Response<MovieResourceDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param movieResourceDTO 
     * @return [MovieResourceDTO]
     */
    @PATCH("api/movie-resources/{id}")
    suspend fun partialUpdateMovieResource(@Path("id") id: kotlin.Long, @Body movieResourceDTO: MovieResourceDTO): Response<MovieResourceDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param movieResourceDTO 
     * @return [MovieResourceDTO]
     */
    @PUT("api/movie-resources/{id}")
    suspend fun updateMovieResource(@Path("id") id: kotlin.Long, @Body movieResourceDTO: MovieResourceDTO): Response<MovieResourceDTO>

}
