package com.namnv.movieapp.domain.usecase

import android.util.Log
import com.namnv.movieapp.data.models.LoginVM
import com.namnv.movieapp.domain.repository.AuthenticateRepository
import org.koin.core.component.KoinComponent

class LoginUseCase(private val authRepository: AuthenticateRepository): KoinComponent {
    init {
        Log.i("LoginUseCase", "init")
    }
    suspend fun execute(loginVm: LoginVM): String {
        val response = authRepository.authorize(loginVm)
        return response.body()?.idToken ?: ""
    }
}