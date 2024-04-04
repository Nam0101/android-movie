package com.namnv.movieapp.data.apis

import com.namnv.movieapp.data.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.namnv.movieapp.data.models.PlaylistDTO

interface PlaylistResourceApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param playlistDTO 
     * @return [PlaylistDTO]
     */
    @POST("api/playlists")
    suspend fun createPlaylist(@Body playlistDTO: PlaylistDTO): Response<PlaylistDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Unit]
     */
    @DELETE("api/playlists/{id}")
    suspend fun deletePlaylist(@Path("id") id: kotlin.Long): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param page Zero-based page index (0..N) (optional, default to 0)
     * @param size The size of the page to be returned (optional, default to 20)
     * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return [kotlin.collections.MutableList<PlaylistDTO>]
     */
    @GET("api/playlists")
    suspend fun getAllPlaylists(@Query("page") page: kotlin.Int? = 0, @Query("size") size: kotlin.Int? = 20, @Query("sort") sort: @JvmSuppressWildcards kotlin.collections.MutableList<kotlin.String>? = null): Response<kotlin.collections.MutableList<PlaylistDTO>>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [PlaylistDTO]
     */
    @GET("api/playlists/{id}")
    suspend fun getPlaylist(@Path("id") id: kotlin.Long): Response<PlaylistDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param playlistDTO 
     * @return [PlaylistDTO]
     */
    @PATCH("api/playlists/{id}")
    suspend fun partialUpdatePlaylist(@Path("id") id: kotlin.Long, @Body playlistDTO: PlaylistDTO): Response<PlaylistDTO>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param playlistDTO 
     * @return [PlaylistDTO]
     */
    @PUT("api/playlists/{id}")
    suspend fun updatePlaylist(@Path("id") id: kotlin.Long, @Body playlistDTO: PlaylistDTO): Response<PlaylistDTO>

}
