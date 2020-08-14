package com.gaming.know_your_ability.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaming.know_your_ability.R;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Homefragment extends Fragment {
    private static final String TAG = "Camerafragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.home_fragment,container,false);
        return view;
    }
}
