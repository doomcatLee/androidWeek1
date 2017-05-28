package com.doomcat.twilioapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.signUpButton)
    Button mSignUpButton;

    @Bind(R.id.logInButton)
    Button mLogInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mSignUpButton.setOnClickListener(this);
        mLogInButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v == mLogInButton){
            Intent intent = new Intent(MainActivity.this, AdminActivity.class);
            startActivity(intent);
        }
        if (v == mSignUpButton){
            Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(intent);
        }
    }
}
