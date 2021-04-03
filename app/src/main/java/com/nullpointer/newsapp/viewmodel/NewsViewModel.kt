package com.nullpointer.newsapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nullpointer.newsapp.datasource.NewsModel
import com.nullpointer.newsapp.datasource.RepositoryImp

class NewsViewModel : ViewModel() {
    val weatherInfo = MutableLiveData<NewsModel>()
    val loading = MutableLiveData<Boolean>()
    val error = MutableLiveData<String>()


}