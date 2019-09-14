package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //2.1 - Interfaz de usuario por código
        TextView texto = new TextView(this);
        texto.setText("Hola, Android");
        setContentView(texto);

    }
}
