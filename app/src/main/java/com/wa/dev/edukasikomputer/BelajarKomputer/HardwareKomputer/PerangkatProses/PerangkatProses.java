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

import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.HardwareKomputer;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatKeluaran.ProjectorAct;
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
                Intent a = new Intent(PerangkatProses.this, ProcessorAct.class);
                startActivity(a);
                finish();
            }
        });
        motherboard = findViewById(R.id.motherboard);
        motherboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatProses.this, MotherboardAct.class);
                startActivity(a);
                finish();
            }
        });
        psu = findViewById(R.id.psu);
        psu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatProses.this, PSU_Act.class);
                startActivity(a);
                finish();
            }
        });
        storage = findViewById(R.id.storage);
        storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatProses.this, Storage_Act.class);
                startActivity(a);
                finish();
            }
        });
        vga = findViewById(R.id.vga);
        vga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatProses.this, VGA_Act.class);
                startActivity(a);
                finish();
            }
        });
        ram = findViewById(R.id.ram);
        ram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatProses.this, RAM_Act.class);
                startActivity(a);
                finish();
            }
        });
        rom = findViewById(R.id.rom);
        rom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PerangkatProses.this, CDROMAct.class);
                startActivity(a);
                finish();
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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(PerangkatProses.this, HardwareKomputer.class);
        startActivity(a);
        finish();
    }
}