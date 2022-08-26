package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.gachon.frimo.databinding.FindPwBinding

class FindPw : ComponentActivity() {

    private lateinit var binding: FindPwBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = FindPwBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFindPw.setOnClickListener {

            // Todo: PW 찾아주기

            startActivity(Intent(this, Login::class.java))
            finish()
        }

        binding.buttonFindId.setOnClickListener {
            startActivity(Intent(this, FindId::class.java))
            finish()
        }

    }
}