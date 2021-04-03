package com.nullpointer.newsapp.datasource.local

import android.app.Application
import com.nullpointer.newsapp.datasource.User

class LocalRepository(application: Application) {

   private val db: NewsDatabase = NewsDatabase.getDatabase(application)
   private val newsDao: NewsDao = db.newsDao()

   fun login(email: String, password: String): User{
      return newsDao.login(email, password)
   }
}