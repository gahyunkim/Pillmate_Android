package com.example.pillmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pillmate.databinding.ActivityHelp3Binding

class Help3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityHelp3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelp3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // X 아이콘 클릭 이벤트: UserFragment로 이동
        binding.closeIcon.setOnClickListener {
//            navigateToUserFragment()
            finish()
        }

        // 다음 아이콘 클릭 이벤트: Help3Activity로 이동
        binding.nextIcon.setOnClickListener {
            val intent = Intent(this, Help4Activity::class.java)
            startActivity(intent)
            finish()
        }

        // 이전 아이콘 클릭 이벤트: Help1Activity로 이동
        binding.prevIcon.setOnClickListener {
            val intent = Intent(this, Help2Activity::class.java)
            startActivity(intent)
            finish()
        }
    }

    // UserFragment로 이동
    private fun navigateToUserFragment() {
        supportFragmentManager.beginTransaction()
            .replace(android.R.id.content, UserFragment())
            .commit()
    }
}
