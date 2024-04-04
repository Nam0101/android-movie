package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.Authority

interface AuthorityResourceApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param authority 
     * @return [Authority]
     */
    @POST("api/authorities")
    suspend fun createAuthority(@Body authority: Authority): Response<Authority>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Unit]
     */
    @DELETE("api/authorities/{id}")
    suspend fun deleteAuthority(@Path("id") id: kotlin.String): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.MutableList<Authority>]
     */
    @GET("api/authorities")
    suspend fun getAllAuthorities(): Response<kotlin.collections.MutableList<Authority>>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Authority]
     */
    @GET("api/authorities/{id}")
    suspend fun getAuthority(@Path("id") id: kotlin.String): Response<Authority>

}
