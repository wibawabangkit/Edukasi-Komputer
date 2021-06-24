package com.wa.dev.edukasikomputer.BelajarKomputer.DefinisiKomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.wa.dev.edukasikomputer.MenuKe2;
import com.wa.dev.edukasikomputer.R;

public class DefinisiKomputer extends AppCompatActivity {
    ImageView sejarah, menurut, pengertian, kembali;
    FrameLayout layoutFrag;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definisi_komputer);
        relativeLayout=findViewById(R.id.lay_satu);
        sejarah = findViewById(R.id.sejarah);
        sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DefinisiKomputer.this, SejarahPenemuanKomputer.class);
                startActivity(a);
                finish();
            }
        });
        layoutFrag = findViewById(R.id.layout_fragment);
        menurut = findViewById(R.id.menurut_ahli);
        menurut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DefinisiKomputer.this, DefinisiKomputerMenurutAhli.class);
                startActivity(a);
                finish();
            }
        });
        pengertian = findViewById(R.id.pengertian_komputer);
        pengertian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DefinisiKomputer.this, PengertianKomputer.class);
                startActivity(a);
                finish();
            }
        });
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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(DefinisiKomputer.this, MenuKe2.class);
        startActivity(a);
        finish();
    }
}