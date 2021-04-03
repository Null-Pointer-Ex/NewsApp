package com.nullpointer.newsapp.datasource.remote

import com.nullpointer.newsapp.datasource.NewsModel
import kotlinx.coroutines.*
import retrofit2.Response

class RemoteNewRepository {
    suspend fun getRemoteData(q: String): Response<NewsModel>{
        return NewsService.getNewsService().getNews(q, "cf37cdb8097544c5a8f781b4ff533bb5")
    }
}