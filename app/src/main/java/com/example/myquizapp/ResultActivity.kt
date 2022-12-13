package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_playerName)
        val result: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        tvName.text=intent.getStringExtra(Constant.USER_NAME)
        result.text="Your Score is ${intent.getIntExtra(Constant.CORRECT_ANSWER,0)} out of ${intent.getIntExtra(Constant.TOTAL_QUESTIONS,0)}"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

 
    }
}