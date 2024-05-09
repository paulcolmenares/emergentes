package com.example.pagina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class crearcuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crearcuenta)
    }

    // Método para guardar datos y acceder al perfil
    fun metodoGuardar(view: View) {
        val intent = Intent(this, perfil::class.java)
        startActivity(intent)
    }

}