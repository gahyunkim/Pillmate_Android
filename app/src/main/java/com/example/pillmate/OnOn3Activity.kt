package com.example.pillmate

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pillmate.databinding.ActivityOnon2Binding
import com.example.pillmate.databinding.ActivityOnon3Binding

class OnOn3Activity : AppCompatActivity() {
    private lateinit var binding : ActivityOnon3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOnon3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            // 로그인 성공 후 메인 액티비티로 이동
            val intent = Intent(this, OnOn4Activity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnSkip.setOnClickListener {
            // 로그인 성공 후 메인 액티비티로 이동
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}