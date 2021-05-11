package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatKeluaran;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.wa.dev.edukasikomputer.R;


public class FragmentMonitor1 extends Fragment {
    ImageView btn, yt;
    Context context;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_monitor1, container, false);
        context = getContext();
//        btn = view.findViewById(R.id.bt_back_mic);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent a = new Intent(context, HardwareKomputer.class);
//                startActivity(a);
//                getActivity().finish();
//            }
//        });
//        yt = view.findViewById(R.id.vid_mic);
//        yt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent a = new Intent(context, YT_mic.class);
//                startActivity(a);
//            }
//        });


        return view;
    }
}