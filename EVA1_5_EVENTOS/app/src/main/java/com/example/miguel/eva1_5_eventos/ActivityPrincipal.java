package com.example.miguel.eva1_5_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityPrincipal extends AppCompatActivity implements View.OnClickListener{ //IMPLEMENTS CASO 2

    private Button btnListener, btnClaseAn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnListener = findViewById(R.id.btnListener);
        btnClaseAn = findViewById(R.id.btnClaseAn);
//        CASO 2
        btnListener.setOnClickListener(this);

//        CASO 3
        btnClaseAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Evento generado por clase anónima",Toast.LENGTH_SHORT).show();
            }
        });
    }
//    CASO 1 - Agregar el nombre del metodo en la propiedad onClick del boton en el XML
    public void onClicker(View v){
        Toast.makeText(this,"Evento generado por propiedad onClicker",Toast.LENGTH_SHORT).show();
    }

//    CASO 2
    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Evento generado por listener",Toast.LENGTH_SHORT).show();
    }
}
