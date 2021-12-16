package com.example.android.internproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hbb20.CountryCodePicker;

public class Chefloginphone extends AppCompatActivity
{
    CountryCodePicker ccp;
    TextView signup;
    EditText t1;
    Button b1,signinemail;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chefloginphone);

        t1=(EditText)findViewById(R.id.number);
        ccp=(CountryCodePicker)findViewById(R.id.ccp);
        ccp.registerCarrierNumberEditText(t1);
        b1=(Button)findViewById(R.id.otp);
        signup = (TextView) findViewById(R.id.acsignup);
        signinemail = (Button)findViewById(R.id.btnEmail);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Chefloginphone.this,Chefsendotp.class);
                intent.putExtra("mobile",ccp.getFullNumberWithPlus().replace(" ",""));
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chefloginphone.this,ChefRegistration.class));
                finish();
            }
        });
        signinemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chefloginphone.this,Login.class));
                finish();
            }
        });
    }
}