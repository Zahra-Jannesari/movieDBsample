package com.example.moviedbsample.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviedbsample.model.Movie
import com.example.moviedbsample.network.MoviesApi
import kotlinx.coroutines.launch

enum class ApiStatus { LOADING, ERROR, DONE }
class MovieListViewModel : ViewModel() {

    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus> = _status

    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies

    init {
        getMovies()
    }

    private fun getMovies() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            try {
                _movies.value = MoviesApi.retrofitService.getPopularMovies(1).movieList
                _status.value = ApiStatus.DONE
            } catch (e: Exception) {
                _status.value = ApiStatus.ERROR
                _movies.value = listOf()
            }
        }
    }

}