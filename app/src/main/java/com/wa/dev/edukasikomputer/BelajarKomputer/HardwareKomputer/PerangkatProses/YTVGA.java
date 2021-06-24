package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatProses;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.wa.dev.edukasikomputer.R;

public class YTVGA extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_y_t_v_g);
        WebView web=(WebView)findViewById(R.id.key_vga);
        web.getSettings().setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
        web.loadUrl("https://www.youtube.com/embed/BI9d1s76R6c");

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(YTVGA.this, VGA_Act.class);
        startActivity(a);
        finish();
    }
}