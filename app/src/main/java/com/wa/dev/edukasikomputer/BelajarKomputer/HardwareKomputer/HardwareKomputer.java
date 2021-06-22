package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan.PerangkatMasukan;
import com.wa.dev.edukasikomputer.MenuKe2;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatKeluaran.PerangkatKeluaran;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatProses.PerangkatProses;
import com.wa.dev.edukasikomputer.R;

public class HardwareKomputer extends AppCompatActivity {
    ImageView masuk, proses, keluar, kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware_komputer);
    masuk = findViewById(R.id.perangkat_masukan);
    masuk.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent a = new Intent(HardwareKomputer.this, PerangkatMasukan.class);
            startActivity(a);
        }
    });
    proses = findViewById(R.id.perangkat_proses);
    proses.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent a = new Intent(HardwareKomputer.this, PerangkatProses.class);
            startActivity(a);
        }
    });
    keluar = findViewById(R.id.perangkat_keluaran);
    keluar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent a = new Intent(HardwareKomputer.this, PerangkatKeluaran.class);
            startActivity(a);
        }
    });
        kembali = findViewById(R.id.balik);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(HardwareKomputer.this, MenuKe2.class);
                startActivity(a);
                finish();
            }
        });
    }
}