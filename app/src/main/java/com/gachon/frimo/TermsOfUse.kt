package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gachon.frimo.databinding.TermsOfUseBinding

/**
 * 회원가입
 * @see com.gachon.frimo.SignUp
 */

class TermsOfUse : AppCompatActivity() {

    private lateinit var binding: TermsOfUseBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = TermsOfUseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 회원가입 버튼 클릭 시
        binding.buttonContinue.setOnClickListener {

            // Todo: 항목 체크 여부 확인 (필수 항목 전부 선택, 선택 항목)
            // Todo: 필수 항목이 전부 체크가 다 되어있는 경우 회원가입 창으로 이동
            // Todo: 필수 항목이 체크가 되어있지 않은 경우 체크하라고 Toast message

            startActivity(Intent(this, SignUp::class.java))
        }


    }
}