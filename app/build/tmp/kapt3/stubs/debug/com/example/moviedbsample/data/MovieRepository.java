package com.example.moviedbsample.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/moviedbsample/data/MovieRepository;", "", "moviesRemoteDataSource", "Lcom/example/moviedbsample/data/MoviesRemoteDataSource;", "movieLocalDataSource", "Lcom/example/moviedbsample/data/MovieLocalDataSource;", "(Lcom/example/moviedbsample/data/MoviesRemoteDataSource;Lcom/example/moviedbsample/data/MovieLocalDataSource;)V", "getMovieLocalDataSource", "()Lcom/example/moviedbsample/data/MovieLocalDataSource;", "getMoviesRemoteDataSource", "()Lcom/example/moviedbsample/data/MoviesRemoteDataSource;", "getMovieDetails", "Lcom/example/moviedbsample/model/Movie;", "Id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovies", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUpcomingMovies", "app_debug"})
public final class MovieRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.moviedbsample.data.MoviesRemoteDataSource moviesRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.moviedbsample.data.MovieLocalDataSource movieLocalDataSource = null;
    
    public MovieRepository(@org.jetbrains.annotations.NotNull()
    com.example.moviedbsample.data.MoviesRemoteDataSource moviesRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.example.moviedbsample.data.MovieLocalDataSource movieLocalDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedbsample.data.MoviesRemoteDataSource getMoviesRemoteDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedbsample.data.MovieLocalDataSource getMovieLocalDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.moviedbsample.model.Movie>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUpcomingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.moviedbsample.model.Movie>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovieDetails(int Id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.moviedbsample.model.Movie> continuation) {
        return null;
    }
}