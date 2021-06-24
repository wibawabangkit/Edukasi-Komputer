package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatKeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.HardwareKomputer;
import com.wa.dev.edukasikomputer.R;

public class PrinterAct extends AppCompatActivity {
ImageView btn, yt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printer2);
        btn = findViewById(R.id.btnn_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PrinterAct.this, PerangkatKeluaran.class);
                startActivity(a);
                finish();
            }
        });
        yt = findViewById(R.id.vid_print);
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PrinterAct.this, YTPrinter.class);
                startActivity(a);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(PrinterAct.this, PerangkatKeluaran.class);
        startActivity(a);
        finish();
    }
}