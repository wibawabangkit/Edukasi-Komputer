package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.HardwareKomputer;
import com.wa.dev.edukasikomputer.R;


public class FragmenttTouchpad extends Fragment {
    ImageView btn;
    TextView yt;
    Context context;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragmentt_touchpad, container, false);
        context = getContext();
        btn = view.findViewById(R.id.bt_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(context, HardwareKomputer.class);
                startActivity(a);
                getActivity().finish();
            }
        });
        yt = view.findViewById(R.id.tap);
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(context, TouchYoutube.class);
                startActivity(a);
            }
        });


        return view;
    }
}