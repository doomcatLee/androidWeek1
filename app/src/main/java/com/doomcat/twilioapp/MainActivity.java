package com.doomcat.twilioapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.userNameEditText1) EditText mUserNameEditText;

    @Bind(R.id.passwordEditText1) EditText mPasswordEditText;

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

        FormValidator fv = new FormValidator();

        if (v == mLogInButton){

            if (fv.isEmpty(mUserNameEditText, mPasswordEditText)){
                String message = "Please complete all the input fields";
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

            }else{
                Intent intent = new Intent(MainActivity.this, AdminActivity.class);
                String test = mUserNameEditText.getText().toString();
                intent.putExtra("test", test);
                startActivity(intent);
            }
        }
        if (v == mSignUpButton){
            Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(intent);
        }
    }
}
