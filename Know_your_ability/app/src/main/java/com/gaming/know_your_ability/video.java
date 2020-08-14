package com.gaming.know_your_ability;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class video extends AppCompatActivity {
    private static int VIDEO_REQUEST = 101;
    private Uri videouri=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

    }

    public void captureVideo(View view) {
        Intent videointent=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if(videointent.resolveActivity(getPackageManager())!=null)
        {
            startActivityForResult(videointent,VIDEO_REQUEST);
        }
    }

    public void playVideo(View view) {
        Intent playintent=new Intent(this,videoplayActivity.class);
        playintent.putExtra("videoUri",videouri.toString());
        startActivity(playintent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == VIDEO_REQUEST && resultCode == RESULT_OK) {
            videouri = data.getData();
        }
    }
}