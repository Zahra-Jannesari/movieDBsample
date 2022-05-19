package com.example.moviedbsample.domain

import com.example.moviedbsample.data.MovieLocalDataSource
import com.example.moviedbsample.data.MovieRepository
import com.example.moviedbsample.data.MoviesRemoteDataSource

object Container {
    val moviesRemoteDataSource = MoviesRemoteDataSource()
    val moviesLocalDataSource = MovieLocalDataSource()
    val repository = MovieRepository(moviesRemoteDataSource, moviesLocalDataSource)
}