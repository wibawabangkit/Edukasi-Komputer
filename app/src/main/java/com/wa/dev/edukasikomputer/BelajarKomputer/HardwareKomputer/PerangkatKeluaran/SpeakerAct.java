package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatKeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.HardwareKomputer;
import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan.YT_mic;
import com.wa.dev.edukasikomputer.R;

public class SpeakerAct extends AppCompatActivity {
    ImageView btn, yt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaker);
        btn = findViewById(R.id.btnn_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(SpeakerAct.this, PerangkatKeluaran.class);
                startActivity(a);
                finish();
            }
        });
        yt = findViewById(R.id.vid_speaker);
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(SpeakerAct.this, YTSpeaker.class);
                startActivity(a);
            }
        });

    }
}