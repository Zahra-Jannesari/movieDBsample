package com.example.moviedbsample.data

import com.example.moviedbsample.model.Movie

class MovieRepository(val movieRemoteDataSource : MovieRemoteDataSource) {

    suspend fun getMovies() : List<Movie>{
        return movieRemoteDataSource.getMovies()

    }

}