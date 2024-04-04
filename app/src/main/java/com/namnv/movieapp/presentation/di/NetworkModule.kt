package com.namnv.movieapp.presentation.di

import android.util.Log
import com.namnv.movieapp.data.apis.AuthenticateControllerApi
import com.namnv.movieapp.data.infrastructure.ApiClient
import org.koin.dsl.module

val networkModule = module {
    single {
        ApiClient().setLogger { message ->
            Log.i("ApiClient", message)
        }
    }
    single { get<ApiClient>().createService(AuthenticateControllerApi::class.java) }
}