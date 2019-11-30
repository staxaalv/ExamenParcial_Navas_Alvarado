package com.example.examenparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Perder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perder);

        TextView txtFinal=(TextView) findViewById(R.id.textFinal);
        txtFinal.setText(" Ha respondido "+MainActivity.contador+" preguntas");

    }

    public void deNuevo(View view){
        MainActivity.pos.clear();
        MainActivity.clases.clear();

        MainActivity.contador=0;
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
