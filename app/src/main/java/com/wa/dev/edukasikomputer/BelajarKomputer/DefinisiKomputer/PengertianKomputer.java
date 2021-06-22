package com.wa.dev.edukasikomputer.BelajarKomputer.DefinisiKomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wa.dev.edukasikomputer.R;

public class PengertianKomputer extends AppCompatActivity {
    ImageView uih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengertian_komputer);
        uih = findViewById(R.id.btn_kembali);
        uih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PengertianKomputer.this, DefinisiKomputer.class);
                startActivity(a);
                finish();
            }
        });


    }
}