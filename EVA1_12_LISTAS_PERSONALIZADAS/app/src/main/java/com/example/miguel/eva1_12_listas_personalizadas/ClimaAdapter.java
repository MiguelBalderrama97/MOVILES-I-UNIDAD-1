package com.example.miguel.eva1_12_listas_personalizadas;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ClimaAdapter extends ArrayAdapter <Clima>{

    private Context cApp;
    private int iLayout;
    private Clima[] acDatos;

    public ClimaAdapter(Context context, int resource, Clima[] objects) {
        super(context, resource, objects);
        cApp = context;
        iLayout = resource;
        acDatos = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgClima;
        TextView txtCiudad, txtClima, txtDesc, txtTemp;

        if(convertView == null){ //NO EXISTE LA FILA, HAY QUE CREARLA
            LayoutInflater layoutInflater = ((Activity)cApp).getLayoutInflater();
            convertView = layoutInflater.inflate(iLayout, parent, false);
        }

        imgClima = convertView.findViewById(R.id.imgClima);
        txtCiudad = convertView.findViewById(R.id.txtCiudad);
        txtDesc = convertView.findViewById(R.id.txtDesc);
        txtTemp = convertView.findViewById(R.id.txtTemp);
        txtClima = convertView.findViewById(R.id.txtClima);

        Clima cClima = acDatos[position];
        imgClima.setImageResource(cClima.getImagen_clima());
        txtCiudad.setText(cClima.getCiudad());
        txtDesc.setText(cClima.getDesc_clima());
        txtTemp.setText(cClima.getTemp()+" °C");
        txtClima.setText(cClima.getClima());

        return convertView;
    }
}
