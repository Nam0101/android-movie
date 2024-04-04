package com.namnv.movieapp.presentation.di

import com.namnv.movieapp.domain.repository.AuthenticateRepository
import com.namnv.movieapp.data.apis.AuthenticateControllerApi
import org.koin.dsl.module

val repositoryModule = module {
    single { AuthenticateRepository(get<AuthenticateControllerApi>()) }
}