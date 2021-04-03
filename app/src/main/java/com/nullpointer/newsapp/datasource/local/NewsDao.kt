package com.nullpointer.newsapp.datasource.local

import androidx.room.Dao
import androidx.room.Query
import com.nullpointer.newsapp.datasource.User

@Dao
interface NewsDao {

    @Query("SELECT * FROM User WHERE email=:email AND password=:password")
    fun login(email: String, password: String) : User

}