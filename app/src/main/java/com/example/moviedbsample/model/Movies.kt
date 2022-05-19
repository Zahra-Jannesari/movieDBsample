package com.example.moviedbsample.model

import com.squareup.moshi.Json

data class Movies (
    @Json(name = "page")
    val page: Long,

    @Json(name = "results")
    val movieList: List<Movie>,

    @Json(name = "total_pages")
    val totalPages: Int,

    @Json(name = "total_results")
    val totalResults: Int
)

data class Movie(
        val adult: Boolean,

        @Json(name = "backdrop_path")
        val backdropPath: String,

        @Json(name = "genre_ids")
        val genreIDS: List<Int>,

        @Json(name = "id")
        val id: Long,

        @Json(name = "original_title")
        val originalTitle: String,

        val overview: String,

        val popularity: Double,

        @Json(name = "poster_path")
        val posterPath: String,

        @Json(name = "release_date")
        val releaseDate: String,

        val title: String,

        val video: Boolean,

        @Json(name = "vote_average")
        val voteAverage: Double,

        @Json(name = "vote_count")
        val voteCount: Long
    )