package com.example.thanveer.safari;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ConnectFragment extends Fragment {
    Button b1;
    public ConnectFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_connect, container, false);
        /*View.OnClickListener l=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(), Profile.class);
                startActivity(i);
            }
        };
        Button b1=(Button) rootView.findViewById(R.id.button3);
        b1.setOnClickListener(l);*/
        return rootView;
    }

}