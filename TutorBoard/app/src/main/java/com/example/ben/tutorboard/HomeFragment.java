package com.example.ben.tutorboard;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //The system will be listening to any taps the user performs on selected locations
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        Button bT = v.findViewById(R.id.buttonTaylor);
        bT.setOnClickListener(this);

        Button bM = v.findViewById(R.id.buttonMark);
        bM.setOnClickListener(this);

        return v;
    }

    //Tapping on a person's button will take the user to the person's profile
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonTaylor:
                Intent intent = new Intent(getActivity(), TaylorActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonMark:
                Intent intent2 = new Intent(getActivity(), MarkActivity.class);
                startActivity(intent2);
                break;

        }
    }

}
