package com.dam2.ejemplolayoutc

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.dam2.ejemplolayoutc.R.id.button1
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{click(it)}
        button2.setOnClickListener{click(it)}
        button3.setOnClickListener { camera(it) }


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


    private fun camera(view: View){
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
              != PackageManager.PERMISSION_GRANTED){
                if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.CAMERA)) {
                    toast("TRUE?")
                    ActivityCompat.requestPermissions(
                        this,
                        arrayOf(Manifest.permission.CAMERA),
                        1
                    )

                }else{
                    toast("RECHAZADO POR SIEMPRE")
                }

            }else{
               toast ("ya permitido!")
                val intent = Intent (MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(intent, 0)
            }
        }

    }









