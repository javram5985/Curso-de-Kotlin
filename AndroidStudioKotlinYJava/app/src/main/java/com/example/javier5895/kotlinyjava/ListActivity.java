package com.example.javier5895.kotlinyjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    RecyclerView rcListado;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        rcListado = (RecyclerView) findViewById(R.id.rcListado);

        textView = (TextView) findViewById(R.id.txtListadoUser);

        if(getIntent() != null){
            Bundle bundle = getIntent().getExtras();
            String nombre = bundle.getString("usuario","");
            textView.setText("Bienvenido" + nombre);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rcListado.setLayoutManager(linearLayoutManager);

        rcListado.setAdapter(new AdapterListado(getFakeData()));
    }

    private List<PojoBasico> getFakeData() {
        List<PojoBasico> pojoBasicos = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            pojoBasicos.add(new PojoBasico("Titulo", "Desc"));
        }
        return pojoBasicos;
    }
}

//LinearLayoutManager, Creates a vertical LinearLayoutManager
//https://developer.android.com/reference/android/support/v7/widget/LinearLayoutManager.html#LinearLayoutManager(android.content.Context,%20int,%20boolean)
