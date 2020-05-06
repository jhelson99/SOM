package com.jhelsoncarrillo.hito3jhelsoncarrilloortega.App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jhelsoncarrillo.hito3jhelsoncarrilloortega.R;

public class CalcCustom extends AppCompatActivity implements View.OnClickListener
{
    public Button btnuno,btndos,btntres, btncuatro,btncero, btnclose;
    public Button btnsuma,btnresta,btnmulti,btndiv,btnigual, btnexp2, btnexp3, btnfac, btnsumatoria, btnshift, btnborrar;
    public EditText etpantalla;
    public double op1 = 0.0;
    public double op2;
    public double res;
    public String operacion;
    public int c=0;
    public Double op3 = 1.0;
    private TextView tvTypeCalc, tvShowUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_custom);

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

        etpantalla = findViewById(R.id.texto);
        btncero = findViewById(R.id.btcero);
        btnuno = findViewById(R.id.btuno);
        btndos = findViewById(R.id.btdos);
        btntres = findViewById(R.id.bttres);
        btncuatro = findViewById(R.id.btcuatro);
        btnsuma = findViewById(R.id.btsuma);
        btnresta = findViewById(R.id.btresta);
        btnmulti = findViewById(R.id.btmulti);
        btndiv = findViewById(R.id.btdiv);
        btnigual = findViewById(R.id.btigual);
        btnexp2 = findViewById(R.id.btexp2);
        btnexp3 = findViewById(R.id.btexp3);
        btnfac = findViewById(R.id.btfac);
        btnsumatoria = findViewById(R.id.btsumatoria);
        btnshift = findViewById(R.id.btshift);
        btnborrar = findViewById(R.id.btborrar);
        btnclose = findViewById(R.id.btclose);

        btncero.setOnClickListener(this);
        btnuno.setOnClickListener(this);
        btndos.setOnClickListener(this);
        btntres.setOnClickListener(this);
        btncuatro.setOnClickListener(this);
        btnsuma.setOnClickListener(this);
        btnresta.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnigual.setOnClickListener(this);
        btnexp2.setOnClickListener(this);
        btnexp3.setOnClickListener(this);
        btnfac.setOnClickListener(this);
        btnsumatoria.setOnClickListener(this);
        btnshift.setOnClickListener(this);
        btnborrar.setOnClickListener(this);
        btnclose.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btcero:
                String capc = etpantalla.getText().toString();
                capc=capc+"0";
                etpantalla.setText(capc);
                break;
            case R.id.btuno:
                String cap = etpantalla.getText().toString();
                cap=cap+"1";
                etpantalla.setText(cap);
                break;
            case R.id.btdos:
                String cap1 = etpantalla.getText().toString();
                cap1=cap1+"2";
                etpantalla.setText(cap1);
                break;
            case R.id.bttres:
                String cap3 = etpantalla.getText().toString();
                cap3=cap3+"3";
                etpantalla.setText(cap3);
                break;
            case R.id.btcuatro:
                String cap4 = etpantalla.getText().toString();
                cap4=cap4+"3";
                etpantalla.setText(cap4);
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
            case R.id.btdiv:
                div();
                break;
            case R.id.btigual:
                todoslossignos();
                break;
            case R.id.btshift:
                String mod1;
                mod1 = btnexp2.getText().toString();
                if(mod1.equals("x2"))
                {
                    btnexp2.setText("x3");
                    btnexp3.setText("xy");
                    btnfac.setText("Σfibo");
                    btnsumatoria.setText("Σnxy");
                }
                else
                {
                    btnexp2.setText("x2");
                    btnexp3.setText("x3");
                    btnfac.setText("N!");
                    btnsumatoria.setText("Σn");
                }
                break;

            case R.id.btexp2:
                exponente();
                break;

            case R.id.btexp3:
                exponentecub();
                break;

            case R.id.btfac:
                factorial();
                break;

            case R.id.btsumatoria:
                sumatoria();
                break;

            case  R.id.btborrar:
                etpantalla.setText("");
                break;

            case  R.id.btclose:
                finish();
                break;
        }
    }

    public void exponente()
    {
        String mod = btnexp2.getText().toString();
        if(mod.equals("x2"))
        {
            String a = etpantalla.getText().toString();
            Double cua = Double.parseDouble(a);
            Double resp = Math.pow(cua,2);
            etpantalla.setText(""+resp);
        }
        else
        {
            String a = etpantalla.getText().toString();
            Double cua = Double.parseDouble(a);
            Double resp = Math.pow(cua,3);
            etpantalla.setText(""+resp);
        }
    }

    public void exponentecub()
    {
        String mod = btnexp3.getText().toString();
        if(mod.equals("x3"))
        {
            String a = etpantalla.getText().toString();
            Double cua = Double.parseDouble(a);
            Double resp = Math.pow(cua,3);
            etpantalla.setText(""+resp);
        }
        else
        {

        }
    }

    public void factorial()
    {
        String mod = btnfac.getText().toString();
        if(mod.equals("N!"))
        {
            double fact=1.0;
            String auxi = etpantalla.getText().toString();
            Double op11 = Double.parseDouble(auxi);
            for(Double i = op11; i>0; i--)
            {
                fact = fact*i;
            }
            etpantalla.setText(""+fact);
        }
        else
        {

        }
    }

    public void sumatoria()
    {
        String mod = btnsumatoria.getText().toString();
        if(mod.equals("Σn"))
        {

        }
        else
        {

        }
    }


    public void todoslossignos()
    {
        try
        {
            String auxi2 = etpantalla.getText().toString();
            op2 = Double.parseDouble(auxi2);
            //limpiar pantalla al preionar suma

        }
        catch (NumberFormatException e){
        }
        //limpiar pantalla al preionar suma

        etpantalla.setText("");
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
                etpantalla.setText("no puede dividir entre cero");
            }
            else
            {
                res=op1/op2;
            }
        }


        etpantalla.setText(""+res);

        op1 =0.0;
        op3=1.0;
        c=0;
    }


    public void suma()
    {
        try
        {
            String auxi = etpantalla.getText().toString();
            op1 = op1+Double.parseDouble(auxi);
        }
        catch (NumberFormatException e)
        {

        }
        etpantalla.setText("");
        operacion = "suma";
    }
    public void resta()
    {
        try
        {
            op1=0;
            if(c<1)
            {
                String auxi = etpantalla.getText().toString();
                op1 = (Double.parseDouble(auxi))-op1;
                op3=op1;
            }
            else if(c>0)
            {
                String auxi = etpantalla.getText().toString();
                op1 = op3-(Double.parseDouble(auxi));
            }
            //limpiar pantalla al preionar suma
        }
        catch (NumberFormatException e)
        {

        }
        etpantalla.setText("");
        operacion = "resta";
        c++;
    }

    public void multi()
    {
        try
        {
            op1=1;
            String auxi = etpantalla.getText().toString();
            op1 = op3*Double.parseDouble(auxi);
            op3 = op1;
            //numeros[c] = Double.parseDouble(aux);
            //limpiar pantalla al preionar suma
        }
        catch (NumberFormatException e)
        {

        }
        etpantalla.setText("");
        operacion = "multi";
    }

    public void div()
    {
        try
        {
            if(c<1)
            {
                String auxi = etpantalla.getText().toString();
                op1 = Double.parseDouble(auxi)/op3;
                op3 = op1;
            }
            else if(c>0)
            {
                String auxi = etpantalla.getText().toString();
                op1 = op3/Double.parseDouble(auxi);
                op3=op1;
            }
            //limpiar pantalla al preionar suma

        }
        catch (NumberFormatException e)
        {

        }
        etpantalla.setText("");
        operacion = "divi";
        c++;
    }
}
