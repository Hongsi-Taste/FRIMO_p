package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.gachon.frimo.databinding.FindIdBinding

class FindId : ComponentActivity() {

    private lateinit var binding: FindIdBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = FindIdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFindId.setOnClickListener {

            // Todo: ID 찾아주기

            startActivity(Intent(this, Login::class.java))
            finish()
        }

        binding.buttonFindPw.setOnClickListener {
            startActivity(Intent(this, FindPw::class.java))
            finish()
        }

    }
}