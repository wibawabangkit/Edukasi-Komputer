package com.wa.dev.edukasikomputer.BelajarKomputer.DefinisiKomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wa.dev.edukasikomputer.MenuKe2;
import com.wa.dev.edukasikomputer.R;

public class DefinisiKomputerMenurutAhli extends AppCompatActivity {
ImageView kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definisi_komputer_menurut_ahli);
        kembali = findViewById(R.id.btn_back_menu);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DefinisiKomputerMenurutAhli.this, DefinisiKomputer.class);
                startActivity(a);
                finish();
            }
        });
    }
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        Intent a = new Intent(DefinisiKomputerMenurutAhli.this, MenuKe2.class);
//        startActivity(a);
//        finish();
//    }
}