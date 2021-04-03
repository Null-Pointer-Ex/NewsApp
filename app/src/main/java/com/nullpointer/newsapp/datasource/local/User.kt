package com.nullpointer.newsapp.datasource.local

import androidx.room.Entity

@Entity
data class User (var firstName:String, var lastName:String ,var email:String,var password:String){
}