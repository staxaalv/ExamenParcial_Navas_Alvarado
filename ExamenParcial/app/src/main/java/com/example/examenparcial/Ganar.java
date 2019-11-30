package com.example.examenparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ganar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganar);
    }
    public void deNuevo(View view){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
        MainActivity.pos.clear();
        MainActivity.generarAleatorio();
        MainActivity.contador=0;
    }
    public void salir(View v){
        finishAffinity();
    }
}
