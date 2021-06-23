package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wa.dev.edukasikomputer.R;

public class JoystickAct extends AppCompatActivity {
ImageView btn, yt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joystick);

        btn = findViewById(R.id.btn_balik);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(JoystickAct.this, PerangkatMasukan.class);
                startActivity(a);
                finish();
            }
        });
        yt = findViewById(R.id.pindahyutub);
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(JoystickAct.this, YtJoystick.class);
                startActivity(a);
            }
        });
    }
}