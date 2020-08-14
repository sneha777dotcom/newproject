package com.gaming.know_your_ability.Home;

import java.util.ArrayList;
import java.util.List;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Section_page_Adapter extends FragmentPagerAdapter {
    private static final String TAG = "Section_page_Adapter";
    private final List<Fragment>mfagmentsList= new ArrayList<>();

    public Section_page_Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mfagmentsList.get(position);
    }

    @Override
    public int getCount() {
        return mfagmentsList.size();
    }
    public void addFragment(Fragment fragment){
        mfagmentsList.add(fragment);
    }
}
