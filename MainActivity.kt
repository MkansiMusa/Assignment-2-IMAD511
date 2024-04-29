package com.example.assignment2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Creating a function to allow us to open the next page
        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }

}