package com.gachon.frimo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gachon.frimo.databinding.FriendCandidateBinding

class FriendCandidate : AppCompatActivity() {

    private lateinit var binding: FriendCandidateBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = FriendCandidateBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}