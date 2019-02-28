package com.example.miguel.p3_orient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActivityPrincipal extends AppCompatActivity {

    private EditText etxtNom, etxtApe, etxtEdad, etxtOrg, etxtEmail;
    private RadioButton rbH, rbM;
    private Button btnAg;

    private List<Tecnicos> tecnicos = new ArrayList<>();
    private String nom, ape, sexo, org, email;
    private int edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }

    @Override
    protected void onStart() {
        super.onStart();
        etxtNom = findViewById(R.id.etxtNom);
        etxtApe = findViewById(R.id.etxtApe);
        etxtEdad = findViewById(R.id.etxtEdad);
        etxtOrg = findViewById(R.id.etxtOrg);
        etxtEmail = findViewById(R.id.etxtEmail);
        rbH = findViewById(R.id.rbH);
        rbM = findViewById(R.id.rbM);
        btnAg = findViewById(R.id.btnAg);

        btnAg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nom = etxtNom.getText().toString();
                ape = etxtApe.getText().toString();
                if(rbH.isChecked()){
                    sexo = "Hombre";
                }else if(rbM.isChecked()){
                    sexo = "Mujer";
                }
                org = etxtOrg.getText().toString();
                email = etxtEmail.getText().toString();
                edad = Integer.parseInt(etxtEdad.getText().toString());

                if(nom.isEmpty() || ape.isEmpty() || sexo.isEmpty() || org.isEmpty() || email.isEmpty() || etxtEdad.getText().toString().isEmpty()){
                    Toast.makeText(ActivityPrincipal.this, "Complete los campos", Toast.LENGTH_SHORT).show();
                }else{
                    boolean bVal = false;
                    for(int i = 0; i < tecnicos.size(); i++){
                        if(email.equals(tecnicos.get(i).getEmail())) {
                            bVal = true;
                        }
                    }

                    if(bVal){
                        Toast.makeText(ActivityPrincipal.this, "Usuario ya agregado", Toast.LENGTH_SHORT).show();
                    }else{
                        tecnicos.add(new Tecnicos(nom,ape,sexo,org,email,edad));
                        Toast.makeText(ActivityPrincipal.this, "Tecnico agregado", Toast.LENGTH_SHORT).show();
                        limpiarCajas();
                    }
                }

                Toast.makeText(ActivityPrincipal.this, "Hay " + tecnicos.size() + " registro(s).", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void limpiarCajas(){
        etxtNom.setText("");
        etxtApe.setText("");
        etxtEdad.setText("");
        etxtOrg.setText("");
        etxtEmail.setText("");
        rbH.setChecked(false);
        rbM.setChecked(false);
    }
}
