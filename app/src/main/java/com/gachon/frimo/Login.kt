package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gachon.frimo.databinding.LoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.buttonSignUp.setOnClickListener {
            val intent = Intent(this, TermsOfUse::class.java)
            startActivity(intent)
        }

        binding.buttonFindIdPw.setOnClickListener {
            val intent = Intent(this, FindId::class.java)
            startActivity(intent)
        }

    }
}