package com.example.moviedbsample.ui

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

    init {
        getMovies()
    }

    private fun getMovies() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            _movies.value = repository.getMovies()

            _status.value = ApiStatus.DONE
        }
    }

}