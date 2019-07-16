package sg.edu.rp.c346.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

public class Frag2 extends Fragment {

    Button btnChangeColor;

    public Frag2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_frag2, container,false);
        btnChangeColor = view.findViewById(R.id.btnColor);
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(4);
                int color;
                if (n == 0) {
                    color = Color.RED;
                } else if (n == 1) {
                    color = Color.BLUE;
                } else if (n == 2) {
                    color = Color.GREEN;
                } else {
                    color = Color.MAGENTA;
                }
                view.setBackgroundColor(color);
            }
        });
        return view;
    }

}
