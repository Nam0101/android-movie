package com.namnv.movieapp.presentation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.namnv.movieapp.data.models.MovieDTO
import com.namnv.movieapp.data.models.MovieResourceDTO
import com.namnv.movieapp.domain.usecase.GetMovieListUseCase
import com.namnv.movieapp.domain.usecase.GetMovieResourceUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HomeActivityViewModel : ViewModel(), KoinComponent {
    private val getMovieListUseCase: GetMovieListUseCase by inject()
    private val getMovieResourceUseCase: GetMovieResourceUseCase by inject()

    val movieList = MutableLiveData<List<MovieDTO>?>()
    val movieResource = MutableLiveData<MovieResourceDTO?>()

    fun getMovieList() {
        CoroutineScope(IO).launch {
            val result = getMovieListUseCase.getAllMovies(0, 20)
            if (result.isSuccessful) {
                withContext(Main) {
                    movieList.value = result.body()?.toList()
                }
            }
        }
    }

    fun getMovieResource() {
        CoroutineScope(IO).launch {
            val result = getMovieResourceUseCase.getMovieResource(1)
            if (result.isSuccessful) {
                withContext(Main) {
                    movieResource.value = result.body()
                }
            }
        }
    }
}