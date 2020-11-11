package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegister.setOnClickListener {
            var intent = Intent(this,register::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            var intent = Intent(this,home::class.java)
            var login = tiEmail.text.toString()
            intent.putExtra("email",login)
            startActivity(intent)
        }

    }
}