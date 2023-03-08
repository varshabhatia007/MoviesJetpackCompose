package com.example.moviesjetpackcompose.data

import com.example.moviesjetpackcompose.BuildConfig
import com.example.moviesjetpackcompose.data.response.FilmResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("trending/movie/day")
    suspend fun getTrendingMovies(
        @Query("page") page: Int = 0,
        @Query("api_key") apiKey: String = BuildConfig.MOVIE_API_KEY,
        @Query("language") language: String = "en"
    ): FilmResponse

}