package com.example.android.kazan5places;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

       TextView textView =(TextView) findViewById(R.id.text);
        Intent intent = getIntent();
        String name = intent.getStringExtra("editName");

        textView.setText(name + ", " + getText(R.string.second_text));

    }
    public void sportsButton (View view) {
        Intent intent = new Intent(SecondActivity.this, SportsActivity.class);
        startActivity(intent);
    }
}