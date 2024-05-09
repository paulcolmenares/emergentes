 package com.example.pagina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
  // crear metodo de acceder
  fun metodoacceder(view: View) {
      val intent = Intent(this, perfil::class.java)
      startActivity(intent)
  }
    //crear metodo crear cuenta
    fun metodocrear(view: View) {
        val intent = Intent(this, crearcuenta::class.java)
        startActivity(intent)
}
    }