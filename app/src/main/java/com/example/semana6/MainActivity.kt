package com.example.semana6

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editTextPeso = findViewById<EditText>(R.id.editTextText)

        val editTextAltura = findViewById<EditText>(R.id.editTextText2)

        val textViewResult = findViewById<TextView>(R.id.textView3)



        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val textAltura: String = editTextAltura.getText().toString()
            val textPeso: String = editTextPeso.getText().toString()
            val resultAltura = textAltura.toFloat() * textAltura.toFloat()
            val result = textPeso.toFloat() / resultAltura
            textViewResult.setText("Resultado = " + result)
        }
    }

}