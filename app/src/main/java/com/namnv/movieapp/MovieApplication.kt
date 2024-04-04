package com.namnv.movieapp

import android.app.Application
import com.namnv.movieapp.presentation.di.appModule
import com.namnv.movieapp.presentation.di.networkModule
import com.namnv.movieapp.presentation.di.repositoryModule
import com.namnv.movieapp.presentation.di.useCaseModule
import com.namnv.movieapp.presentation.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MovieApplication)
            modules(listOf(
                networkModule,
                useCaseModule,
                viewModelModule,
                repositoryModule,
                appModule
            ))
        }
    }

}