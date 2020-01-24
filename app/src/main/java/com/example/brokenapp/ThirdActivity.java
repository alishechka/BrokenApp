package com.example.brokenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.brokenapp.R;

public class ThirdActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private Button btnDismissDialog, btnToNextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Third Activity");

        progressBar=findViewById(R.id.pb_progress_activityThird);
        btnDismissDialog=findViewById(R.id.btn_goToSecondActivity);
        btnToNextActivity.findViewById(R.id.btn_thirdActivity_next_activity);


        btnDismissDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismissDialog();

            }
        });

        btnToNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this,ThirdActivity.class);

                startActivity(intent);

            }
        });
    }


    private void dismissDialog(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);

            }
        }).start();

    }



}
