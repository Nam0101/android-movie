package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.HistoryDTO

interface HistoryResourceApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param historyDTO 
     * @return [HistoryDTO]
     */
    @POST("api/histories")
    suspend fun createHistory(@Body historyDTO: HistoryDTO): Response<HistoryDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Unit]
     */
    @DELETE("api/histories/{id}")
    suspend fun deleteHistory(@Path("id") id: kotlin.Long): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param page Zero-based page index (0..N) (optional, default to 0)
     * @param size The size of the page to be returned (optional, default to 20)
     * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return [kotlin.collections.MutableList<HistoryDTO>]
     */
    @GET("api/histories")
    suspend fun getAllHistories(@Query("page") page: kotlin.Int? = 0, @Query("size") size: kotlin.Int? = 20, @Query("sort") sort: @JvmSuppressWildcards kotlin.collections.MutableList<kotlin.String>? = null): Response<kotlin.collections.MutableList<HistoryDTO>>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [HistoryDTO]
     */
    @GET("api/histories/{id}")
    suspend fun getHistory(@Path("id") id: kotlin.Long): Response<HistoryDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param historyDTO 
     * @return [HistoryDTO]
     */
    @PATCH("api/histories/{id}")
    suspend fun partialUpdateHistory(@Path("id") id: kotlin.Long, @Body historyDTO: HistoryDTO): Response<HistoryDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param historyDTO 
     * @return [HistoryDTO]
     */
    @PUT("api/histories/{id}")
    suspend fun updateHistory(@Path("id") id: kotlin.Long, @Body historyDTO: HistoryDTO): Response<HistoryDTO>

}
