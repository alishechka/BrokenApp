package com.example.brokenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    private TextView tvNameFromMain;
    private Button btnGotoThirdActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btnGotoThirdActivity = findViewById(R.id.btn_activitySecond);
        setContentView(R.layout.activity_second);

        setTitle("Second Activity");

        String name = getIntent().getStringExtra("Name");

        tvNameFromMain.setText(name);

        btnGotoThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);

                startActivity(intent);
            }
        });


    }
}
