package com.example.miguel.p2_exp_vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ActivityPrincipal extends AppCompatActivity{

    private EditText etxtAnio;
    private TextView txtExp, txtDie;
    private RadioGroup rg;
    private RadioButton rbReg, rbAme, rbAsia, rbAf, rbH, rbM;

    private int annio, die, life, gen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        etxtAnio = findViewById(R.id.etxtAnio);
        txtDie = findViewById(R.id.txtDie);
        txtExp = findViewById(R.id.txtExp);
        rg = findViewById(R.id.radioGroup);
        rbReg = findViewById(R.id.rbReg);
        rbAsia = findViewById(R.id.rbAsia);
        rbAme = findViewById(R.id.rbAme);
        rbAf = findViewById(R.id.rbAf);
        rbH = findViewById(R.id.rbH);
        rbM = findViewById(R.id.rbM);

        etxtAnio.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() > 0){
                    annio = Integer.parseInt(s.toString());
                    if(rbReg.isChecked()){
                        if(annio >= 1950 && annio < 1960){
                            life = 75;
                            gen = 10;
                        }else if(annio >= 1960 && annio < 1970){
                            life = 75;
                            gen = 9;
                        }else if(annio >= 1970 && annio < 1980){
                            life = 80;
                            gen = 8;
                        }else if(annio >= 1980 && annio < 1990){
                            life = 80;
                            gen = 7;
                        }else if(annio >= 1990 && annio < 2000){
                            life = 85;
                            gen = 6;
                        }else if(annio >= 2000 && annio <= 2019){
                            life = 90;
                            gen = 9;
                        }else if(annio > 2019 || annio < 1950){
                            life = 0;
                            gen = 0;
                            annio = 0;
                        }
                    }
                    if(rbAme.isChecked()){
                        if(annio >= 1950 && annio < 1960){
                            life = 60;
                            gen = 10;
                        }else if(annio >= 1960 && annio < 1970){
                            life = 65;
                            gen = 9;
                        }else if(annio >= 1970 && annio < 1980){
                            life = 70;
                            gen = 8;
                        }else if(annio >= 1980 && annio < 1990){
                            life = 75;
                            gen = 7;
                        }else if(annio >= 1990 && annio < 2000){
                            life = 75;
                            gen = 6;
                        }else if(annio >= 2000 && annio <= 2019){
                            life = 70;
                            gen = 9;
                        }else if(annio > 2019 || annio < 1950){
                            life = 0;
                            gen = 0;
                            annio = 0;
                        }
                    }
                    if(rbAsia.isChecked()){
                        if(annio >= 1950 && annio < 1960){
                            life = 45;
                            gen = 10;
                        }else if(annio >= 1960 && annio < 1970){
                            life = 50;
                            gen = 9;
                        }else if(annio >= 1970 && annio < 1980){
                            life = 65;
                            gen = 8;
                        }else if(annio >= 1980 && annio < 1990){
                            life = 65;
                            gen = 7;
                        }else if(annio >= 1990 && annio < 2000){
                            life = 60;
                            gen = 6;
                        }else if(annio >= 2000 && annio <= 2019){
                            life = 65;
                            gen = 9;
                        }else if(annio > 2019 || annio < 1950){
                            life = 0;
                            gen = 0;
                            annio = 0;
                        }
                    }
                    if(rbAf.isChecked()){
                        if(annio >= 1950 && annio < 1960){
                            life = 35;
                            gen = 10;
                        }else if(annio >= 1960 && annio < 1970){
                            life = 45;
                            gen = 9;
                        }else if(annio >= 1970 && annio < 1980){
                            life = 55;
                            gen = 8;
                        }else if(annio >= 1980 && annio < 1990){
                            life = 60;
                            gen = 7;
                        }else if(annio >= 1990 && annio < 2000){
                            life = 55;
                            gen = 6;
                        }else if(annio >= 2000 && annio <= 2019){
                            life = 60;
                            gen = 9;
                        }else if(annio > 2019 || annio < 1950){
                            life = 0;
                            gen = 0;
                            annio = 0;
                        }
                    }

                    if(rbH.isChecked()){
                        gen = gen /2;
                        life = life - gen;
                    }

                    if(rbM.isChecked()){
                        gen = gen /2;
                        life = life + gen;
                    }

                    txtExp.setText(life+"");
                    die = life + annio;
                    txtDie.setText(die+"");
                }
            }
        });

    }

}
