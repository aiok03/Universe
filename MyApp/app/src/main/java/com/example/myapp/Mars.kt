package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt

class Mars : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mars)

        val button = findViewById(R.id.button7) as Button

        button.setOnClickListener { view ->
            val weightInput = findViewById<EditText>(R.id.plain_text_input).text.toString().toInt()
            val text = findViewById<TextView>(R.id.result)
            text.text = "Your weight on this planet is ${(weightInput*0.38).roundToInt()}kg"
        }

    }
}