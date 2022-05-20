package com.example.moviedbsample.data

import com.example.moviedbsample.model.Movie
import com.example.moviedbsample.network.MoviesApi

class MovieRemoteDataSource {

    suspend fun getMovies() : List<Movie>{
        try {
            return MoviesApi.retrofitService.getMovies().movieList
        }catch (e : Exception){
            return getSampleMovies()
        }

    }
    fun getSampleMovies() : List<Movie>{
        return listOf(
            Movie(listOf(), 111,"" , "","supranos" , false),
        )
    }
}