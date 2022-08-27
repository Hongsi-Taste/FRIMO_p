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
 * ID / PW 찾기
 * @see com.gachon.frimo.FindId
 * @see com.gachon.frimo.FindPw
 *
 * 회원가입
 * @see com.gachon.frimo.SignUp
 *
 * 메인화면
 * @see com.gachon.frimo.MainActivity
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

        binding.buttonLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

//        // Todo: XML 파일에 Kakao login button 구현 이후 주석 해제할 것
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

        binding.buttonSignUp.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
            finish()
        }

        binding.buttonFindIdPw.setOnClickListener {
            startActivity(Intent(this, FindId::class.java))
        }

    }
}