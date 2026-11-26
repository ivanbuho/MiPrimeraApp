package com.ejemplo.miprimeraapp;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(48, 48, 48, 48);

        TextView texto = new TextView(this);
        texto.setText("Hola desde GitHub");
        texto.setTextSize(22);
        texto.setGravity(Gravity.CENTER);

        Button boton = new Button(this);
        boton.setText("Pulsar");
        boton.setTransformationMethod(null);
        boton.setOnClickListener(v -> texto.setText("Compilado con éxito"));

        layout.addView(texto);
        layout.addView(boton);
        setContentView(layout);
    }
}
