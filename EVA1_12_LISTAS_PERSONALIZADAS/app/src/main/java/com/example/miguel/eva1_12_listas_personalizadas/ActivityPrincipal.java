package com.example.miguel.eva1_12_listas_personalizadas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ActivityPrincipal extends AppCompatActivity {

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
    }
}
