package com.nullpointer.newsapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import com.nullpointer.newsapp.R
import com.nullpointer.newsapp.datasource.NewsApplication
import com.nullpointer.newsapp.viewModel.RegisterViewModel
import kotlinx.android.synthetic.main.activity_registeration.*
class Registeration : AppCompatActivity() {

    val registerViewModel : RegisterViewModel by viewModels {
        RegisterViewModel.RegisterViewModelFactory((this.application as NewsApplication).repository)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeration)


        var regiterBtn:Button=btn_register
        regiterBtn.setOnClickListener{
            getUserData()

        }

    }
    fun getUserData(){
        var firstName:EditText=editTxt_firstName
        var lastName:EditText=editTxt_lastName
        var email:EditText=editTxt_email
        var password=editTxt_pass
        var passVerfiy=editTxt_verfyPass
        // check
        if(!firstName.text.isEmpty() && firstName.text!=null && !lastName.text.isEmpty() && lastName.text!=null &&
            !email.text.isEmpty()&&email.text!=null &&
            !password.text.isEmpty()&&password.text!=null &&
            !passVerfiy.text.isEmpty()&&passVerfiy.text!=null){
            if(password.text==passVerfiy.text){

            }


            Toast.makeText(this,"${firstName.text}",Toast.LENGTH_SHORT).show()


        }


    }
}