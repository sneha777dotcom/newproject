package com.gaming.know_your_ability.Home;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.gaming.know_your_ability.R;
import com.gaming.know_your_ability.Utils.BottomNevigationViewHelper;
import com.google.android.material.tabs.TabLayout;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    private final static int ACTIVITY_NUM=0;
    private Context context=HomeActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupBottomNevigationView();
        setupViewPager();
    }
    private void setupViewPager(){
        Section_page_Adapter adapter=new Section_page_Adapter(getSupportFragmentManager());
        adapter.addFragment(new Camerafragment());
        adapter.addFragment(new Messagesfragment());
        adapter.addFragment(new Homefragment());
        ViewPager viewPager=(ViewPager)findViewById(R.id.container);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout=(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_send);
        tabLayout.getTabAt(0).getIcon().setColorFilter(getResources().getColor(R.color.grey), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.grey), PorterDuff.Mode.SRC_IN);




    }
    private void setupBottomNevigationView(){
        Log.d(TAG, "setupBottomNevigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationView=(BottomNavigationViewEx) findViewById(R.id.bottomview);
        BottomNevigationViewHelper.setupBottomNevigationView(bottomNavigationView);
        BottomNevigationViewHelper.enableNavigation(context,bottomNavigationView);
        Menu menu=bottomNavigationView.getMenu();
        MenuItem menuItem=menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

    }
}