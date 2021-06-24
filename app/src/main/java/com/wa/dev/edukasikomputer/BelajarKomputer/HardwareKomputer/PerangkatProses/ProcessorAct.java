package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatProses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.HardwareKomputer;
import com.wa.dev.edukasikomputer.R;

public class ProcessorAct extends AppCompatActivity {
    ImageView btn, yt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processor);
        btn = findViewById(R.id.bt_back_prosesor);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(ProcessorAct.this, PerangkatProses.class);
                startActivity(a);
                finish();
            }
        });
        yt = findViewById(R.id.vid_prosesor);
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(ProcessorAct.this, YTProsesor.class);
                startActivity(a);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(ProcessorAct.this, PerangkatProses.class);
        startActivity(a);
        finish();
    }
}