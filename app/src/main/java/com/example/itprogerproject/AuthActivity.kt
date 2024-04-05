package com.example.itprogerproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val linkToGeg : TextView = findViewById(R.id.link_to_reg);

        linkToGeg.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent);
        }
    }
}