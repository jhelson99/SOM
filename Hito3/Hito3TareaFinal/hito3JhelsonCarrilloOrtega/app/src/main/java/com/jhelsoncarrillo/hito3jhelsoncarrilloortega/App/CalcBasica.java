package com.jhelsoncarrillo.hito3jhelsoncarrilloortega.App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jhelsoncarrillo.hito3jhelsoncarrilloortega.R;

public class CalcBasica extends AppCompatActivity implements View.OnClickListener
{
    private TextView tvTypeCalc, tvShowUsername;

    public Button btnuno,btndos,btntres,btncuatro,btncinco,btnseis,btnsiete,btnocho,btnnueve,btncero;
    public Button btnpunto,btnsuma,btnresta,btnmulti,btndiv,btnigual,btnelimi,btnborrar;
    public EditText pant;
    public double op1 = 0.0;
    public double op2;
    public double res;
    public String operacion;
    public int c=0;
    public Double op3 = 1.0;
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

        pant=findViewById(R.id.texto);
        btncero=findViewById(R.id.btcero);
        btnuno=findViewById(R.id.btuno);
        btndos= findViewById(R.id.btdos);
        btntres=findViewById(R.id.bttres);
        btncuatro= findViewById(R.id.btcuatro);
        btncinco=findViewById(R.id.btcinco);
        btnseis= findViewById(R.id.btseis);
        btnsiete=findViewById(R.id.btsiete);
        btnocho= findViewById(R.id.btocho);
        btnnueve=findViewById(R.id.btnueve);
        btnsuma = findViewById(R.id.btsuma);
        btnresta = findViewById(R.id.btresta);
        btnmulti = findViewById(R.id.btmulti);
        btndiv = findViewById(R.id.btdivi);
        btnigual = findViewById(R.id.btigual);
        btnpunto = findViewById(R.id.btpunto);
        btnelimi = findViewById(R.id.btborraruno);
        btnborrar = findViewById(R.id.btborrar);

        btnigual.setOnClickListener(this);
        btncero.setOnClickListener(this);
        btnuno.setOnClickListener(this);
        btndos.setOnClickListener(this);
        btntres.setOnClickListener(this);
        btncuatro.setOnClickListener(this);
        btncinco.setOnClickListener(this);
        btnseis.setOnClickListener(this);
        btnsiete.setOnClickListener(this);
        btnocho.setOnClickListener(this);
        btnnueve.setOnClickListener(this);
        btnsuma.setOnClickListener(this);
        btnresta.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnpunto.setOnClickListener(this);
        btnelimi.setOnClickListener(this);
        btnborrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btcero:
                String capc = pant.getText().toString();
                capc=capc+"0";
                pant.setText(capc);
                break;
            case R.id.btuno:
                String cap = pant.getText().toString();
                cap=cap+"1";
                pant.setText(cap);
                break;
            case R.id.btdos:
                String cap1 = pant.getText().toString();
                cap1=cap1+"2";
                pant.setText(cap1);
                break;
            case R.id.bttres:
                String cap3 = pant.getText().toString();
                cap3=cap3+"3";
                pant.setText(cap3);
                break;
            case R.id.btcuatro:
                String cap4 = pant.getText().toString();
                cap4=cap4+"4";
                pant.setText(cap4);
                break;
            case R.id.btcinco:
                String cap5 = pant.getText().toString();
                cap5=cap5+"5";
                pant.setText(cap5);
                break;
            case R.id.btseis:
                String cap6 = pant.getText().toString();
                cap6=cap6+"6";
                pant.setText(cap6);
                break;
            case R.id.btsiete:
                String cap7 = pant.getText().toString();
                cap7=cap7+"7";
                pant.setText(cap7);
                break;
            case R.id.btocho:
                String cap8 = pant.getText().toString();
                cap8=cap8+"8";
                pant.setText(cap8);
                break;
            case R.id.btnueve:
                String cap9 = pant.getText().toString();
                cap9=cap9+"9";
                pant.setText(cap9);
                break;

            case R.id.btsuma:
                suma();
                break;
            case R.id.btresta:
                resta();
                break;
            case R.id.btmulti:
                multi();
                break;
            case R.id.btdivi:
                div();
                break;
            case R.id.btigual:
                todoslossignos();
                break;
            case  R.id.btborrar:
                pant.setText("");
                break;
            case  R.id.btpunto:
                String c = pant.getText().toString();
                if(c.length() <=0)
                {
                    pant.setText("0.");
                }
                else
                {
                    c=c+".";
                }
                pant.setText(c);
                break;
            case  R.id.btborraruno:
                String cc = pant.getText().toString();
                if(cc.length()>0)
                {
                    cc = cc.substring(0,cc.length()-1);
                    pant.setText(cc);
                }
                break;
        }
    }


    public void todoslossignos()
    {
        try
        {
            String auxi2 = pant.getText().toString();
            op2 = Double.parseDouble(auxi2);
            //limpiar pantalla al preionar suma

        }
        catch (NumberFormatException e)
        {

        }

        pant.setText("");
        if(operacion.equals("suma"))
        {
            res = op1+op2;
        }
        else if(operacion.equals("resta"))
        {
            res=op1-op2;
        }
        else if(operacion.equals("multi"))
        {
            res=op1*op2;
        }
        else if(operacion.equals("div"))
        {
            if(op2==0)
            {
                pant.setText("no puede dividir entre cero");
            }
            else
            {
                res=op1/op2;
            }
        }


        pant.setText(""+res);

        op1 =0.0;
        op3=1.0;
        c=0;
    }


    public void suma()
    {
        try
        {
            String auxi = pant.getText().toString();
            op1 = op1+Double.parseDouble(auxi);
        }
        catch (NumberFormatException e)
        {

        }
        pant.setText("");
        operacion = "suma";
    }
    public void resta()
    {
        try
        {
            op1=0;
            if(c<1)
            {
                String auxi = pant.getText().toString();
                op1 = (Double.parseDouble(auxi))-op1;
                op3=op1;
            }
            else if(c>0)
            {
                String auxi = pant.getText().toString();
                op1 = op3-(Double.parseDouble(auxi));
            }
            //limpiar pantalla al preionar suma
        }
        catch (NumberFormatException e)
        {

        }
        pant.setText("");
        operacion = "resta";
        c++;
    }

    public void multi()
    {
        try
        {
            op1=1;
            String auxi = pant.getText().toString();
            op1 = op3*Double.parseDouble(auxi);
            op3 = op1;
            //numeros[c] = Double.parseDouble(aux);
            //limpiar pantalla al preionar suma
        }
        catch (NumberFormatException e)
        {

        }
        pant.setText("");
        operacion = "multi";
    }

    public void div()
    {
        try
        {

            if(c<1)
            {
                String auxi = pant.getText().toString();
                op1 = Double.parseDouble(auxi)/op3;
                op3 = op1;
            }
            else if(c>0)
            {
                String auxi = pant.getText().toString();
                op1 = op3/Double.parseDouble(auxi);
                op3=op1;
            }
            //limpiar pantalla al preionar suma

        }
        catch (NumberFormatException e)
        {

        }
        pant.setText("");
        operacion = "divi";
        c++;
    }
}
