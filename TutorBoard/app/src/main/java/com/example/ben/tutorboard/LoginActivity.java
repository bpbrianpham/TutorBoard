package com.example.ben.tutorboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    private ImageView buttonLog;
    private EditText email;
    private EditText password;
//    private Button buttonCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Tapping login goes into HomeActivity
        buttonLog = findViewById(R.id.next_button);
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        //Tapping Create goes into DecisionActivity
//        buttonCreate = (Button) findViewById(R.id.create);
//        buttonCreate.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                openDecisionActivity();
//            }
//        });
    }

    public void openHomeActivity() {
        String em = email.getText().toString();
        String pass = password.getText().toString();
        //TODO: Insert what to do with the user info Strings

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void openDecisionActivity() {
        Intent intent = new Intent (this, DecisionActivity.class);
        startActivity(intent);
    }
}
