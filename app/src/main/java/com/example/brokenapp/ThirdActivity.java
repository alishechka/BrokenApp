package com.example.brokenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ThirdActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private Button btnDismissDialog, btnGoToNextActivity;
    public Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        setTitle("Third Activity");

        progressBar = findViewById(R.id.pb_progressActivityThird);
        btnDismissDialog = findViewById(R.id.btn_dismissProgress);
        btnGoToNextActivity = findViewById(R.id.btn_goToFourthActivity);

        progressBar.setVisibility(View.VISIBLE);
        handler = new Handler(getApplicationContext().getMainLooper());
        btnDismissDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismissDialog();

            }
        });

        btnGoToNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, ForthActivity.class);
                startActivity(intent);
            }
        });
    }


    private void dismissDialog() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);

                    }
                });
            }

        }).start();

    }


}
