package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatKeluaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.HardwareKomputer;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan.FragmentKeyboard;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan.FragmentMickrofon;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan.FragmentMouse;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan.FragmentPenaElektronik;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan.FragmenttTouchpad;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan.PerangkatMasukan;
import com.wa.dev.edukasikomputer.R;

public class PerangkatKeluaran extends AppCompatActivity {
    ImageView kembali, mos, touch, pena, mic;
    RelativeLayout layutama;
    FrameLayout layopsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perangkat_keluaran);
        layutama = findViewById(R.id.lay_utama);
        layopsi = findViewById(R.id.layfragke);
        mic = findViewById(R.id.speaker);
        mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfragke, new FragmentSpeaker());
                ft.commit();
            }
        });
        pena = findViewById(R.id.monitor);
        pena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfragke, new FragmentMonitor1());
                ft.commit();
            }
        });
        touch  = findViewById(R.id.printer);
        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfragke, new FragmentPrinter1());
                ft.commit();
            }
        });
        mos = findViewById(R.id.proyektor);
        mos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfragke, new FragmentProjector());
                ft.commit();
            }
        });
        kembali = findViewById(R.id.back);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatKeluaran.this, HardwareKomputer.class);
                startActivity(a);
                finish();
            }
        });


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(PerangkatKeluaran.this, HardwareKomputer.class);
        startActivity(a);
        finish();
    }
}