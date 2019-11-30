package com.example.examenparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pregunta3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
    }
    public void acierto(View view){
        System.out.println("contador: "+MainActivity.contador);
        if(MainActivity.contador!=4) {
            MainActivity.contador++;
            Intent intent = new Intent(this, MainActivity.clases.get(MainActivity.pos.get(0)));
            MainActivity.pos.remove(0);
            startActivity(intent);
            System.out.println(MainActivity.pos);
        }
        else{
            Intent intentx = new Intent(this,Ganar.class);
            startActivity(intentx);
        }
    }
    public void falla(View view){
        Intent intent=new Intent(this,Perder.class);
        startActivity(intent);

    }
}
