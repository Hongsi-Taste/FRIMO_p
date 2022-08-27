package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.gachon.frimo.databinding.ActivityLoginBinding
import com.kakao.sdk.auth.model.OAuthToken
import com.kakao.sdk.common.KakaoSdk
import com.kakao.sdk.common.model.ClientError
import com.kakao.sdk.common.model.ClientErrorCause
import com.kakao.sdk.common.util.Utility
import com.kakao.sdk.user.UserApiClient


/**
 * 메인화면
 * @see com.gachon.frimo.MainActivity
 *
 * 약관
 * @see com.gachon.frimo.TermsOfUse
 *
 * ID / PW 찾기
 * @see com.gachon.frimo.FindId
 * @see com.gachon.frimo.FindPw
 *
 */

class Login : ComponentActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val TAG = "Login"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Kakao SDK 초기화
        KakaoSdk.init(this, getString(R.string.kakao_native_app_key))

        // 로그인 버튼 클릭 시
        binding.buttonLogin.setOnClickListener {

            // Todo: 서버에 로그인 여부 받아오기
            // Todo: Id와 PW가 일치하는 경우 Main page로 이동
            // Todo: Id와 PW가 일치하지 않는 경우 다시 입력하라고 Toast message

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

//        // Todo: XML 파일에 Kakao login button 구현 이후 주석 해제할 것
//        // Todo: Token 처리
//        // Kakao 로그인 버튼 클릭 시
//        binding.buttonKakaoLogin.setOnClickListener {
//
//            /**
//             * See {@linktourl https://developers.kakao.com/docs/latest/ko/kakaologin/android#before-you-begin}
//             */
//
//            // 카카오계정으로 로그인 공통 callback 구성
//            // 카카오톡으로 로그인 할 수 없어 카카오계정으로 로그인할 경우 사용됨
//            val callback: (OAuthToken?, Throwable?) -> Unit = { token, error ->
//                if (error != null) {
//                    Log.e(TAG, "카카오계정으로 로그인 실패", error)
//                } else if (token != null) {
//
//                    Log.i(TAG, "카카오계정으로 로그인 성공 ${token.accessToken}")
//                    startActivity(Intent(this, MainActivity::class.java))
//                    finish()
//                }
//            }
//
//            // 카카오톡이 설치되어 있으면 카카오톡으로 로그인, 아니면 카카오계정으로 로그인
//            if (UserApiClient.instance.isKakaoTalkLoginAvailable(context = this)) {
//                UserApiClient.instance.loginWithKakaoTalk(context = this) { token, error ->
//                    if (error != null) {
//
//                        Log.e(TAG, "카카오톡으로 로그인 실패", error)
//
//                        // 사용자가 카카오톡 설치 후 디바이스 권한 요청 화면에서 로그인을 취소한 경우,
//                        // 의도적인 로그인 취소로 보고 카카오계정으로 로그인 시도 없이 로그인 취소로 처리 (예: 뒤로 가기)
//                        if (error is ClientError && error.reason == ClientErrorCause.Cancelled) {
//                            return@loginWithKakaoTalk
//                        }
//
//                        // 카카오톡에 연결된 카카오계정이 없는 경우, 카카오계정으로 로그인 시도
//                        UserApiClient.instance.loginWithKakaoAccount(context = this, callback = callback)
//
//                    } else if (token != null) {
//
//                        Log.i(TAG, "카카오톡으로 로그인 성공 ${token.accessToken}")
//                        startActivity(Intent(this, MainActivity::class.java))
//                        finish()
//                    }
//                }
//
//            } else {
//                UserApiClient.instance.loginWithKakaoAccount(context = this, callback = callback)
//            }
//
//        }

        // 회원가입 버튼 클릭 시
        binding.buttonSignUp.setOnClickListener {

            // 약관 페이지로 이동
            startActivity(Intent(this, TermsOfUse::class.java))
        }

        // Id / Pw 찾기 버튼 클릭 시
        binding.buttonFindIdPw.setOnClickListener {

            // 아이디 찾기 페이지로 이동
            startActivity(Intent(this, FindId::class.java))
        }

    }
}