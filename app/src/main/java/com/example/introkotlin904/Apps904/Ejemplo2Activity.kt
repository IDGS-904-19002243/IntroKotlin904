package com.example.introkotlin904.Apps904

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R

class Ejemplo2Activity : AppCompatActivity() {

    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo2)

        num1 = findViewById<EditText>(R.id.num1)
        num2 = findViewById<EditText>(R.id.num2)
        resultado = findViewById<TextView>(R.id.resultado)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcular(view: View){var i = 0;
        var suma = 0;
        var proceso = ""

        val valor1 = num1.text.toString().toString()
        val valor2 = num2.text.toString().toString()

        while (i < valor2.toInt()) {
            suma += valor1.toInt()
            proceso += valor1
            if (i < valor2.toInt() - 1) {
                proceso += " + "
            }
            i++
        }
        resultado.text = suma.toString()
        resultado.text = "R= " + proceso + " = " + suma.toString()
    }
}