package com.jhelsoncarrillo.hito3jhelsoncarrilloortega.Adapters;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.jhelsoncarrillo.hito3jhelsoncarrilloortega.Onboarding.LoginFragment;
import com.jhelsoncarrillo.hito3jhelsoncarrilloortega.Onboarding.PersonFragment;
import com.jhelsoncarrillo.hito3jhelsoncarrilloortega.Onboarding.WelcomeFragment;

public class OnboardingAdapter extends FragmentPagerAdapter
{
    public OnboardingAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new WelcomeFragment();
            case 1:
                return new PersonFragment();
            case 2:
                return new LoginFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return 3;
    }
}

