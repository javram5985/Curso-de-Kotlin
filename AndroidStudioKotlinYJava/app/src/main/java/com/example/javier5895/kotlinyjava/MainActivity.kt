package com.example.javier5895.kotlinyjava

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit internal var edtxPass: EditText//jalando el EditText que tenemos en el activity_main.xml
    lateinit internal var edtxUser: EditText//jalando el EditText que tenemos en el activity_main.xml
    lateinit internal var btnLogin: Button//jalando el Button que tenemos en el activity_main.xml

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtxPass = findViewById<View>(R.id.edtxLoginPassword) as EditText//jalando el EditText que tenemos en el activity_main.xml
        edtxUser = findViewById<View>(R.id.edtxLoginUsuario) as EditText
        btnLogin = findViewById<View>(R.id.btnLogin) as Button//jalando el Button que tenemos en el activity_main.xml

        val sharedPreferences = getSharedPreferences("kotlinpre", Context.MODE_PRIVATE)//https://developer.android.com/reference/android/content/Context.html#getSharedPreferences(java.lang.String,%20int)

        val isLogged = sharedPreferences.getBoolean("loggeado", false)

        if (isLogged){//true -> if(isLogged == true)
            startActivity(Intent(this@MainActivity, ListActivity::class.java))
            finish()
        }

        btnLogin.setOnClickListener {
            val isValid = edtxPass.passwordValida()
            Log.e(TAG, "onClick: $isValid")
            if (isValid) {
                //iniciarVista
                //startActivity(Intent(this@MainActivity, ListActivity::class.java))
                var intent = Intent(this@MainActivity, ListActivity::class.java)
                intent.putExtra("usuario", edtxUser.text.toString())
                startActivity(intent)
                sharedPreferences.edit {
                    putBoolean("loggeado", true)//https://developer.android.com/reference/android/content/SharedPreferences.Editor.html
                }
            } else {
                Toast.makeText(this@MainActivity, "Password invalida", Toast.LENGTH_SHORT).show()
            }
        }//Para escuchar cuando le peguemos a nuestro Button

    }
}

//Log.e -> https://developer.android.com/reference/android/util/Log.html#e(java.lang.String,%20java.lang.String)
//Log.d -> https://developer.android.com/reference/android/util/Log.html#d(java.lang.String,%20java.lang.String)
//Los Logs son para imprimir en la consola

//Toast: A toast provides simple feedback about an operation in a small popup. It only fills the
//amount of space required for the message and the
//current activity remains visible and interactive. Toasts automatically disappear after a timeout.
//https://developer.android.com/guide/topics/ui/notifiers/toasts.html

//Intent: https://developer.android.com/training/basics/firstapp/starting-activity.html
//An Intent is an object that provides runtime binding between separate components, such as two activities.
//The Intent represents an app’s "intent to do something."

//Lateinit: esta etiqueta lo que permite es decirle al compilador: Esta variable todavia
//no la voy a usar (inicializar) pero en un futuro le voy a asignar un valor
