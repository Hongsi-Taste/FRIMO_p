package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.gachon.frimo.databinding.SignUpBinding

/**
 * 로그인
 * @see com.gachon.frimo.Login
 */

class SignUp : ComponentActivity() {

    private lateinit var binding: SignUpBinding
    private val TAG = "SignUp"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = SignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 회원가입 버튼 클릭 시 서버에 회원가입 여부를 받아오기
        binding.buttonSignUp.setOnClickListener {

            // Todo: 회원가입이 성공하였을 경우 Login activity로 이동
            // Todo: 회원가입이 실패하였을 경우 Toast message 출력 및 기존 화면 유지

            startActivity(Intent(this, Login::class.java))
        }

    }
}