package com.example.ben.tutorboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PreLogin extends AppCompatActivity {

   private Button buttonCreate;
   private TextView buttonLogin;
   // TODO: Connect Google login button with Firebase User Auth (Agustin to Adrian)


   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_pre_login);

      //Tapping Log In goes into LoginActivity
      buttonLogin = findViewById(R.id.login_textview);
      buttonLogin.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View v) {
            openLoginActivity();
         }

      });

      //Tapping Create goes into DecisionActivity
      buttonCreate = (Button) findViewById(R.id.create_account_button);
      buttonCreate.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View v) {
            openDecisionActivity();
         }
      });
   }

   public void openLoginActivity() {
      Intent intent = new Intent (this, LoginActivity.class);
      startActivity(intent);
   }

   public void openDecisionActivity() {
      Intent intent = new Intent (this, DecisionActivity.class);
      startActivity(intent);
   }
}
