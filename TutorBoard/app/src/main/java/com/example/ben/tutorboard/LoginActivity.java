package com.example.ben.tutorboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button buttonLog;
    private Button buttonCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //If login is successful, goes to home
        buttonLog = (Button) findViewById(R.id.login);
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        buttonCreate = (Button) findViewById(R.id.create);
        buttonCreate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openDecisionActivity();
            }
        });
    }

    public void openHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void openDecisionActivity() {
        Intent intent = new Intent (this, DecisionActivity.class);
        startActivity(intent);
    }
}
