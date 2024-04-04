package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.AdminUserDTO
import com.namnv.movieapp.data.models.User

interface UserResourceApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param adminUserDTO 
     * @return [User]
     */
    @POST("api/admin/users")
    suspend fun createUser(@Body adminUserDTO: AdminUserDTO): Response<User>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param login 
     * @return [Unit]
     */
    @DELETE("api/admin/users/{login}")
    suspend fun deleteUser(@Path("login") login: kotlin.String): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param page Zero-based page index (0..N) (optional, default to 0)
     * @param size The size of the page to be returned (optional, default to 20)
     * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return [kotlin.collections.MutableList<AdminUserDTO>]
     */
    @GET("api/admin/users")
    suspend fun getAllUsers(@Query("page") page: kotlin.Int? = 0, @Query("size") size: kotlin.Int? = 20, @Query("sort") sort: @JvmSuppressWildcards kotlin.collections.MutableList<kotlin.String>? = null): Response<kotlin.collections.MutableList<AdminUserDTO>>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param login 
     * @return [AdminUserDTO]
     */
    @GET("api/admin/users/{login}")
    suspend fun getUser(@Path("login") login: kotlin.String): Response<AdminUserDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param login 
     * @param adminUserDTO 
     * @return [AdminUserDTO]
     */
    @PUT("api/admin/users/{login}")
    suspend fun updateUser(@Path("login") login: kotlin.String, @Body adminUserDTO: AdminUserDTO): Response<AdminUserDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param adminUserDTO 
     * @return [AdminUserDTO]
     */
    @PUT("api/admin/users")
    suspend fun updateUser1(@Body adminUserDTO: AdminUserDTO): Response<AdminUserDTO>

}
