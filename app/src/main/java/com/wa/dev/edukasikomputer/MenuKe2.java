package com.wa.dev.edukasikomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuKe2 extends AppCompatActivity {
ImageView definisikomputer, hardware, kembali, sistemkomputer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ke2);
        sistemkomputer = findViewById(R.id.sistem_komputer);
        sistemkomputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MenuKe2.this, SistemKomputer.class);
                startActivity(a);
                finish();
            }
        });
    definisikomputer = findViewById(R.id.definisi_komputer);
    definisikomputer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent a = new Intent(MenuKe2.this, DefinisiKomputer.class);
            startActivity(a);
            finish();
        }
    });
    hardware = findViewById(R.id.hardware_komputer);
    hardware.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent a = new Intent(MenuKe2.this, HardwareKomputer.class);
            startActivity(a);
            finish();
        }
    });
    kembali = findViewById(R.id.backMenu);
    kembali.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent a = new Intent(MenuKe2.this, MainActivity.class);
            startActivity(a);
            finish();
        }
    });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(MenuKe2.this, MainActivity.class);
        startActivity(a);
        finish();
    }
}