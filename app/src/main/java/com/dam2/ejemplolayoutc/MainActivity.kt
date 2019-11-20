package com.dam2.ejemplolayoutc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.dam2.ejemplolayoutc.R.id.button1
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{click(it)}
        button2.setOnClickListener{click(it)}


    }

    private fun click(view: View) {
        // cast
        val miboton = view as Button
        if (miboton == button1) {
            intent.putExtra("color", "rojo")
        }
        else {
            intent.putExtra("color", "amarillo")
        }

    val intent = Intent(this, ActivityDetalle::class.java)
    intent.putExtra("color", view.text)
    startActivity(intent)

    }


}






