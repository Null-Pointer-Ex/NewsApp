package com.nullpointer.newsapp.datasource

import android.app.Application
import com.nullpointer.newsapp.datasource.local.NewsDatabase

class NewsApplication:Application() {
    val database by lazy {  NewsDatabase.getDatabase(this)}
    val repository by lazy {
        RepositoryImp(
            database.newsDao()
        )
    }

}