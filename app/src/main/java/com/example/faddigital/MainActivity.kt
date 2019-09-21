package com.example.faddigital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btIndice)
        button.setOnClickListener() {
            val intent = Intent(this, IndicesActivity::class.java)
            Toast.makeText(this, "Passou", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}
