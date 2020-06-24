package com.jhelsoncarrillo.implementacionlibonboarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.jhelsoncarrillo.mylibraryonboarding.Adapters.OnboardingAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPagerContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(com.jhelsoncarrillo.mylibraryonboarding.R.layout.activity_main);

        //initializeComponents
        _initializeComponents();

        //initializeAdapter
        _initializeFragmentAdapter();
    }

    public void _initializeComponents()
    {
        viewPagerContainer = findViewById(com.jhelsoncarrillo.mylibraryonboarding.R.id.viewPagerContainer);
    }

    public void _initializeFragmentAdapter()
    {
        OnboardingAdapter adapter = new OnboardingAdapter(getSupportFragmentManager());
        viewPagerContainer.setAdapter(adapter);
    }
}
