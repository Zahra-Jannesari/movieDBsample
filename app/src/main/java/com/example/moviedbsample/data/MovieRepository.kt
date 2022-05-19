package com.example.moviedbsample.data

import com.example.moviedbsample.model.Movie
import com.example.moviedbsample.network.MoviesApi
import java.lang.Exception

class MovieRepository(
    val moviesRemoteDataSource: MoviesRemoteDataSource,
    val movieLocalDataSource: MovieLocalDataSource
) {
    suspend fun getMovies(): List<Movie> {
        var movies = listOf<Movie>()

        try {
            movies = moviesRemoteDataSource.getMovies()
            movieLocalDataSource.addMovies(movies)
        } catch (e: Exception) {
            movies = movieLocalDataSource.getMovies()
        }
        return  movies
    }
}

class MoviesRemoteDataSource {
    val service = MoviesApi.retrofitService
    suspend fun getMovies(): List<Movie> {
        return service.getPopularMovies(1).movieList
    }
}

class MovieLocalDataSource {
    val movieList = arrayListOf(
        Movie(
            false, listOf(), 111, "ovv",
            "", "fake movie", false
        )
    )
    suspend fun getMovies(): List<Movie> {

        // get from db
        return movieList
    }

    fun addMovies(movies: List<Movie>) {

        // add to db
        movieList.clear()
        movieList.addAll(movies)

    }
}
