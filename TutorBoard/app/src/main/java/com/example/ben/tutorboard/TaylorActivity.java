package com.example.ben.tutorboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TaylorActivity extends AppCompatActivity {

    private Button taylorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taylor);

        //Listens for any tap on buttons
        taylorButton = (Button) findViewById(R.id.requestTaylor);
        taylorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfoActivity();
            }
        });
    }

    //Once tapped on a button, it send the user to the person's messages
    public void openInfoActivity() {
        Intent intent = new Intent(this, MessageActivity.class);
        startActivity(intent);
    }
}
