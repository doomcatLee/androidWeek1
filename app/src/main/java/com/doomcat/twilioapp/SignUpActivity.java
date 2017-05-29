package com.doomcat.twilioapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{


    @Bind (R.id.signUpButton)
    Button mSignUpButton;

    @Bind (R.id.userNameEditText2)
    EditText mUserNameEditText;

    @Bind (R.id.passwordEditText2)
    EditText mPasswordEditText;

    @Bind (R.id.passwordConfirmEditText2)
    EditText mPasswordConfirmEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
        mSignUpButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        FormValidator fv = new FormValidator();
        if (view == mSignUpButton){
            if (fv.isEmpty(mUserNameEditText, mPasswordEditText, mPasswordConfirmEditText)){
                String message = "Please complete all the input fields";
                Toast.makeText(SignUpActivity.this, message, Toast.LENGTH_LONG).show();

            }else{
                Intent intent = new Intent(SignUpActivity.this, AdminActivity.class);
                startActivity(intent);
            }

        }

    }


}
