package com.example.ben.tutorboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DecisionActivity extends AppCompatActivity {

    private Button buttonTutor;
    private Button buttonStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision);

        //Two buttons that will allow the user to go into the infoActivity
        buttonTutor = (Button) findViewById(R.id.buttonTutor);
        buttonTutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfoActivity();
            }
        });

        buttonStudent = (Button) findViewById(R.id.buttonStudent);
        buttonStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfoActivity();
            }
        });
    }

    public void openInfoActivity() {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}
