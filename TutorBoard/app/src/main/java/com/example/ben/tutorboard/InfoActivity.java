package com.example.ben.tutorboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {

    private Button buttonCont;

    private EditText firstNameView;  String firstName;
    private EditText lastNameView;  String lastName;
    private EditText emailView;     String email;
    private EditText subjectView;   String subject;
    private EditText bioView;       String bio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        //The user's information will be saved and will be moved into the HomeActivity
        firstNameView = findViewById(R.id.firstName);
        lastNameView = findViewById(R.id.lastName);
        emailView = findViewById(R.id.email);
        subjectView = findViewById(R.id.mastery);
        bioView = findViewById(R.id.bio);


        buttonCont = (Button) findViewById(R.id.buttonCont);
        buttonCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });
    }


    public void openHomeActivity() {
        firstName = firstNameView.getText().toString();
        lastName = lastNameView.getText().toString();
        email = emailView.getText().toString();
        subject = subjectView.getText().toString();
        bio = bioView.getText().toString();

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
