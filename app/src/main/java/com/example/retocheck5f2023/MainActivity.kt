package com.example.retocheck5f2023


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val check1=findViewById<CheckBox>(R.id.check1)
        val check2=findViewById<CheckBox>(R.id.check2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            try {
                var resultado="Bienvenido: ${et1.text.toString() +" "+ et2.text.toString()+" Preferencias: "}"

                if (check1.isChecked)
                    resultado += "${check1.text}"
                if (check2.isChecked)
                    resultado += " ${check2.text}"
                tv1.text = resultado
            } catch (e:Exception){
                tv1.text = "Error al capturar los datos"
            }

        }
    }
}