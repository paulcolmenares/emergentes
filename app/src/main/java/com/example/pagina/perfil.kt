package com.example.pagina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)
    }
    // crear metodo de acceder
    fun metodotextovoz(view: View) {
        val intent = Intent(this, texto::class.java)
        startActivity(intent)
    }
      // metodo Para salir
    fun metodosSalir(view: View) {
        val intent = Intent(this, texto::class.java)
        startActivity(intent)
}
    }