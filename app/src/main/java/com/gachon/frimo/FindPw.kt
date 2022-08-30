package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.gachon.frimo.databinding.ActivityFindPwBinding

/**
 * 로그인
 * @see com.gachon.frimo.Login
 *
 * ID 찾기
 * @see com.gachon.frimo.FindId
 */

class FindPw : ComponentActivity() {

    private lateinit var binding: ActivityFindPwBinding
    private val TAG = "FindPw"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityFindPwBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFindPw.setOnClickListener {

            // Todo: 비밀번호를 찾는 데 성공하였을 경우 Login activity로 이동
            // Todo: 비밀번호를 찾는 데 실패하였을 경우 Toast message 출력 및 기존 화면 유지

            startActivity(Intent(this, Login::class.java))
            finish()
        }

        // 아이디 찾기 버튼 클릭 시
        binding.buttonFindId.setOnClickListener {

            // 아이디 찾기 페이지로 이동
            startActivity(Intent(this, FindId::class.java))
            finish()
        }

    }
}