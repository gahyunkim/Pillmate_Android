package com.example.pillmate

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pillmate.databinding.ActivityAddMediFinBinding
import com.example.pillmate.databinding.ActivityOnon1Binding

class OnOn1Activity : AppCompatActivity() {
    private lateinit var binding : ActivityOnon1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnon1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            // 로그인 성공 후 메인 액티비티로 이동
            val intent = Intent(this, OnOn2Activity::class.java)
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