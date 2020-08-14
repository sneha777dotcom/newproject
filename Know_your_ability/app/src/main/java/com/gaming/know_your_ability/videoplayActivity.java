package com.gaming.know_your_ability;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class videoplayActivity extends AppCompatActivity {
private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoplay);

        Uri videouri=Uri.parse(getIntent().getExtras().getString("videoUri"));
        videoView.setVideoURI(videouri);
        videoView.start();
    }
}