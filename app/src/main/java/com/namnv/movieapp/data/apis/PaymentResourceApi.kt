package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.PaymentDTO

interface PaymentResourceApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param paymentDTO 
     * @return [PaymentDTO]
     */
    @POST("api/payments")
    suspend fun createPayment(@Body paymentDTO: PaymentDTO): Response<PaymentDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Unit]
     */
    @DELETE("api/payments/{id}")
    suspend fun deletePayment(@Path("id") id: kotlin.Long): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param page Zero-based page index (0..N) (optional, default to 0)
     * @param size The size of the page to be returned (optional, default to 20)
     * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return [kotlin.collections.MutableList<PaymentDTO>]
     */
    @GET("api/payments")
    suspend fun getAllPayments(@Query("page") page: kotlin.Int? = 0, @Query("size") size: kotlin.Int? = 20, @Query("sort") sort: @JvmSuppressWildcards kotlin.collections.MutableList<kotlin.String>? = null): Response<kotlin.collections.MutableList<PaymentDTO>>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [PaymentDTO]
     */
    @GET("api/payments/{id}")
    suspend fun getPayment(@Path("id") id: kotlin.Long): Response<PaymentDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param paymentDTO 
     * @return [PaymentDTO]
     */
    @PATCH("api/payments/{id}")
    suspend fun partialUpdatePayment(@Path("id") id: kotlin.Long, @Body paymentDTO: PaymentDTO): Response<PaymentDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param paymentDTO 
     * @return [PaymentDTO]
     */
    @PUT("api/payments/{id}")
    suspend fun updatePayment(@Path("id") id: kotlin.Long, @Body paymentDTO: PaymentDTO): Response<PaymentDTO>

}
