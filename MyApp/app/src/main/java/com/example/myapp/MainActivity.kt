package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val earth = findViewById(R.id.button) as Button
        earth.setOnClickListener { view ->
            var intent = Intent(this, Earth::class.java)
            startActivity(intent)
        }
        val mars = findViewById(R.id.button2) as Button
        mars.setOnClickListener { view ->
            var intent = Intent(this, Mars::class.java)
            startActivity(intent)
        }

        val venus = findViewById(R.id.button3) as Button
        venus.setOnClickListener { view ->
            var intent = Intent(this, Venus::class.java)
            startActivity(intent)
        }
        val neptune = findViewById(R.id.button4) as Button
        neptune.setOnClickListener { view ->
            var intent = Intent(this, Neptun::class.java)
            startActivity(intent)
        }
        val saturn = findViewById(R.id.button5) as Button
        saturn.setOnClickListener { view ->
            var intent = Intent(this, Saturn::class.java)
            startActivity(intent)
        }
        val jupiter = findViewById(R.id.button8) as Button
        jupiter.setOnClickListener { view ->
            var intent = Intent(this, Jupiter::class.java)
            startActivity(intent)
        }
        val space = findViewById(R.id.button6) as Button
        space.setOnClickListener { view ->
            var intent = Intent(this, SpaceX::class.java)
            startActivity(intent)
        }



    }
}