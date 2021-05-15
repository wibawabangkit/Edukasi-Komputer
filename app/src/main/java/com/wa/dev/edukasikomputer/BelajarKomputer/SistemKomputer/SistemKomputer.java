package com.wa.dev.edukasikomputer.BelajarKomputer.SistemKomputer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.HardwareKomputer;
import com.wa.dev.edukasikomputer.MenuKe2;
import com.wa.dev.edukasikomputer.R;

public class SistemKomputer extends AppCompatActivity {
    ImageView uih;
    TextView next;
    ScrollView layutama;
    FrameLayout layopsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistem_komputer);
        layopsi = findViewById(R.id.lay_frag_next1);
        layutama = findViewById(R.id.lay_satu);
        next = findViewById(R.id.tv_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layutama.setVisibility(View.GONE);
                layopsi.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.lay_frag_next1, new SistemKomputerNext1());
                ft.commit();
            }
        });
        uih = findViewById(R.id.btn_uih);
        uih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(SistemKomputer.this, MenuKe2.class);
                startActivity(a);
                finish();
            }
        });



    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(SistemKomputer.this, MenuKe2.class);
        startActivity(a);
        finish();
    }
}