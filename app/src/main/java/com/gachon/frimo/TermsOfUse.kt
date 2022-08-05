package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TermsOfUse : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.terms_of_use)

        var button_continue: Button = findViewById(R.id.button_continue)

        button_continue.setOnClickListener {
            var intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }


    }
}