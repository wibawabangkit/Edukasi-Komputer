package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan;

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
import com.wa.dev.edukasikomputer.R;

public class PerangkatMasukan extends AppCompatActivity {
    ImageView kembali, key, mos, touch, pena, mic;
    RelativeLayout layutama;
    FrameLayout layopsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perangkat_masukan);
        layutama = findViewById(R.id.layoutawal);
        layopsi = findViewById(R.id.layfrag);

        mic = findViewById(R.id.fr_mic);
        mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag, new FragmentMickrofon());
                ft.commit();
            }
        });
        pena = findViewById(R.id.fr_pena);
        pena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag, new FragmentPenaElektronik());
                ft.commit();
            }
        });
        touch  = findViewById(R.id.fr_touch);
        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag, new FragmenttTouchpad());
                ft.commit();
            }
        });
        mos = findViewById(R.id.fr_mouse);
        mos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag, new FragmentMouse());
                ft.commit();
            }
        });
        key = findViewById(R.id.fr_keyboard);
        key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag, new FragmentKeyboard());
                ft.commit();
            }
        });
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatMasukan.this, HardwareKomputer.class);
                startActivity(a);
                finish();
            }
        });


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(PerangkatMasukan.this, HardwareKomputer.class);
        startActivity(a);
        finish();
    }
}