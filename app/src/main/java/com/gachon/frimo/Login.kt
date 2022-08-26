package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.gachon.frimo.databinding.LoginBinding

class Login : ComponentActivity() {

    private lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = LoginBinding.inflate(layoutInflater)
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