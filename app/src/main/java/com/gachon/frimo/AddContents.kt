package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.gachon.frimo.databinding.AddContentsBinding

class AddContents : AppCompatActivity() {

    private lateinit var binding: AddContentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = AddContentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 기존 action bar 제거 후 custom action bar 넣기
        supportActionBar!!.hide()

        // menu
        val icon = findViewById<ImageView>(R.id.ic_menu)
        icon.setImageResource(R.drawable.ic_upload)

        icon.setOnClickListener {
            val intent = Intent(this, FriendlyCommunity::class.java)
            startActivity(intent)
        }
    }
}