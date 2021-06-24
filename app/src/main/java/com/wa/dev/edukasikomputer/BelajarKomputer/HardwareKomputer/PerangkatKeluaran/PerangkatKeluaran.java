package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatKeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.HardwareKomputer;
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
                Intent a = new Intent(PerangkatKeluaran.this, SpeakerAct.class);
                startActivity(a);
                finish();
            }
        });
        pena = findViewById(R.id.monitor);
        pena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatKeluaran.this, MonitorAct.class);
                startActivity(a);
                finish();
            }
        });
        touch  = findViewById(R.id.printer);
        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatKeluaran.this, PrinterAct.class);
                startActivity(a);
                finish();
            }
        });
        mos = findViewById(R.id.proyektor);
        mos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatKeluaran.this, ProjectorAct.class);
                startActivity(a);
                finish();
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