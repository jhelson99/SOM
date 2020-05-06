package com.jhelsoncarrillo.hito3jhelsoncarrilloortega.Onboarding;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jhelsoncarrillo.hito3jhelsoncarrilloortega.App.CalcBasica;
import com.jhelsoncarrillo.hito3jhelsoncarrilloortega.App.CalcCientifica;
import com.jhelsoncarrillo.hito3jhelsoncarrilloortega.App.CalcCustom;
import com.jhelsoncarrillo.hito3jhelsoncarrilloortega.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment
{
    private ViewPager viewPager;
    private View view;
    private Button btmensBasic, btmensCient, btmensCust;
    private Button btselecBasic, btselectCient, btselectCust;
    private Button btIngresar;
    private EditText etUsername, etType;

    public LoginFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //initialize viewpager from main activity
        initializeInflater(inflater, container);

        //initialize components
        initializeComponents();

        //add click event to text Next and prev text
        eventClickAction();

        //return
        return view;
    }

    public void initializeInflater(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_login, container, false);
    }

    public void initializeComponents()
    {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);

        btmensBasic = view.findViewById(R.id.btMensBasic);
        btmensCient = view.findViewById(R.id.btMensCientif);
        btmensCust = view.findViewById(R.id.btMensCustom);

        btselecBasic = view.findViewById(R.id.btSelectBasic);
        btselectCient = view.findViewById(R.id.btSelectCient);
        btselectCust = view.findViewById(R.id.btSelectCust);

        etType = view.findViewById(R.id.etType);
        etUsername = view.findViewById(R.id.etUsername);

        btIngresar = view.findViewById(R.id.btLogin);
    }

    public void eventClickAction()
    {
        btmensBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "Calculadora con operaciones simples basica", Toast.LENGTH_SHORT).show();
            }
        });

        btmensCient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "Calculadora con operaciones avanzadas", Toast.LENGTH_SHORT).show();
            }
        });

        btmensCust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "Calculadora con operaciones para programadores", Toast.LENGTH_SHORT).show();
            }
        });

        btselecBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                etType.setText("Basica");
            }
        });

        btselectCient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                etType.setText("Cientifica");
            }
        });

        btselectCust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                etType.setText("Custom");
            }
        });

        btIngresar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String tipocalc = etType.getText().toString().trim();
                String username = etUsername.getText().toString().trim();

                if( tipocalc.equals("") || username.equals(""))
                {
                    Toast.makeText(getActivity(), "Faltan campos que llenar!", Toast.LENGTH_SHORT).show();
                }

                else if(tipocalc.equals("Basica"))
                {
                    Intent intent = new Intent(getActivity(), CalcBasica.class);
                    intent.putExtra("CALCULADORA", tipocalc);
                    intent.putExtra("USERNAME", username);
                    startActivity(intent);
                    getActivity().finish();
                }
                else if(tipocalc.equals("Cientifica"))
                {
                    Intent intent = new Intent(getActivity(), CalcCientifica.class);
                    intent.putExtra("CALCULADORA", tipocalc);
                    intent.putExtra("USERNAME", username);
                    startActivity(intent);
                    getActivity().finish();
                }
                else if(tipocalc.equals("Custom"))
                {
                    Intent intent = new Intent(getActivity(), CalcCustom.class);
                    intent.putExtra("CALCULADORA", tipocalc);
                    intent.putExtra("USERNAME", username);
                    startActivity(intent);
                    getActivity().finish();
                }


            }
        });
    }
}
