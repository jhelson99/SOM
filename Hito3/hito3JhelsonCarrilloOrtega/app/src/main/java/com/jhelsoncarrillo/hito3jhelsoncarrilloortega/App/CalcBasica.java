package com.jhelsoncarrillo.hito3jhelsoncarrilloortega.App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.jhelsoncarrillo.hito3jhelsoncarrilloortega.R;

public class CalcBasica extends AppCompatActivity
{

    private TextView tvTypeCalc, tvShowUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_basica);

        initializeComponents();
    }

    private void initializeComponents()
    {
        tvTypeCalc = findViewById(R.id.tvShowTypeCalc);
        tvShowUsername = findViewById(R.id.tvShowUsername);
        String tipocalc = getIntent().getStringExtra("CALCULADORA");
        String msg1 = "App: " + tipocalc;
        String username = getIntent().getStringExtra("USERNAME");
        String msg2 = "Bienvenido: " + username;
        tvTypeCalc.setText(msg1);
        tvShowUsername.setText(msg2);
    }
}
