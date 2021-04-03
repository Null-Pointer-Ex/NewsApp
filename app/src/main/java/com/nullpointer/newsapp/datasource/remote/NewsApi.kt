package com.nullpointer.newsapp.datasource.remote

import com.nullpointer.newsapp.datasource.NewsModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("everything")
    suspend fun getNews(@Query("q") query: String, @Query("apiKey") apiKey: String): Response<NewsModel>
}
