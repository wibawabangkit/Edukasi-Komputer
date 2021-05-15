package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatProses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.HardwareKomputer;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatKeluaran.FragmentProjector;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan.FragmentMickrofon;
import com.wa.dev.edukasikomputer.R;

public class PerangkatProses extends AppCompatActivity {
    ImageView kembali, rom, ram, vga, storage, psu, motherboard,prosesor;
    FrameLayout layopsi;
    RelativeLayout layutama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perangkat_proses);
        layopsi = findViewById(R.id.layfrag_proses);
        layutama = findViewById(R.id.laysatuu);
        prosesor = findViewById(R.id.prosesor);
        prosesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag_proses, new FragmentProsesor());
                ft.commit();
            }
        });
        motherboard = findViewById(R.id.motherboard);
        motherboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag_proses, new FragmentMotherboard());
                ft.commit();
            }
        });
        psu = findViewById(R.id.psu);
        psu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag_proses, new FragmentPSU());
                ft.commit();
            }
        });
        storage = findViewById(R.id.storage);
        storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag_proses, new FragmentStorage());
                ft.commit();
            }
        });
        vga = findViewById(R.id.vga);
        vga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag_proses, new FragmentVGA());
                ft.commit();
            }
        });
        ram = findViewById(R.id.ram);
        ram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag_proses, new FragmentRAM());
                ft.commit();
            }
        });
        rom = findViewById(R.id.rom);
        rom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layfrag_proses, new FragmentCDROM());
                ft.commit();
            }
        });

        kembali = findViewById(R.id.kembalii);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatProses.this, HardwareKomputer.class);
                startActivity(a);
                finish();
            }
        });
    }
}