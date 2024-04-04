package com.namnv.movieapp.presentation.di

import com.namnv.movieapp.data.JwtStore
import org.koin.dsl.module

val appModule = module {
    single { JwtStore(get()) }

}