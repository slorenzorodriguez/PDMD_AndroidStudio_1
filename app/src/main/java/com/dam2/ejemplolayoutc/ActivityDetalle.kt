package com.dam2.ejemplolayoutc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle.*
import org.jetbrains.anko.browse

class ActivityDetalle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)



        buttonback.setOnClickListener {
            // ir para atras
            finish()
        }
        buttonG.setOnClickListener {
            // llamar a google
            browse("http://wwww.google.es/")
        }
        val message = intent.getStringExtra("color")
        txt1.text = message
    }

    //private fun clickGoogle(view: View?) {

    //}

    //fun clickBack(view: View) {

    //}

}


