package com.gaming.know_your_ability;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3REGister extends AppCompatActivity {
    Button b;
    EditText edfrst,edlast,eduser,edpss,edcnpss,edemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_r_e_gister);
        ActionBar a=getSupportActionBar();
        a.hide();
        edfrst=(EditText)findViewById(R.id.edtfrstname);
        edlast=(EditText)findViewById(R.id.edtlastname);
        eduser=(EditText)findViewById(R.id.desiredusername);
        edpss=(EditText)findViewById(R.id.pss);
        edcnpss=(EditText)findViewById(R.id.repss);
        edemail=(EditText)findViewById(R.id.validemail);
        b=(Button)findViewById(R.id.res);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edfrst.getText().toString().length()==0){
                    edfrst.setError("First name not entered");
                    edfrst.requestFocus();
                }
                if(edlast.getText().toString().length()==0){
                    edlast.setError("Last name not entered");
                    edlast.requestFocus();
                }
                if(edpss.getText().toString().length()==0){
                    edpss.setError("First name not entered");
                    edpss.requestFocus();
                }
                if(edcnpss.getText().toString().length()==0){
                    edcnpss.setError("First name not entered");
                    edcnpss.requestFocus();
                }
                if (!edpss.getText().toString().equals(edcnpss.getText().toString())){
                    edcnpss.setError("Password Not matched");
                    edcnpss.requestFocus();
                }
                if (edpss.getText().toString().length()<8 ){
                    edpss.setError("Password should be atleat of 8 characters");
                    edpss.requestFocus();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}