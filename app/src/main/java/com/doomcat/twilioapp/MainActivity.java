package com.doomcat.twilioapp;

import android.content.Intent;
import android.graphics.Typeface;
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


    @Bind(R.id.textView) TextView mTextView;

    @Bind(R.id.userNameEditText1) EditText mUserNameEditText;

    @Bind(R.id.passwordEditText1) EditText mPasswordEditText;

    @Bind(R.id.signUpTextView) TextView mSignUp;
    @Bind(R.id.logInButton)
    Button mLogInButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        AppService service = new AppService();
        mSignUp.setOnClickListener(this);
        mLogInButton.setOnClickListener(this);

        Typeface titleFont = Typeface.createFromAsset(getAssets(),"fonts/Drifttype.ttf");
        Typeface robotoFont = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Light.ttf");

        mTextView.setTypeface(titleFont);
        TextView[] fonts = {mUserNameEditText, mPasswordEditText};
        service.setFonts(fonts,robotoFont);


    }

    @Override
    public void onClick(View v){

        AppService service = new AppService();

        if (v == mLogInButton){
            if (service.isInputEmpty(mUserNameEditText, mPasswordEditText,mPasswordEditText)){
                String message = "Please complete all the input fields";
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

            }else{
                Intent intent = new Intent(MainActivity.this, AdminActivity.class);
                String userName = mUserNameEditText.getText().toString();
                intent.putExtra("userName", userName);
                startActivity(intent);
            }
        }
        if (v == mSignUp){
            Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(intent);
        }
    }
}
