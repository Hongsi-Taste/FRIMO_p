package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gachon.frimo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingBtnFriendlyCommunity.setOnClickListener{

            val intent = Intent(this, FriendlyCommunity::class.java)
            startActivity(intent)
        }

        binding.floatingBtnTrendReport.setOnClickListener{

            val intent = Intent(this, TrendReport::class.java)
            startActivity(intent)
        }
    }

}