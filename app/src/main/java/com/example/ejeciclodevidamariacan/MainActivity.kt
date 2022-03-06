package com.example.ejeciclodevidamariacan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var nombre = "MARIA"
    val NOMBRE = "nombre"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.buton)
        //Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()

        boton.setOnClickListener {
            nombre = "Maria Jose"
            Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        nombre = savedInstanceState?.getString(NOMBRE)!!
        Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState?.putString(NOMBRE, nombre)
    }

    //ESTADOS DE EJECUCION, TRANSICIÓN, RENOVACION, DESTRUIR LA APP
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "En transición", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Aplicativo oculto", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Aplicativo visible", Toast.LENGTH_SHORT).show()
    }

}