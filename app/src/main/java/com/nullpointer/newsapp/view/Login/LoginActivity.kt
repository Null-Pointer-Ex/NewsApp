package com.nullpointer.newsapp.view.Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.nullpointer.newsapp.R

class LoginActivity : AppCompatActivity() {

    lateinit var email : TextView
    lateinit var loginBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById(R.id.email)
        loginBtn = findViewById(R.id.loginBtn)



    }
}