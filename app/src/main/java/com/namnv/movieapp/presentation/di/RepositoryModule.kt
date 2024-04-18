package com.namnv.movieapp.presentation.di

import com.namnv.movieapp.domain.repository.AuthenticateRepository
import com.namnv.movieapp.data.apis.AuthenticateControllerApi
import com.namnv.movieapp.data.apis.MovieResourceApi
import com.namnv.movieapp.data.apis.MovieResourceResourceApi
import com.namnv.movieapp.domain.repository.MovieRepository
import com.namnv.movieapp.domain.repository.MovieResourceRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { AuthenticateRepository(get<AuthenticateControllerApi>()) }
    single {MovieRepository(get< MovieResourceApi>()) }
    single { MovieResourceRepository(get<MovieResourceResourceApi>()) }
}