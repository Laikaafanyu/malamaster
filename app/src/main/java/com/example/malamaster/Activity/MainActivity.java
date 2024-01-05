package com.example.malamaster.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.malamaster.R;

public class MainActivity extends AppCompatActivity {

    // Setting the duration of the main screen
    private static final long MAIN_DELAY = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Using handler to delay the transition
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Creating an intent to start the HomeActivity
                Intent intent = new Intent(MainActivity.this, OnboardingActivity.class);
                startActivity(intent);

                // closing the activity
                finish();
            }
        }, MAIN_DELAY);
    }
}