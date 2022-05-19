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

        @Json(name = "genre_ids")
        val genreIDS: List<Int>,

        @Json(name = "id")
        val id: Long,

        val overview: String,

        @Json(name = "poster_path")
        val posterPath: String,

        val title: String,

        val video: Boolean
    )