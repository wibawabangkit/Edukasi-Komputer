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
    ImageView kembali, key, mos, touch, pena, mic, joy;
    RelativeLayout layutama;
    FrameLayout layopsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perangkat_masukan);
        layutama = findViewById(R.id.layoutawal);
        mic = findViewById(R.id.fr_mic);
        mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatMasukan.this, MicAct.class);
                startActivity(a);
            }
        });
        pena = findViewById(R.id.fr_pena);
        pena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatMasukan.this, PenaAct.class);
                startActivity(a);

            }
        });
        touch  = findViewById(R.id.fr_touch);
        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatMasukan.this, TouchPadAct.class);
                startActivity(a);
            }
        });
        mos = findViewById(R.id.fr_mouse);
        mos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatMasukan.this, MouseAct.class);
                startActivity(a);
            }
        });
        key = findViewById(R.id.fr_keyboard);
        key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatMasukan.this, KeyboardAct.class);
                startActivity(a);
            }
        });
        joy = findViewById(R.id.btn_joy);
        joy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatMasukan.this, JoystickAct.class);
                startActivity(a);
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
}