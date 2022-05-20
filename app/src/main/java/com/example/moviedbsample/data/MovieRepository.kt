package com.example.moviedbsample.data

import com.example.moviedbsample.model.Movie

class MovieRepository {

    suspend fun getMovies() : List<Movie>{

        //TODO : fetch list of movies

        return  getSampleMovies()
    }
    fun getSampleMovies() : List<Movie>{
        return listOf(
            Movie("جوکر"),
            Movie("firelight")
        )
    }
}