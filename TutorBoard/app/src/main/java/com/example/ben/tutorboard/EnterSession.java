package com.example.ben.tutorboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EnterSession extends AppCompatActivity {

   private Button cancelButton;
   private Button joinButton;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_enter_session);

      //Sends the user to the login screen from the "Create" button
      cancelButton = (Button) findViewById(R.id.cancelJoinButton);
      cancelButton.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View v) {
            backToHome();
         }
      });

      //Click Join button -> EnterSession screen
      joinButton = (Button)findViewById(R.id.joinButton);
      joinButton.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View v) {
            Toast.makeText(EnterSession.this, "'Join session' coming soon!", Toast.LENGTH_SHORT).show();
            enterSession();
         }
      });
   }

   public void backToHome(){
      finish();
   }

   public void enterSession(){

   }


}
