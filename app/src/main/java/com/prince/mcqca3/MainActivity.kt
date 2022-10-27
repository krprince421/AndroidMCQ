package com.prince.mcqca3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var txtSignUp: TextView
    lateinit var btnSignIn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById( R.id.username )
        password = findViewById( R.id.password )
        txtSignUp = findViewById( R.id.txtSignUp )

        btnSignIn = findViewById( R.id.btnSignIn )

        txtSignUp.setOnClickListener {
            val intent = Intent( this@MainActivity , SignUp::class.java )
            startActivity( intent )
        }

        btnSignIn.setOnClickListener {
            val Email = username.text.toString()
            val Password = password.text.toString()

            val db = DatabaseHelper( this , null )

            val user = db.createSession( Email , Password )

            if( user ){
                Toast.makeText(this@MainActivity , "User found" , Toast.LENGTH_SHORT ).show()
            }else{
                Toast.makeText(this@MainActivity , "User not found" , Toast.LENGTH_SHORT ).show()
            }

        }


    }
}