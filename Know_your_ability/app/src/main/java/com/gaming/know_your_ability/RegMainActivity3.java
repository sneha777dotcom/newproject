package com.gaming.know_your_ability;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.gaming.know_your_ability.Home.HomeActivity;

public class RegMainActivity3 extends AppCompatActivity {
    Button b,b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_main3);
        ActionBar a=getSupportActionBar();
        a.hide();
        b=(Button)findViewById(R.id.register);
        b1=(Button)findViewById(R.id.login);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegMainActivity3.this, HomeActivity.class);
                startActivity(i);

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                            Intent i = new Intent(RegMainActivity3.this,MainActivity3REGister.class);
                        startActivity(i);
                    }
                });
            }
        });
           }
}