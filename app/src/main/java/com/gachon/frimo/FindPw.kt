package com.gachon.frimo

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gachon.frimo.databinding.FindPwBinding
import com.skydoves.powermenu.MenuAnimation
import com.skydoves.powermenu.OnMenuItemClickListener
import com.skydoves.powermenu.PowerMenu
import com.skydoves.powermenu.PowerMenuItem

class FindPw : AppCompatActivity() {

    private lateinit var menu: PowerMenu
    private lateinit var binding: FindPwBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = FindPwBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Title 변경
        supportActionBar!!.setTitle("비밀번호 찾기")

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