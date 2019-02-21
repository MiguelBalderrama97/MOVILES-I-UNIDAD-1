package com.example.miguel.p1_cafeteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityPrincipal extends AppCompatActivity {


    private Button btnTotal;
    private TextView txtResumen;
    private RadioGroup radioGroup;
    private RadioButton rdAme, rdCap, rdEx;
    private CheckBox cbAzu, cbCr;
    private EditText etxtCantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        radioGroup = findViewById(R.id.radioGroup);
        btnTotal = findViewById(R.id.btnTotal);
        txtResumen = findViewById(R.id.txtResumen);
        rdAme = findViewById(R.id.rdAme);
        rdCap = findViewById(R.id.rdCap);
        rdEx = findViewById(R.id.rdEx);
        cbAzu = findViewById(R.id.cbAzu);
        cbCr = findViewById(R.id.cbCr);
        etxtCantidad = findViewById(R.id.etxtCantidad);

        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String resumen = "";
                int iTotal = 0;

                if(rdAme.isChecked()){
                    resumen = resumen + "Americano";
                    txtResumen.setText(resumen);
                    iTotal += 20;
                }
                if(rdCap.isChecked()){
                    resumen = resumen+"Capuchino";
                    txtResumen.setText(resumen);
                    iTotal += 48;
                }
                if(rdEx.isChecked()){
                    resumen = resumen+"Expresso";
                    txtResumen.setText(resumen);
                    iTotal += 30;
                }
                if(cbAzu.isChecked()){
                    resumen = resumen+", azúcar";
                    txtResumen.setText(resumen);
                    iTotal ++;
                }
                if(cbCr.isChecked()){
                    resumen = resumen+", crema";
                    txtResumen.setText(resumen);
                    iTotal ++;
                }

                iTotal = iTotal * (Integer.parseInt(etxtCantidad.getText().toString()));

                Toast.makeText(ActivityPrincipal.this, iTotal+"", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
