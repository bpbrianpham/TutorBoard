package com.example.ben.tutorboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonLog;
    private Button buttonJoin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Sends the user to the login screen from the "Create" button
        buttonLog = (Button) findViewById(R.id.buttonLog);
        buttonLog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });

        //Click Join button -> EnterSession screen
        buttonJoin = (Button)findViewById(R.id.buttonJoin);
        buttonJoin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openJoinActivity();
            }
        });
    }

    public void openLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void openJoinActivity() {
        Intent intent = new Intent(this, EnterSession.class);
        startActivity(intent);
    }

}
