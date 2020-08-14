package com.gaming.know_your_ability.Profile;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


import com.gaming.know_your_ability.Profile.AccountSettingActivity;
import com.gaming.know_your_ability.R;
import com.gaming.know_your_ability.Utils.BottomNevigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "searchActivity";
    private Context mcontext= ProfileActivity.this;
    private static final int ACTIVITY_NUM=4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started. ");
        setupBottomNavigationView();
       setupToolbar();
    }
    private void setupToolbar() {
        Toolbar toolbar= (Toolbar) findViewById(R.id.profileToolbar);
        setSupportActionBar(toolbar);
        ImageView profileMenu=(ImageView)findViewById(R.id.ProfileMenu);
        profileMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: nevigating to account setting.");
                Intent intent=new Intent(mcontext, AccountSettingActivity.class);
                startActivity(intent);
            }
        });

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


