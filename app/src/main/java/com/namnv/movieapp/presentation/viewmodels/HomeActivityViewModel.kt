package com.namnv.movieapp.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.namnv.movieapp.data.models.MovieDTO
import com.namnv.movieapp.domain.usecase.GetMovieListUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HomeActivityViewModel : ViewModel(), KoinComponent {
    private val TAG = HomeActivityViewModel::class.java.simpleName
    private val getMovieListUseCase: GetMovieListUseCase by inject()

    // list movieDTO
    val movieList = MutableLiveData<List<MovieDTO>?>()


    fun getMovieList() {
        Log.i(TAG, "getMovieList")
        CoroutineScope(Dispatchers.IO).launch {
            val result = getMovieListUseCase.getAllMovies(0, 20)
            if (result.isSuccessful) {
                Log.i(TAG, "getMovieList result body: ${result.body()}")
                val movieListData = result.body()?.toList()
                Log.i(TAG, "getMovieList result body as list: $movieListData")
                withContext(Main) {
                    movieList.value = movieListData
                }
                Log.i(TAG, "getMovieList result: ${movieList.value}")
            } else {
                Log.e(TAG, "getMovieList failed: ${result.errorBody()?.string()}")
            }
        }
    }

}