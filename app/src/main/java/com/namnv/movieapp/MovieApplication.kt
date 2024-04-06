package com.namnv.movieapp

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.disk.DiskCache
import coil.memory.MemoryCache
import coil.request.CachePolicy
import coil.util.DebugLogger
import com.namnv.movieapp.presentation.di.appModule
import com.namnv.movieapp.presentation.di.networkModule
import com.namnv.movieapp.presentation.di.repositoryModule
import com.namnv.movieapp.presentation.di.useCaseModule
import com.namnv.movieapp.presentation.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieApplication : Application(), ImageLoaderFactory {
    override fun onCreate() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
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

    override fun newImageLoader(): ImageLoader {
        return ImageLoader.Builder(this)
            .memoryCachePolicy(CachePolicy.ENABLED)
            .memoryCache {
                MemoryCache.Builder(this)
                    .maxSizePercent(0.25)
                    .build()
            }
            .diskCachePolicy(CachePolicy.ENABLED)
            .diskCache(
                DiskCache.Builder()
                    .directory(this.cacheDir.resolve("image_cache"))
                    .maxSizePercent(0.02)
                    .build()
            )
            .crossfade(true)
            .logger(
                DebugLogger()
            )
            .build()
    }
}