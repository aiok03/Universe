package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Jupiter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jupiter)

        val button = findViewById(R.id.button7) as Button

        button.setOnClickListener { view ->
            val weightInput = findViewById<EditText>(R.id.plain_text_input).text.toString().toInt()
            val text = findViewById<TextView>(R.id.result)
            text.text = "Your weight on this planet is ${weightInput * 2.34}kg"
        }
    }
}