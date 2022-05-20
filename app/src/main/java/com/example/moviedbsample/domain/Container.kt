package com.example.moviedbsample.domain

import com.example.moviedbsample.data.MovieRepository

object Container {
    val movieRepository = MovieRepository()
}