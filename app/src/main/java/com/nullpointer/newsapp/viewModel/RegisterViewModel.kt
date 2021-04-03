package com.nullpointer.newsapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.nullpointer.newsapp.datasource.RepositoryImp
import com.nullpointer.newsapp.datasource.local.User
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException

class RegisterViewModel (repositoryImp: RepositoryImp):ViewModel() {


    fun insertUserInROom()=viewModelScope.launch{

    }
    class RegisterViewModelFactory(private val repositoryImp: RepositoryImp):
        ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if(modelClass.isAssignableFrom(User::class.java)){
                @Suppress("UNCHECKED_CAST")
                return RegisterViewModel(
                    repositoryImp
                ) as T
            }
            throw IllegalArgumentException("UnKnown ViewModel class")
        }

}}