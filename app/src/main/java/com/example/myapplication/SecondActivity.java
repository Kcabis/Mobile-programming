package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstancestate)
    {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String username = intent.getStringExtra("Username");
        int age = intent.getIntExtra("age",0);
        TextView text = findViewById(R.id.textView);
        text.setTextSize(24);
        text.setText("Username: " + username + "\nAge: " + age);
    }
}