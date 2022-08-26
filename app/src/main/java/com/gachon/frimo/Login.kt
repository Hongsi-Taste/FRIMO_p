package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.gachon.frimo.databinding.ActivityLoginBinding

class Login : ComponentActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        binding.buttonSignUp.setOnClickListener {
            startActivity(Intent(this, TermsOfUse::class.java))
        }

        binding.buttonFindIdPw.setOnClickListener {
            startActivity(Intent(this, FindId::class.java))
        }

    }
}