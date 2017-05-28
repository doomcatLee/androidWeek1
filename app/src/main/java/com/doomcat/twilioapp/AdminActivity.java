package com.doomcat.twilioapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AdminActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.submitButton)
    Button mSubmitButton;

    @Bind(R.id.contentListView)
    ListView mContentListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View v){
        if (v == mSubmitButton){
            Intent intent = new Intent(AdminActivity.this, AdminActivity.class);
            startActivity(intent);
        }

    }
}
