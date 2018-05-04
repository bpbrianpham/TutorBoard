package com.example.ben.tutorboard;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment implements View.OnClickListener{


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        Button bInfo = v.findViewById(R.id.buttonInfo);
        bInfo.setOnClickListener(this);

        Button bMessage = v.findViewById(R.id.buttonMessage);
        bMessage.setOnClickListener(this);

        Button bNotif = v.findViewById(R.id.buttonNotif);
        bNotif.setOnClickListener(this);

        Button bInv = v.findViewById(R.id.buttonInv);
        bInv.setOnClickListener(this);

        Button bHelp = v.findViewById(R.id.buttonHelp);
        bHelp.setOnClickListener(this);

        Button bLog = v.findViewById(R.id.buttonLog);
        bLog.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonInfo:
                Toast.makeText(getActivity().getApplicationContext(), "Info Not Yet Available", Toast.LENGTH_LONG).show();
                break;

            case R.id.buttonMessage:
                Toast.makeText(getActivity().getApplicationContext(), "Message Not Yet Available", Toast.LENGTH_LONG).show();
                break;

            case R.id.buttonNotif:
                Toast.makeText(getActivity().getApplicationContext(), "Notifications Not Yet Available", Toast.LENGTH_LONG).show();
                break;

            case R.id.buttonInv:
                Toast.makeText(getActivity().getApplicationContext(), "Invite Not Yet Available", Toast.LENGTH_LONG).show();
                break;

            case R.id.buttonHelp:
                Toast.makeText(getActivity().getApplicationContext(), "Help Not Yet Available", Toast.LENGTH_LONG).show();
                break;

            case R.id.buttonLog:
                Toast.makeText(getActivity().getApplicationContext(), "Log Out Not Yet Available", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
