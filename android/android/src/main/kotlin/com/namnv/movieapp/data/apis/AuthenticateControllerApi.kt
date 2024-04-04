package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.JWTToken
import com.namnv.movieapp.data.models.LoginVM

interface AuthenticateControllerApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loginVM 
     * @return [JWTToken]
     */
    @POST("api/authenticate")
    suspend fun authorize(@Body loginVM: LoginVM): Response<JWTToken>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.String]
     */
    @GET("api/authenticate")
    suspend fun isAuthenticated(): Response<kotlin.String>

}
