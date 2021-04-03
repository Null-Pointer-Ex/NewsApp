package com.nullpointer.newsapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nullpointer.newsapp.datasource.NewsModel
import com.nullpointer.newsapp.datasource.RepositoryImp

class NewsViewModel : ViewModel() {
    val newsInfo = MutableLiveData<NewsModel>()
    val loading = MutableLiveData<Boolean>()


}