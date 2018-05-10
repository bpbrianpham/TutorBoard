package com.example.ben.tutorboard;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;

    private HomeFragment homeFragment;
    private MessageFragment messageFragment;
    private ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Creates the navigation bar at the bottom of the screen
        mMainNav = findViewById(R.id.main_nav);

        //Creates the three navigation fragments at the bottom
        homeFragment = new HomeFragment();
        messageFragment = new MessageFragment();
        profileFragment = new ProfileFragment();

        //It sets the HomeFragment the first screen the user sees
        setFragment(homeFragment);

        //When the user clicks on 1 of the 3 fragments, it will take them to that fragment
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.navigation_home :
                        setFragment(homeFragment);
                        return true;

                    case R.id.navigation_messages :
                        setFragment(messageFragment);

                        return true;

                    case R.id.navigation_profile :
                        setFragment(profileFragment);
                        return true;

                        default :
                            return false;
                }
            }
        });

    }

    //This will set the fragment to replace the current one
    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();

    }

}
