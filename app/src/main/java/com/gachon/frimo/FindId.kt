package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.gachon.frimo.databinding.ActivityFindIdBinding

/**
 * 로그인
 * @see com.gachon.frimo.Login
 *
 * PW 찾기
 * @see com.gachon.frimo.FindPw
 */

class FindId : ComponentActivity() {

    private lateinit var binding: ActivityFindIdBinding
    private val TAG = "FindId"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityFindIdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 아이디 찾기 버튼 클릭 시
        binding.buttonFindId.setOnClickListener {

            // Todo: 아이디를 찾는 데 성공하였을 경우 Login activity로 이동
            // Todo: 아이디를 찾는 데 실패하였을 경우 Toast message 출력 및 기존 화면 유지

            startActivity(Intent(this, Login::class.java))
            finish()
        }

        // 비밀번호 찾기 버튼 클릭 시
        binding.buttonFindPw.setOnClickListener {

            // 비밀번호 찾기 페이지로 이동
            startActivity(Intent(this, FindPw::class.java))
            finish()
        }

    }
}