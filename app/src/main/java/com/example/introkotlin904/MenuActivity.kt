package com.example.introkotlin904

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import com.example.introkotlin904.Apps904.Ejemplo1Activity
import com.example.introkotlin904.Apps904.Ejemplo2Activity
import com.example.introkotlin904.R.id.btn1

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnEjemplo1 = findViewById<Button>(R.id.btn1);
        btnEjemplo1.setOnClickListener{navegateToEjemplo1()}

        val btnEjemplo2 = findViewById<Button>(R.id.btn2);
        btnEjemplo2.setOnClickListener{navegateToEjemplo2()}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navegateToEjemplo1()
    {
        val intent = Intent(this, Ejemplo1Activity::class.java)
        startActivity(intent)
    }

    private fun navegateToEjemplo2()
    {
        val intent = Intent(this, Ejemplo2Activity::class.java)
        startActivity(intent)
    }

    private fun navegateToEjemplo3()
    {
        val intent = Intent(this, Ejemplo2Activity::class.java)
        startActivity(intent)
    }
}