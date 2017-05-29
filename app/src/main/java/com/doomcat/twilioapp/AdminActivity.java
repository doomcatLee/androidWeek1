package com.doomcat.twilioapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AdminActivity extends AppCompatActivity implements View.OnClickListener {
    private String[] users = new String[] {
            "Alex",
            "Jane",
            "James",
            "Taylor",
            "Luke",
            "Tiger"
    };

    @Bind(R.id.contentListView)
    ListView mContentListView;

    @Bind(R.id.textView2) TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        ButterKnife.bind(this);

        Typeface robotoFont = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Thin.ttf");

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        mTextView.setText("Welcome back " + userName + "!");
        mTextView.setTypeface(robotoFont);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        mContentListView.setAdapter(adapter);

        mContentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String userName = "You clicked " + ((TextView)view).getText().toString() + "!";
                Toast.makeText(AdminActivity.this, userName, Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public void onClick(View v){

    }
}
