package com.gaming.know_your_ability;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
ImageView img;
Animation ani;
Timer t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar a=getSupportActionBar();
        a.hide();
        img=(ImageView)findViewById(R.id.i1);
        ani = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animationvisible);
        img.setVisibility(View.VISIBLE);
        img.startAnimation(ani);
        t=new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
            },5000);


    }

}