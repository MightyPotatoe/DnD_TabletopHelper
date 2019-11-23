package com.example.dnd_tabletophelper;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterClassChoice extends FragmentStatePagerAdapter {

    private int numberOftabs;

    public PagerAdapterClassChoice(FragmentManager fm, int numberOftabs){
        super(fm);
        this.numberOftabs = numberOftabs;
    }

    @Override
    public Fragment getItem(int position) {
        return new ChooseClassMenuFragment(position);
    }


    @Override
    public int getCount() {
        return numberOftabs;
    }
}
