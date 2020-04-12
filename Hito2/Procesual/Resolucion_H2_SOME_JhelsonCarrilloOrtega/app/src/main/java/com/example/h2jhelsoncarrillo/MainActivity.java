package com.example.h2jhelsoncarrillo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private Button btnenviar, btnbuscar;
    private EditText tipocaso,numCCocha, numSCocha, numCSanta, numSSanta, numCOruro, numSOruro, numCConfirmados, numCSospechosos, Ciudad;
    private String num1, num2, depto, caso;
    private Integer numCC, numSC, numCSC, numSSC, numCO, numSO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();
    }

    public void initializeVariables()
    {
        numCCocha = findViewById(R.id.etCasosCC);
        numSCocha = findViewById(R.id.etCasosSC);
        numCSanta = findViewById(R.id.etCasosCSC);
        numSSanta = findViewById(R.id.etCasosSSC);
        numCOruro = findViewById(R.id.etCasosCO);
        numSOruro = findViewById(R.id.etCasosSO);

        numCConfirmados = findViewById(R.id.etConfirmados);
        numCSospechosos = findViewById(R.id.etSospechosos);
        Ciudad = findViewById(R.id.etCiudad);

        tipocaso = findViewById(R.id.etNum2);

        btnenviar = findViewById(R.id.btnEnviar);
        btnenviar.setOnClickListener(this);
        btnbuscar= findViewById(R.id.btnBuscar);
        btnbuscar.setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnEnviar:
                num1 = numCConfirmados.getText().toString();
                num2 = numCSospechosos.getText().toString();
                depto = Ciudad.getText().toString();

                switch (depto)
                {
                    case "COCHABAMBA":
                        numCCocha.setText(num1);
                        numSCocha.setText(num2);
                        break;
                    case "SANTA CRUZ":
                        numCSanta.setText(num1);
                        numSSanta.setText(num2);
                        break;
                    case "ORURO":
                        numCOruro.setText(num1);
                        numSOruro.setText(num2);
                        break;
                }
                break;

            case R.id.btnBuscar:

                caso = tipocaso.getText().toString();
                numCC = Integer.parseInt(numCCocha.getText().toString());
                numSC = Integer.parseInt(numSCocha.getText().toString());
                numCSC = Integer.parseInt(numCSanta.getText().toString());
                numSSC = Integer.parseInt(numSSanta.getText().toString());
                numCO = Integer.parseInt(numCOruro.getText().toString());
                numSO = Integer.parseInt(numSOruro.getText().toString());

                if(caso.equals("CONFIRMADOS"))
                {
                    if(numCC > numCSC && numCC > numCO)
                    {
                        Toast.makeText(this.getApplication(), "COCHABAMBA: " + numCC, Toast.LENGTH_LONG).show();
                    }
                    else if(numCSC > numCC && numCSC > numCO)
                    {
                        Toast.makeText(this.getApplication(), "SANTA CRUZ: " + numCSC, Toast.LENGTH_LONG).show();
                    }
                    else if(numCO > numCSC && numCO > numCC)
                    {
                        Toast.makeText(this.getApplication(), "ORURO: " + numCO, Toast.LENGTH_LONG).show();
                    }
                }
                else if(caso.equals("SOSPECHOSOS"))
                {
                    if(numSC > numSSC && numSC > numSO)
                    {
                        Toast.makeText(this.getApplication(), "COCHABAMBA: " + numSC, Toast.LENGTH_LONG).show();
                    }
                    else if(numSSC > numSC && numSSC > numSO)
                    {
                        Toast.makeText(this.getApplication(), "SANTA CRUZ: " + numSSC, Toast.LENGTH_LONG).show();
                    }
                    else if(numSO > numSSC && numSO > numSC)
                    {
                        Toast.makeText(this.getApplication(), "ORURO: " + numSO, Toast.LENGTH_LONG).show();
                    }
                }

                break;
        }
    }
}
