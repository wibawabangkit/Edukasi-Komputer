package com.wa.dev.edukasikomputer.BelajarKomputer.SistemKomputer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wa.dev.edukasikomputer.MenuKe2;
import com.wa.dev.edukasikomputer.R;


public class SistemKomputerNext1 extends Fragment {
    TextView uih;
    Context mcontext;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sistem_komputer_next1, container, false);
        mcontext = getContext();
        uih = view.findViewById(R.id.tv_back);
        uih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(mcontext, MenuKe2.class);
                startActivity(a);
                getActivity().finish();
            }
        });
        return view;
    }
}