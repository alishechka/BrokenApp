package com.example.brokenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class ForthActivity extends AppCompatActivity {
private TextView welcomeMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);
        welcomeMessage=findViewById(R.id.tv_forthActivity);
        setTitle("Fourth Activity");
    }
}
