package Tema4

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R

class ejemplo4Activity<Button : View?, EditText : View?, TextView : View?> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo5)

        val inputText = findViewById<EditText>(R.id.inputText)
        val outputText = findViewById<TextView>(R.id.outputText)
        val btnBorrar = findViewById<Button>(R.id.saveButton)
        val btnGuardar = findViewById<Button>(R.id.readButton)
        val btnLeer = findViewById<Button>(R.id.btnBorrar)

        btnBorrar?.setOnClickListener() {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Confirmación")
            builder.setMessage("¿Estás seguro de que deseas borrar los datos?")
            builder.setPositiveButton("Sí") { _, _ ->
                try {
                    val fileName = ""
                    openFileOutput(fileName, MODE_PRIVATE).use {
                        it.write("".toByteArray())
                    }
                    Toast.makeText(this, "Datos borrados", Toast.LENGTH_SHORT).show()
                } catch (e: Exception) {
                    e.printStackTrace()
                    Toast.makeText(this, "Error al borrar los datos", Toast.LENGTH_SHORT).show()
                }
                builder.setNegativeButton("Cancelar") { dialog, _ ->
                    dialog.dismiss()
                }
                val dialog = builder.create()
                dialog.show()
            }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
        btnGuardar?.setOnClickListener(){
            val text = inputText.text.toString()+"\n"
            try {
                val fileName = ""
                openFileOutput(fileName, MODE_PRIVATE).use {
                    it.write(text.toByteArray())
                }
                inputText.text.clear()
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
        btnLeer?.setOnClickListener(){
            try{
                val fileName = ""
                val contenido = openFileInput(fileName).bufferedReader().useLines { lines ->
                    lines.joinToString { "\n" }
                }
                outputText.text = contenido
            }catch (e: FileNotFounException){
                outputText.text = "Archivo no encontrado"
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }
}
