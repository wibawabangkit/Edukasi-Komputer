package com.wa.dev.edukasikomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DefinisiKomputer extends AppCompatActivity {
    ImageView sejarah, menurut, pengertian, kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definisi_komputer);
        kembali = findViewById(R.id.bakk);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DefinisiKomputer.this, MenuKe2.class);
                startActivity(a);
                finish();
            }
        });
    }
}