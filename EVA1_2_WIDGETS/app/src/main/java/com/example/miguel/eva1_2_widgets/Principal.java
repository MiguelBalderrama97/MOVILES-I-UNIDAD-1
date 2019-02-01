package com.example.miguel.eva1_2_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private TextView txtVwMensa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtVwMensa = findViewById(R.id.txtVwMensa);
        txtVwMensa.setText(R.string.mi_recurso);
    }
}
