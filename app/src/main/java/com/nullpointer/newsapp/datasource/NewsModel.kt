package com.nullpointer.newsapp.datasource

data class NewsModel(val status: String, val totalResults: Int, val articles: List<Article>)