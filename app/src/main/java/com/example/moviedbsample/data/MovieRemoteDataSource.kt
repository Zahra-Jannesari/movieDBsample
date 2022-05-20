package com.example.moviedbsample.data

import com.example.moviedbsample.model.Movie

class MovieRemoteDataSource {

    suspend fun getMovies() : List<Movie>{
        return getSampleMovies()
    }
    fun getSampleMovies() : List<Movie>{
        return listOf(
            Movie("جوکر"),
            Movie("firelight")
        )
    }
}