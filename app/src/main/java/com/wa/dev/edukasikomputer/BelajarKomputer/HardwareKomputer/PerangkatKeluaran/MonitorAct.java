package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatKeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wa.dev.edukasikomputer.BelajarKomputer.DefinisiKomputer.DefinisiKomputer;
import com.wa.dev.edukasikomputer.BelajarKomputer.DefinisiKomputer.SejarahPenemuanKomputer;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.HardwareKomputer;
import com.wa.dev.edukasikomputer.R;

public class MonitorAct extends AppCompatActivity {
    ImageView btn, yt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor2);
        btn = findViewById(R.id.btnn_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MonitorAct.this, PerangkatKeluaran.class);
                startActivity(a);
                finish();
            }
        });
        yt = findViewById(R.id.vid_monitor);
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MonitorAct.this, YTMonitor.class);
                startActivity(a);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(MonitorAct.this, PerangkatKeluaran.class);
        startActivity(a);
        finish();
    }
}