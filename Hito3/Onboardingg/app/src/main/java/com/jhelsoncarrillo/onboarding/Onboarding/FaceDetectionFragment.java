package com.jhelsoncarrillo.onboarding.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.jhelsoncarrillo.onboarding.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FaceDetectionFragment extends Fragment {

    private TextView textDoneIns, textPrevIns;
    private ViewPager viewPager;
    private View view;

    public FaceDetectionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //initialize view pager from main activity
        _initializeInflater(inflater, container);

        //initialize components
        _initialize();

        //add click event to text Next and prev text
        _addClickDoneAndPrev();

        //return
        return view;
    }

    public void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_facedetection, container, false);
    }

    public void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textDoneIns = view.findViewById(R.id.textNextIns);
        textPrevIns = view.findViewById(R.id.textPrevIns);
    }

    public void _addClickDoneAndPrev()
    {
        textDoneIns.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(
                        getActivity(),
                        "Finalizo el recorrido de la APP. Done!!!",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

        textPrevIns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
    }
}

