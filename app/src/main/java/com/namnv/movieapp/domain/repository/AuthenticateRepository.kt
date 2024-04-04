package com.namnv.movieapp.domain.repository

import com.namnv.movieapp.data.apis.AuthenticateControllerApi
import com.namnv.movieapp.data.models.JWTToken
import com.namnv.movieapp.data.models.LoginVM
import retrofit2.Response

class AuthenticateRepository(private val api: AuthenticateControllerApi) {
    suspend fun authorize(loginVM: LoginVM): Response<JWTToken> {
        return api.authorize(loginVM)
    }

    suspend fun isAuthenticated(): Response<String> {
        return api.isAuthenticated()
    }
}