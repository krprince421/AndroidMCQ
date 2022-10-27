package com.prince.mcqca3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUp : AppCompatActivity() {

    lateinit var etxtName : EditText
    lateinit var etxtEmail : EditText
    lateinit var etxtPassword : EditText

    lateinit var btnSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        etxtName = findViewById( R.id.etxtName )
        etxtEmail = findViewById( R.id.etxtEmail )
        etxtPassword = findViewById( R.id.etxtPassword )

        //btnSignUp = findViewById( R.id.btnSignUp )

        btnSignUp = findViewById(R.id.btnSignUp )

        btnSignUp.setOnClickListener {

            val Name = etxtName.text.toString()
            val Email = etxtEmail.text.toString()
            val Password = etxtPassword.text.toString()

            val db = DatabaseHelper( this , null )

            db.create( Name , Email , Password )
            Toast.makeText(this@SignUp , "Successfully Signed Up" , Toast.LENGTH_SHORT ).show()

        }

    }
}