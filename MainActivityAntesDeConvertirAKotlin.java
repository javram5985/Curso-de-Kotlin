package com.example.javier5895.kotlinyjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    EditText edtxPass;//jalando el EditText que tenemos en el activity_main.xml
    Button btnLogin;//jalando el Button que tenemos en el activity_main.xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setEdtxPass((EditText) findViewById(R.id.edtxLoginPassword));//jalando el EditText que tenemos en el activity_main.xml
        setBtnLogin((Button) findViewById(R.id.btnLogin));//jalando el Button que tenemos en el activity_main.xml

        getBtnLogin().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isValid = Validaciones.passwordValida(getEdtxPass());
                Log.e(TAG, "onClick: " + isValid);
                if(isValid){
                    //iniciarVista
                    startActivity(new Intent(MainActivity.this, ListActivity.class));
                }
                else{
                    Toast.makeText(MainActivity.this, "Password invalida", Toast.LENGTH_SHORT).show();
                }
            }
        });//Para escuchar cuando le peguemos a nuestro Button

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
