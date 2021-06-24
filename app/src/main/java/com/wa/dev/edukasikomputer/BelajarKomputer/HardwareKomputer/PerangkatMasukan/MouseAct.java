package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.HardwareKomputer;
import com.wa.dev.edukasikomputer.R;

public class MouseAct extends AppCompatActivity {
    ImageView btn, yt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mouse);
        btn = findViewById(R.id.btn_balik_mouse);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MouseAct.this, PerangkatMasukan.class);
                startActivity(a);
                finish();
            }
        });
        yt = findViewById(R.id.pindahyutub_mouse);
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MouseAct.this, YoutubeMouse.class);
                startActivity(a);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(MouseAct.this,PerangkatMasukan.class);
        startActivity(a);
        finish();
    }
}