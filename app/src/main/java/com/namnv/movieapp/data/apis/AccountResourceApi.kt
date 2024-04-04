package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.AdminUserDTO
import com.namnv.movieapp.data.models.KeyAndPasswordVM
import com.namnv.movieapp.data.models.ManagedUserVM
import com.namnv.movieapp.data.models.PasswordChangeDTO

interface AccountResourceApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param key 
     * @return [Unit]
     */
    @GET("api/activate")
    suspend fun activateAccount(@Query("key") key: kotlin.String): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param passwordChangeDTO 
     * @return [Unit]
     */
    @POST("api/account/change-password")
    suspend fun changePassword(@Body passwordChangeDTO: PasswordChangeDTO): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param keyAndPasswordVM 
     * @return [Unit]
     */
    @POST("api/account/reset-password/finish")
    suspend fun finishPasswordReset(@Body keyAndPasswordVM: KeyAndPasswordVM): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [AdminUserDTO]
     */
    @GET("api/account")
    suspend fun getAccount(): Response<AdminUserDTO>

    /**
     * 
     * 
     * Responses:
     *  - 201: Created
     *
     * @param managedUserVM 
     * @return [Unit]
     */
    @POST("api/register")
    suspend fun registerAccount(@Body managedUserVM: ManagedUserVM): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param body 
     * @return [Unit]
     */
    @POST("api/account/reset-password/init")
    suspend fun requestPasswordReset(@Body body: kotlin.String): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param adminUserDTO 
     * @return [Unit]
     */
    @POST("api/account")
    suspend fun saveAccount(@Body adminUserDTO: AdminUserDTO): Response<Unit>

}
