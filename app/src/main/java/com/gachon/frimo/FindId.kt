package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.gachon.frimo.databinding.ActivityFindIdBinding

class FindId : ComponentActivity() {

    private lateinit var binding: ActivityFindIdBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityFindIdBinding.inflate(layoutInflater)
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