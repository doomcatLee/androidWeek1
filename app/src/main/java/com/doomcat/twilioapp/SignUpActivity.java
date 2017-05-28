package com.doomcat.twilioapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import butterknife.Bind;
import butterknife.ButterKnife;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{


    @Bind (R.id.signUpButton)
    Button mSignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
        mSignUpButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view){
        if (view == mSignUpButton){
            Intent intent = new Intent(SignUpActivity.this, AdminActivity.class);
            startActivity(intent);
        }

    }


}
