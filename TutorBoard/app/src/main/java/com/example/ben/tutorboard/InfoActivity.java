package com.example.ben.tutorboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class InfoActivity extends AppCompatActivity {

    private ImageView buttonCont;

    private EditText firstNameView;  String firstName;
    private EditText lastNameView;  String lastName;
    private EditText emailView;     String email;
    private EditText bioView;       String bio;

    private Spinner subjectSpinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        subjectSpinner = findViewById(R.id.mastery_spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.subjects_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subjectSpinner.setAdapter(adapter);

        //The user's information will be saved and will be moved into the HomeActivity
        firstNameView = findViewById(R.id.firstName);
        lastNameView = findViewById(R.id.lastName);
        emailView = findViewById(R.id.email);
        subjectSpinner = findViewById(R.id.mastery_spinner);
        bioView = findViewById(R.id.bio);


        buttonCont = findViewById(R.id.next_button2);
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
        bio = bioView.getText().toString();
        // TODO: send user info back to Firebase DB

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
