package com.example.tarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val text1 = findViewById(R.id.texto1) as EditText
        val text2 = findViewById(R.id.texto2) as EditText
        text1.setEnabled(false)
        text2.setEnabled(false)
        val inicio = findViewById(R.id.inicio) as Button

        var intent = intent
        val num = intent.getStringExtra("numero")
        val color = intent.getStringExtra("color")

        text1.setText(num)
        text2.setText(color)

        inicio.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
