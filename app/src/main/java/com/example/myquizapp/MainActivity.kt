package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button =findViewById(R.id.btn_start)
        val editTextName : EditText= findViewById(R.id.editText_name)

        btnStart.setOnClickListener{
            if(editTextName.text.isEmpty()){
                Toast.makeText(this,
                    "Please enter your name",Toast.LENGTH_SHORT).show()
            }else{
                val intent=Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constant.USER_NAME, editTextName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}