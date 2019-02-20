package com.example.miguel.eva1_12_listas_personalizadas;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityPrincipal extends AppCompatActivity implements ListView.OnItemClickListener{

    private ListView lstVwCiudades;
    private static Clima[] asClimaCd = {
            new Clima(R.drawable.sunny, "Delicias", "Soleado", "Seco y polvoriento", 17),
            new Clima(R.drawable.sunny, "Entre rios", "Soleado", "Despejado", 24),
            new Clima(R.drawable.rainy, "Cuauhtemoc", "Nublado", "Lluvia asesina", 15),
            new Clima(R.drawable.light_rain, "Juarez", "Parcialmente nublado", "Probabilidad de lluvia", 18),
            new Clima(R.drawable.thunderstorm, "Camargo", "Nublado", "Tormenta electrica", 11),
            new Clima(R.drawable.tornado, "Santa Isabel", "Tornado", "Mucho viento", 17),
            new Clima(R.drawable.snow, "Madera", "Nublado", "Nieve", -2),
            new Clima(R.drawable.atmospher, "Raccoon City", "Niebla", "Poca visibilidad", 22)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lstVwCiudades = findViewById(R.id.lstVwCiudades);
        lstVwCiudades.setAdapter(new ClimaAdapter(this, R.layout.layout_clima, asClimaCd));

        lstVwCiudades.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        final Dialog dlgMiDialog;
        dlgMiDialog = new Dialog(ActivityPrincipal.this);
        //EL LAYOUT
        dlgMiDialog.setContentView(R.layout.cuadro_dialogo);

        ImageView imgClima2;
        TextView txtCiudad2, txtClima2, txtDesc2, txtTemp2;
        Button btnSalir2;

        imgClima2 = dlgMiDialog.findViewById(R.id.imgClima2);
        txtCiudad2 = dlgMiDialog.findViewById(R.id.txtCiudad2);
        txtDesc2 = dlgMiDialog.findViewById(R.id.txtDesc2);
        txtTemp2 = dlgMiDialog.findViewById(R.id.txtTemp2);
        txtClima2 = dlgMiDialog.findViewById(R.id.txtClima2);
        btnSalir2 = dlgMiDialog.findViewById(R.id.btnSalir2);

        imgClima2.setImageResource(asClimaCd[position].getImagen_clima());
        txtCiudad2.setText(asClimaCd[position].getCiudad());
        txtDesc2.setText(asClimaCd[position].getDesc_clima());
        txtTemp2.setText(asClimaCd[position].getTemp()+" °C");
        txtClima2.setText(asClimaCd[position].getClima());

        btnSalir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlgMiDialog.dismiss();
            }
        });

        dlgMiDialog.show();
    }
}
