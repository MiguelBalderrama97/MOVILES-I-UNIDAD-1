package com.example.miguel.eva1_12_listas_personalizadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    private ImageView imgClima;
    private TextView txtCiudad, txtTemp, txtClima, txtDesc;
    private Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        imgClima = findViewById(R.id.imgClima3);
        txtCiudad = findViewById(R.id.txtCiudad3);
        txtTemp = findViewById(R.id.txtTemp3);
        txtClima = findViewById(R.id.txtClima3);
        txtDesc = findViewById(R.id.txtDesc3);
        btnClose = findViewById(R.id.btnClose);

        Intent inDatos = getIntent();
        Bundle bDatos = inDatos.getExtras();

        imgClima.setImageResource(bDatos.getInt("Imagen"));
        txtCiudad.setText(bDatos.getString("Ciudad"));
        txtTemp.setText(bDatos.getDouble("Temperatura")+" °C");
        txtClima.setText(bDatos.getString("Clima"));
        txtDesc.setText(bDatos.getString("Descripcion"));

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
