package com.example.moviedbsample.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/moviedbsample/domain/Container;", "", "()V", "moviesLocalDataSource", "Lcom/example/moviedbsample/data/MovieLocalDataSource;", "getMoviesLocalDataSource", "()Lcom/example/moviedbsample/data/MovieLocalDataSource;", "moviesRemoteDataSource", "Lcom/example/moviedbsample/data/MoviesRemoteDataSource;", "getMoviesRemoteDataSource", "()Lcom/example/moviedbsample/data/MoviesRemoteDataSource;", "repository", "Lcom/example/moviedbsample/data/MovieRepository;", "getRepository", "()Lcom/example/moviedbsample/data/MovieRepository;", "app_debug"})
public final class Container {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviedbsample.domain.Container INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.moviedbsample.data.MoviesRemoteDataSource moviesRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.moviedbsample.data.MovieLocalDataSource moviesLocalDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.moviedbsample.data.MovieRepository repository = null;
    
    private Container() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedbsample.data.MoviesRemoteDataSource getMoviesRemoteDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedbsample.data.MovieLocalDataSource getMoviesLocalDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedbsample.data.MovieRepository getRepository() {
        return null;
    }
}