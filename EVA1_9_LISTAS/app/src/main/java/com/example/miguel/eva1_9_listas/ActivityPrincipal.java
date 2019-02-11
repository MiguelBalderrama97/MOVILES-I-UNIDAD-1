package com.example.miguel.eva1_9_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ActivityPrincipal extends AppCompatActivity implements ListView.OnItemClickListener{

    private ListView listTitu;
    private TextView txtVwDesc;
    private static String[] asPelis = {"DBS: Broly", "Interestelar", "Python", "El gran torino", "Volver al futuro", "La mula", "Million Dollar Baby", "Truman Show", "Forest Gump", "Harry Potter"};

    private static String[] asSinop = {"Después de disputarse el Torneo de la Fuerza, la Tierra se encuentra en paz. Goku al darse cuenta de que en el universo aún hay personas extremadamente fuertes, continúa entrenando para volverse más fuerte.", "Interestelar", "Python", "El gran torino", "Volver al futuro", "La mula", "Million Dollar Baby", "Truman Show", "Forest Gump", "Harry Potter"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        listTitu = findViewById(R.id.listTitu);
        txtVwDesc = findViewById(R.id.txtVwDesc);
        txtVwDesc.setText("Descripción aqui!");

        listTitu.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, asPelis));

        listTitu.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        txtVwDesc.setText(asSinop[position]);
    }
}
