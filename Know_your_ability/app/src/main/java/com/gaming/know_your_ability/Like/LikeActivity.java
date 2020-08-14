package com.gaming.know_your_ability.Like;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.gaming.know_your_ability.R;
import com.gaming.know_your_ability.Share.ShareActivity;
import com.gaming.know_your_ability.Utils.BottomNevigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LikeActivity extends AppCompatActivity {
    private static final String TAG = "LikeActivity";
    private Context mcontext = LikeActivity.this;
    private static final int ACTIVITY_NUM = 3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: started. ");
        setupBottomNavigationView();
    }

    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNevigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationView=(BottomNavigationViewEx) findViewById(R.id.bottomview);
        BottomNevigationViewHelper.setupBottomNevigationView(bottomNavigationView);

        BottomNevigationViewHelper.enableNavigation(mcontext,bottomNavigationView);
        Menu menu=bottomNavigationView.getMenu();
        MenuItem menuItem=menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

    }
}
