package com.example.moviedbsample.data

import android.util.Log
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
    suspend fun getUpcomingMovies():List<Movie>{
        var movies = listOf<Movie>()
        try {
            movies=MoviesApi.retrofitService.upcoming().movieList
            Log.d("TAG", "$movies ")
        }catch (e:Exception){

        }
        return  movies
    }
    suspend fun getMovieDetails(Id:Int):Movie{
        var movie=Movie()
        try {
            Log.d("TAG", "1")
            movie=MoviesApi.retrofitService.getMovieDetails(movieId = Id)
            Log.d("TAG", "${movie.title}")
        }catch (e:Exception){

        }
        return movie
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
//            false, listOf(), 111, "ovv",
//            "", "fake movie", false
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
