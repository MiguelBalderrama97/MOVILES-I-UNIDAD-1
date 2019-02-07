package com.example.miguel.eva1_7_eventos_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ActivityPrincipal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    private RadioGroup rgIdioma;
    private RadioButton radioButtonEs, radioButtonEn;
    private TextView textViewNom, textViewApe;
    private EditText editTextNom, editTextApe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        rgIdioma = findViewById(R.id.rgIdioma);
        radioButtonEn = findViewById(R.id.radioButtonEn);
        radioButtonEs = findViewById(R.id.radioButtonEs);
        textViewApe = findViewById(R.id.textViewApe);
        textViewNom = findViewById(R.id.textViewNom);
        editTextApe = findViewById(R.id.editTextApe);
        editTextNom = findViewById(R.id.editTextNom);

        rgIdioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.radioButtonEs){
            radioButtonEn.setText(R.string.idioma_en_es);
            radioButtonEs.setText(R.string.idioma_es_es);
            textViewApe.setText(R.string.ape_es);
            textViewNom.setText(R.string.nom_es);
            editTextApe.setHint(R.string.hint_ape_es);
            editTextNom.setHint(R.string.hint_nom_es);
        }else{
            radioButtonEn.setText(R.string.idioma_es_en);
            radioButtonEs.setText(R.string.idioma_en_en);
            textViewApe.setText(R.string.ape_en);
            textViewNom.setText(R.string.nom_en);
            editTextApe.setHint(R.string.hint_ape_en);
            editTextNom.setHint(R.string.hint_nom_en);
        }
    }
}
