package com.example.examenparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<Class> clases=new ArrayList<Class>();
    public static ArrayList<Integer> pos=new ArrayList<Integer>();
    public static int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity.generarAleatorio();
        MainActivity.generarArreglo();
    }

    public static void generarArreglo(){
        MainActivity.clases.clear();
        MainActivity.clases.add(Pregunta1.class);
        MainActivity.clases.add(Pregunta2.class);
        MainActivity.clases.add(Pregunta3.class);
        MainActivity.clases.add(Pregunta4.class);
        MainActivity.clases.add(Pregunta5.class);
        System.out.println(MainActivity.clases);
    }
    public static void generarAleatorio(){
        Random random=new Random();
        int num=0;
        for(int i=0;i<5;i++){
            while(true){
                num=random.nextInt(5);
                if (pos.contains(num)){
                    System.out.println("estaba el numero"+num);
                }
                else{
                    pos.add(num);
                    break;
                }

            }
        }
        System.out.println(MainActivity.pos);

    }

    public void iniciar(View view){
        System.out.println("contador: "+MainActivity.contador);
        Intent intent = new Intent(this, MainActivity.clases.get(MainActivity.pos.get(0)));
        MainActivity.pos.remove(0);
        startActivity(intent);
        System.out.println(MainActivity.pos);
    }
    public void instrucciones(View view){
        Toast toast1 =Toast.makeText(getApplicationContext(),"INSTRUCCIONES:Conteste 5 preguntas para ganar, caso contrario puede intentarlo", Toast.LENGTH_SHORT);
        toast1.show();
    }


}
