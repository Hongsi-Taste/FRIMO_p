package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gachon.frimo.databinding.FindIdBinding

class FindId : AppCompatActivity() {

    private lateinit var binding: FindIdBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = FindIdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Title 변경
        supportActionBar!!.setTitle("아이디 찾기")

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