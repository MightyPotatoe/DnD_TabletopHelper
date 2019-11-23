package com.example.dnd_tabletophelper;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterClassInfo extends FragmentStatePagerAdapter {

    private int numberOftabs;
    private int whichClass;

    public PagerAdapterClassInfo(FragmentManager fm, int numberOftabs, int whichClass) {
        super(fm);
        this.numberOftabs = numberOftabs;
        this.whichClass = whichClass;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ClassOverviewFragment(whichClass);
            case 1:
                return new ClassAbilityTableFragment(whichClass);
                default:
                    return null;
        }
    }


    @Override
    public int getCount() {
        return numberOftabs;
    }
}

