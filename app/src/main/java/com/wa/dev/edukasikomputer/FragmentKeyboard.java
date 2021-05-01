package com.wa.dev.edukasikomputer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentKeyboard extends Fragment {
    ImageView btn, yt;
    Context context;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_keyboard, container, false);
        context = getContext();
        btn = view.findViewById(R.id.btn_balik);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(context, HardwareKomputer.class);
                startActivity(a);
            }
        });
         yt = view.findViewById(R.id.pindahyutub);
         yt.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent a = new Intent(context, Yutubquerty.class);
                 startActivity(a);
             }
         });


        return view;
    }
}