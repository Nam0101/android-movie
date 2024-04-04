package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.PremiumDTO

interface PremiumResourceApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param premiumDTO 
     * @return [PremiumDTO]
     */
    @POST("api/premiums")
    suspend fun createPremium(@Body premiumDTO: PremiumDTO): Response<PremiumDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Unit]
     */
    @DELETE("api/premiums/{id}")
    suspend fun deletePremium(@Path("id") id: kotlin.Long): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param page Zero-based page index (0..N) (optional, default to 0)
     * @param size The size of the page to be returned (optional, default to 20)
     * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return [kotlin.collections.MutableList<PremiumDTO>]
     */
    @GET("api/premiums")
    suspend fun getAllPremiums(@Query("page") page: kotlin.Int? = 0, @Query("size") size: kotlin.Int? = 20, @Query("sort") sort: @JvmSuppressWildcards kotlin.collections.MutableList<kotlin.String>? = null): Response<kotlin.collections.MutableList<PremiumDTO>>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [PremiumDTO]
     */
    @GET("api/premiums/{id}")
    suspend fun getPremium(@Path("id") id: kotlin.Long): Response<PremiumDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param premiumDTO 
     * @return [PremiumDTO]
     */
    @PATCH("api/premiums/{id}")
    suspend fun partialUpdatePremium(@Path("id") id: kotlin.Long, @Body premiumDTO: PremiumDTO): Response<PremiumDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param premiumDTO 
     * @return [PremiumDTO]
     */
    @PUT("api/premiums/{id}")
    suspend fun updatePremium(@Path("id") id: kotlin.Long, @Body premiumDTO: PremiumDTO): Response<PremiumDTO>

}
