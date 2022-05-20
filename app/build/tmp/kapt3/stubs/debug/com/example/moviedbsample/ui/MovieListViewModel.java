package com.example.moviedbsample.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u0010\u001a\u00020\u001aH\u0002J\u0006\u0010\u0018\u001a\u00020\u001aR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/example/moviedbsample/ui/MovieListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_detailMovie", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/moviedbsample/model/Movie;", "_movies", "", "_status", "Lcom/example/moviedbsample/ui/ApiStatus;", "_upcomingMovies", "detailMovie", "Landroidx/lifecycle/LiveData;", "getDetailMovie", "()Landroidx/lifecycle/LiveData;", "movies", "getMovies", "repository", "Lcom/example/moviedbsample/data/MovieRepository;", "getRepository", "()Lcom/example/moviedbsample/data/MovieRepository;", "status", "getStatus", "upcomingMovies", "getUpcomingMovies", "getMovieDetails", "", "id", "", "app_debug"})
public final class MovieListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.moviedbsample.data.MovieRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.moviedbsample.ui.ApiStatus> _status = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.moviedbsample.ui.ApiStatus> status = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.moviedbsample.model.Movie>> _movies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.moviedbsample.model.Movie>> movies = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.moviedbsample.model.Movie>> _upcomingMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.moviedbsample.model.Movie>> upcomingMovies = null;
    private final androidx.lifecycle.MutableLiveData<com.example.moviedbsample.model.Movie> _detailMovie = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.moviedbsample.model.Movie> detailMovie = null;
    
    public MovieListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedbsample.data.MovieRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviedbsample.ui.ApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.moviedbsample.model.Movie>> getMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.moviedbsample.model.Movie>> getUpcomingMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviedbsample.model.Movie> getDetailMovie() {
        return null;
    }
    
    private final void getMovies() {
    }
    
    public final void getUpcomingMovies() {
    }
    
    public final void getMovieDetails(int id) {
    }
}