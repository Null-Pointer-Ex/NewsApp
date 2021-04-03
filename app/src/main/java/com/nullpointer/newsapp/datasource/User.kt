package com.nullpointer.newsapp.datasource

import androidx.room.Entity

@Entity(tableName = "User")
data class User (var firstName:String, var lastName:String ,var email:String,var password:String){
}
