package com.nullpointer.newsapp.datasource.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.nullpointer.newsapp.datasource.NewsModel

@Database(entities = [User::class],version = 1,exportSchema = false)
abstract class NewsDatabase :RoomDatabase(){
    abstract fun newsDao():NewsDao

    companion object {
        //singleton
        @Volatile
        private var INSTANCE: NewsDatabase? = null
        fun getDatabase(context: Context): NewsDatabase {
            return INSTANCE
                ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext, NewsDatabase::class.java
                        , "word_database"
                    )
                        .build()
                    INSTANCE = instance
                    //return instance
                    return instance
                }
        }
    }
}