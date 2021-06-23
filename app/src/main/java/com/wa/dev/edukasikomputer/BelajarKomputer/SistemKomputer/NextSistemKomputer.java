package com.wa.dev.edukasikomputer.BelajarKomputer.SistemKomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wa.dev.edukasikomputer.MenuKe2;
import com.wa.dev.edukasikomputer.R;

public class NextSistemKomputer extends AppCompatActivity {
TextView uih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_sistem_komputer);
        uih = findViewById(R.id.tv_back);
        uih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(NextSistemKomputer.this, SistemKomputer.class);
                startActivity(a);
                finish();
            }
        });
    }
}