package com.trios.traditionalfoodrecipeapplication2020mk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter
{

    final int pageCount = 6;
    private String tabTitles [] = new String [] {"about", "Kitfo", "Doro", "Shiro", "Lentil", "Peas"};

    public PageAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new FirstFragment();
            case 1 :
                return new SecondFragment();
            case 2 :
                return new ThirdFragment();
            case 3 :
                return new FourthFragment();
            case 4 :
                return new FifthFragment();
            case 5 :
                return new SixthFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return pageCount;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }
}
