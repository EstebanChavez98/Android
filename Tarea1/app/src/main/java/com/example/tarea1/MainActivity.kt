package com.example.tarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById(R.id.boton1) as TextView
        val btn2 = findViewById(R.id.boton2) as TextView
        val num1 = (1..100).random()
        val num2 = (1..100).random()

        btn1.text = num1.toString()
        btn2.text = num2.toString()

        btn1.setOnClickListener {
            val intent: Intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("numero", num1.toString())
            startActivity(intent)
            finish()
        }
        btn2.setOnClickListener {
            val intent: Intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("numero", num2.toString())
            startActivity(intent)
            finish()
        }
    }



}
