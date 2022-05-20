package com.example.moviedbsample.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviedbsample.domain.Container
import com.example.moviedbsample.model.Movie
import com.example.moviedbsample.network.MoviesApi
import kotlinx.coroutines.launch

enum class ApiStatus { LOADING, ERROR, DONE }
class MovieListViewModel : ViewModel() {

    val repository = Container.repository
    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus> = _status

    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies

    private val _upcomingMovies = MutableLiveData<List<Movie>>()
    val upcomingMovies: LiveData<List<Movie>> = _upcomingMovies

    private val _detailMovie = MutableLiveData<Movie>()
    val detailMovie: LiveData<Movie> = _detailMovie
    init {
        getMovies()
        getUpcomingMovies()
    }

    private fun getMovies() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            _movies.value = repository.getMovies()

            _status.value = ApiStatus.DONE
        }
    }

    fun getUpcomingMovies() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            _upcomingMovies.value = repository.getUpcomingMovies()

            _status.value = ApiStatus.DONE
        }
    }
    fun getMovieDetails(id:Int){
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            _detailMovie.value = repository.getMovieDetails(id)
            _status.value = ApiStatus.DONE
        }
    }
}