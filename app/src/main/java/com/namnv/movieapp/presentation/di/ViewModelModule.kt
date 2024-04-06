package com.namnv.movieapp.presentation.di

import com.namnv.movieapp.presentation.viewmodels.HomeActivityViewModel
import com.namnv.movieapp.presentation.viewmodels.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainActivityViewModel(get()) }
    viewModel { HomeActivityViewModel() }
}