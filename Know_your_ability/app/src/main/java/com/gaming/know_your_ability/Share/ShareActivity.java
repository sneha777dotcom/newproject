package com.gaming.know_your_ability.Share;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.gaming.know_your_ability.R;
import com.gaming.know_your_ability.Utils.BottomNevigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShareActivity extends AppCompatActivity {


        private static final String TAG = "searchActivity";
        private Context mcontext = ShareActivity.this;
        private static final int ACTIVITY_NUM = 2;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);
            Log.d(TAG, "onCreate: started. ");
            setupBottomNavigationView();
        }


        private void setupBottomNavigationView() {
            Log.d(TAG, "setupBottomNevigationView: setting up BottomNavigationView");
            BottomNavigationViewEx bottomNavigationView = (BottomNavigationViewEx) findViewById(R.id.bottomview);
            BottomNevigationViewHelper.setupBottomNevigationView(bottomNavigationView);
            BottomNevigationViewHelper.enableNavigation(mcontext, bottomNavigationView);
            Menu menu = bottomNavigationView.getMenu();
            MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
            menuItem.setChecked(true);

        }
}
