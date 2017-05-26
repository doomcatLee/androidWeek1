package com.doomcat.twilioapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.submitButton)
    Button mSubmitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View v){
        if (v == mSubmitButton){
            Intent intent = new Intent(FirstActivity.this, ResultActivity.class);
            startActivity(intent);
        }

    }
}
