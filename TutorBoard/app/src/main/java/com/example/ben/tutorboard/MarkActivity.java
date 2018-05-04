package com.example.ben.tutorboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MarkActivity extends AppCompatActivity {

    private Button markButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark);

        markButton = (Button) findViewById(R.id.requestMark);
        markButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfoActivity();
            }
        });
    }

    public void openInfoActivity() {
        Intent intent = new Intent(this, MessageActivity.class);
        startActivity(intent);
    }
}
