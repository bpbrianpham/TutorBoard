package com.example.ben.tutorboard;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;      //2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Upon starting the app, this screen appears first
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashActivity.this, PreLogin.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);

        //When finished, it will go into LoginActivity
    }
}
