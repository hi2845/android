package com.example.hi284.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sungbuk(View v) {
        Button btn = (Button)findViewById(R.id.button1);
        Intent intent = new Intent(getApplicationContext(), Restaurant.class);
        startActivity(intent);
    }
}
