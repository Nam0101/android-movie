package com.namnv.movieapp.domain.usecase

import com.namnv.movieapp.domain.repository.MovieRepository

class GetMovieListUseCase(private val movieRepository: MovieRepository) {
    suspend fun getAllMovies(
        page: Int? = 0,
        size: Int? = 20,
        sort: MutableList<String>? = null,
        eagerload: Boolean? = true
    ) = movieRepository.getAllMovies(page, size, sort, eagerload)
}