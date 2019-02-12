package com.example.miguel.eva1_10_orientacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityPrincipal extends AppCompatActivity {

    private TextView txtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtMsg = findViewById(R.id.txtMsg);

        int iVal = (int)(Math.random() * 100);
        txtMsg.setText(iVal+"");
    }
}
