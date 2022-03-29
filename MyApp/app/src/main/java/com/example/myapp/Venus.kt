package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt

class Venus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_venus)

        val button = findViewById(R.id.button7) as Button

        button.setOnClickListener { view ->
            val weight = findViewById<EditText>(R.id.plain_text_input).text.toString().toInt()
            val preview = findViewById<TextView>(R.id.result)
            preview.text = "Your weight on this planet is ${(weight*0.91).roundToInt()}kg"
        }
    }
}