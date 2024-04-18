package com.namnv.movieapp.domain.usecase

import com.namnv.movieapp.domain.repository.MovieResourceRepository

class GetMovieResourceUseCase(
    private val movieResourceRepository: MovieResourceRepository
) {
    suspend fun getMovieResource(
        id: Long
    ) = movieResourceRepository.getMovieResource(id)
}