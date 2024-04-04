package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.GenresDTO

interface GenresResourceApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param genresDTO 
     * @return [GenresDTO]
     */
    @POST("api/genres")
    suspend fun createGenres(@Body genresDTO: GenresDTO): Response<GenresDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Unit]
     */
    @DELETE("api/genres/{id}")
    suspend fun deleteGenres(@Path("id") id: kotlin.Long): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param page Zero-based page index (0..N) (optional, default to 0)
     * @param size The size of the page to be returned (optional, default to 20)
     * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return [kotlin.collections.MutableList<GenresDTO>]
     */
    @GET("api/genres")
    suspend fun getAllGenres(@Query("page") page: kotlin.Int? = 0, @Query("size") size: kotlin.Int? = 20, @Query("sort") sort: @JvmSuppressWildcards kotlin.collections.MutableList<kotlin.String>? = null): Response<kotlin.collections.MutableList<GenresDTO>>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [GenresDTO]
     */
    @GET("api/genres/{id}")
    suspend fun getGenres(@Path("id") id: kotlin.Long): Response<GenresDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param genresDTO 
     * @return [GenresDTO]
     */
    @PATCH("api/genres/{id}")
    suspend fun partialUpdateGenres(@Path("id") id: kotlin.Long, @Body genresDTO: GenresDTO): Response<GenresDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param genresDTO 
     * @return [GenresDTO]
     */
    @PUT("api/genres/{id}")
    suspend fun updateGenres(@Path("id") id: kotlin.Long, @Body genresDTO: GenresDTO): Response<GenresDTO>

}
