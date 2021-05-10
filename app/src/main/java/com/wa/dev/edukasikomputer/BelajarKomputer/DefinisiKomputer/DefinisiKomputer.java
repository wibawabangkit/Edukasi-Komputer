package com.wa.dev.edukasikomputer.BelajarKomputer.DefinisiKomputer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.wa.dev.edukasikomputer.BelajarKomputer.SistemKomputer.SistemKomputerNext1;
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
                relativeLayout.setVisibility(View.GONE);
                layoutFrag.setVisibility(View.VISIBLE);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layout_fragment, new FragmentPengertian());
                ft.commit();
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
}