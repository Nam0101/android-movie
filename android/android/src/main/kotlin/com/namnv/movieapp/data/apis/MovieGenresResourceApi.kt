package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.MovieGenresDTO

interface MovieGenresResourceApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param movieGenresDTO 
     * @return [MovieGenresDTO]
     */
    @POST("api/movie-genres")
    suspend fun createMovieGenres(@Body movieGenresDTO: MovieGenresDTO): Response<MovieGenresDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Unit]
     */
    @DELETE("api/movie-genres/{id}")
    suspend fun deleteMovieGenres(@Path("id") id: kotlin.Long): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param page Zero-based page index (0..N) (optional, default to 0)
     * @param size The size of the page to be returned (optional, default to 20)
     * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return [kotlin.collections.MutableList<MovieGenresDTO>]
     */
    @GET("api/movie-genres")
    suspend fun getAllMovieGenres(@Query("page") page: kotlin.Int? = 0, @Query("size") size: kotlin.Int? = 20, @Query("sort") sort: @JvmSuppressWildcards kotlin.collections.MutableList<kotlin.String>? = null): Response<kotlin.collections.MutableList<MovieGenresDTO>>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [MovieGenresDTO]
     */
    @GET("api/movie-genres/{id}")
    suspend fun getMovieGenres(@Path("id") id: kotlin.Long): Response<MovieGenresDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param movieGenresDTO 
     * @return [MovieGenresDTO]
     */
    @PATCH("api/movie-genres/{id}")
    suspend fun partialUpdateMovieGenres(@Path("id") id: kotlin.Long, @Body movieGenresDTO: MovieGenresDTO): Response<MovieGenresDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param movieGenresDTO 
     * @return [MovieGenresDTO]
     */
    @PUT("api/movie-genres/{id}")
    suspend fun updateMovieGenres(@Path("id") id: kotlin.Long, @Body movieGenresDTO: MovieGenresDTO): Response<MovieGenresDTO>

}
