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
public class MessageFragment extends Fragment implements View.OnClickListener{


    public MessageFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_message, parent, false);

        //The system will be listening to any taps the user performs on selected locations
        Button bT = v.findViewById(R.id.personTaylor);
        bT.setOnClickListener(this);

        Button bM = v.findViewById(R.id.personMark);
        bM.setOnClickListener(this);

        return v;
    }

    //Tapping on a person's button will take the user to the person's messages
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.personTaylor:
                Intent intent = new Intent(getActivity(), MessageActivity.class);
                startActivity(intent);
                break;

            case R.id.personMark:
                Intent intent2 = new Intent(getActivity(), MessageActivity.class);
                startActivity(intent2);
                break;

        }
    }

}
