package com.namnv.movieapp.presentation.di

import com.namnv.movieapp.domain.usecase.GetMovieListUseCase
import com.namnv.movieapp.domain.usecase.GetMovieResourceUseCase
import com.namnv.movieapp.domain.usecase.LoginUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { LoginUseCase(get()) }
    factory { GetMovieListUseCase(get()) }
    factory { GetMovieResourceUseCase(get()) }
}