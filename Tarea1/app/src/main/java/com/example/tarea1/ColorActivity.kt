package com.example.tarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ColorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        val btn1 = findViewById(R.id.rojo) as TextView
        val btn2 = findViewById(R.id.azul) as TextView
        val num = intent.getStringExtra("numero")

        btn1.setOnClickListener {
            val intent: Intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("color", "ROJO")
            intent.putExtra("numero", num)
            startActivity(intent)
            finish()
        }
        btn2.setOnClickListener {
            val intent: Intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("color", "AZUL")
            intent.putExtra("numero", num)
            startActivity(intent)
            finish()
        }
    }
}
