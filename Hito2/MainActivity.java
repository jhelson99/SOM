package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    private Button butt1;
    private TextView txt1;
    private EditText edt1;
    private EditText edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();
    }

    public void initializeVariables()
    {
        butt1 = findViewById(R.id.button1);
        butt1.setText("Sumar");
        butt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Integer a = Integer.parseInt(edt1.getText().toString());
                Integer b = Integer.parseInt(edt2.getText().toString());
                Integer contenido = a+b;
                txt1.setText(contenido.toString());
            }
        });
        txt1 = findViewById(R.id.text1);
        txt1.setText("Estudiante: Jhelson Carrillo Ortega");

        edt1 = findViewById(R.id.et1);
        edt2 = findViewById(R.id.et2);


    }

}
