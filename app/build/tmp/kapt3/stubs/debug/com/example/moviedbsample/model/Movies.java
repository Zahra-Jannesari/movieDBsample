package com.example.moviedbsample.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/example/moviedbsample/model/Movies;", "", "page", "", "movieList", "", "Lcom/example/moviedbsample/model/Movie;", "totalPages", "", "totalResults", "(JLjava/util/List;II)V", "getMovieList", "()Ljava/util/List;", "getPage", "()J", "getTotalPages", "()I", "getTotalResults", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Movies {
    private final long page = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.moviedbsample.model.Movie> movieList = null;
    private final int totalPages = 0;
    private final int totalResults = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedbsample.model.Movies copy(@com.squareup.moshi.Json(name = "page")
    long page, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "results")
    java.util.List<com.example.moviedbsample.model.Movie> movieList, @com.squareup.moshi.Json(name = "total_pages")
    int totalPages, @com.squareup.moshi.Json(name = "total_results")
    int totalResults) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Movies(@com.squareup.moshi.Json(name = "page")
    long page, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "results")
    java.util.List<com.example.moviedbsample.model.Movie> movieList, @com.squareup.moshi.Json(name = "total_pages")
    int totalPages, @com.squareup.moshi.Json(name = "total_results")
    int totalResults) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getPage() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.moviedbsample.model.Movie> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.moviedbsample.model.Movie> getMovieList() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTotalResults() {
        return 0;
    }
}