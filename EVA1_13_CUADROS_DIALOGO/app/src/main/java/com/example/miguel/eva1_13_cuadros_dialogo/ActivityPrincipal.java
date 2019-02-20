package com.example.miguel.eva1_13_cuadros_dialogo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityPrincipal extends AppCompatActivity {

    private Button btnDef, btnProp;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnDef = findViewById(R.id.btnDef);
        btnProp = findViewById(R.id.btnProp);

        btnDef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(ActivityPrincipal.this)
                        .setTitle("Cuadro de dialogo de Android")
                        .setMessage("Hola mundo cruel!!!")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(ActivityPrincipal.this,"Si!!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ActivityPrincipal.this,"No!!", Toast.LENGTH_SHORT).show();
                    }
                }).setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ActivityPrincipal.this,"Equis we!!", Toast.LENGTH_SHORT).show();
                    }
                }).create().show();
            }
        });

        btnProp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dlgMiDialog;
                dlgMiDialog = new Dialog(ActivityPrincipal.this);
                //EL LAYOUT
                dlgMiDialog.setContentView(R.layout.cuadro_dialogo);

                Button btnOk;
                final EditText etxtCapture;
                TextView txtTitle;

                btnOk = dlgMiDialog.findViewById(R.id.btnOk);
                etxtCapture = dlgMiDialog.findViewById(R.id.etxtCapture);
                txtTitle = dlgMiDialog.findViewById(R.id.txtTitle);

                txtTitle.setText("Mi cuadro de dialogo");
                btnOk.setText("OK");
                etxtCapture.setHint("Introduce tu nombre");
                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ActivityPrincipal.this, etxtCapture.getText().toString(), Toast.LENGTH_SHORT).show();
                    }
                });

                dlgMiDialog.show();
            }
        });


    }
}
