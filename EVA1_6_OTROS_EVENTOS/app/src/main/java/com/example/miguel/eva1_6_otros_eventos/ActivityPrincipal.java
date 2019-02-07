package com.example.miguel.eva1_6_otros_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityPrincipal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    private RadioGroup rgProfes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        rgProfes = findViewById(R.id.rgProfes);
        rgProfes.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch(checkedId){
            case R.id.radioButtonAngelica:
            Toast.makeText(this, "100", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonGloria:
                Toast.makeText(this, "95", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonLorena:
                Toast.makeText(this, "90", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonMartin:
                Toast.makeText(this, "85", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonRuben:
                Toast.makeText(this, "100", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
