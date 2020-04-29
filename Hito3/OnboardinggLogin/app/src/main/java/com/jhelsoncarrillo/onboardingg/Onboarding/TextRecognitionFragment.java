package com.jhelsoncarrillo.onboardingg.Onboarding;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jhelsoncarrillo.onboardingg.R;

/**
 * A simple {@link Fragment} subclass.
 */

public class TextRecognitionFragment extends Fragment
{
    private TextView textPrevFace, textNextFace;
    private ViewPager viewPager;
    private View view;

    public TextRecognitionFragment()
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
        addClickNextAndPrev();

        //return
        return view;
    }

    public void initializeInflater(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_textrecognition, container, false);
    }

    public void initializeComponents()
    {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textPrevFace = view.findViewById(R.id.textPrevTextRecognition);
        textNextFace = view.findViewById(R.id.textNextTextRecognition);
    }

    public void addClickNextAndPrev()
    {

        textPrevFace.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewPager.setCurrentItem(0);
            }
        });

        textNextFace.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewPager.setCurrentItem(2);
            }
        });
    }
}
