package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        var button_login: Button = findViewById(R.id.button_login)
        var button_findIdPw: Button = findViewById(R.id.button_findIdPw)

        button_login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        button_findIdPw.setOnClickListener{
            val intent = Intent(this, FindId::class.java)
            startActivity(intent)
        }

    }
}