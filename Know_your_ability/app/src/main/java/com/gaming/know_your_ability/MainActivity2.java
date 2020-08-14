package com.gaming.know_your_ability;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {

     VideoView mvideoview;
     Uri u;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar a=getSupportActionBar();
        a.hide();
        mvideoview=(VideoView) findViewById(R.id.videoview1);
       u=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
       mvideoview.setVideoURI(u);
       mvideoview.start();
       b=(Button)findViewById(R.id.bt1);
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(MainActivity2.this, RegMainActivity3.class);
               startActivity(i);
           }
       });
    }
}