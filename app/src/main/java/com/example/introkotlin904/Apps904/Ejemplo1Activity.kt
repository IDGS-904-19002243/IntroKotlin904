package com.example.introkotlin904.Apps904

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R

class Ejemplo1Activity : AppCompatActivity() {

    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var tv1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo1)

        et1 = findViewById<EditText>(R.id.et1)
        et2 = findViewById<EditText>(R.id.et2)
        tv1 = findViewById<TextView>(R.id.tv1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcular(view: View){
        val rdbtnResta = findViewById<RadioButton>(R.id.rdbtnResta)
        val rdbtnMultiplicacion = findViewById<RadioButton>(R.id.rdbtnMultiplicacion)
        val rdbtnDividision = findViewById<RadioButton>(R.id.rdbtnDividision)
        val rdbtnSuma = findViewById<RadioButton>(R.id.rdbtnSuma)

        if (rdbtnResta.isChecked) {
            restar(view)
        } else if (rdbtnMultiplicacion.isChecked) {
            multiplicar(view)
        } else if (rdbtnDividision.isChecked) {
            dividir(view)
        } else if (rdbtnSuma.isChecked) {
            sumar(view)
        }
    }

    fun restar(view: android.view.View){
        val valor1 = et1.text.toString().toString()
        val valor2 = et2.text.toString().toString()
        val resultado = valor1.toDouble() - valor2.toDouble()
        tv1.text = resultado.toString()
    }

    fun multiplicar(view: android.view.View){
        val valor1 = et1.text.toString().toString()
        val valor2 = et2.text.toString().toString()
        val resultado = valor1.toDouble() * valor2.toDouble()
        tv1.text = resultado.toString()
    }

    fun dividir(view: android.view.View){
        val valor1 = et1.text.toString().toString()
        val valor2 = et2.text.toString().toString()
        val resultado = valor1.toDouble() / valor2.toDouble()
        tv1.text = resultado.toString()
    }

    fun sumar(view: android.view.View){
        val valor1 = et1.text.toString().toString()
        val valor2 = et2.text.toString().toString()
        val resultado = valor1.toDouble() + valor2.toDouble()
        tv1.text = resultado.toString()
    }
}
