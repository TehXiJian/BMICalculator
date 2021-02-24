package com.example.bmicalculator

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnter = findViewById<View>(R.id.btnEnter)

        btnEnter.setOnClickListener()
        {
            val intent = Intent(this, BMIActivity::class.java)

            val personName = findViewById<TextView>(R.id.nameField).text.toString()

            intent.putExtra("personName", personName)

            startActivity(intent)
        }
    }
}