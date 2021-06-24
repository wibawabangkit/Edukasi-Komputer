package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatKeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.wa.dev.edukasikomputer.R;

public class YTProjektor extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_y_t_projektor);
        WebView web=(WebView)findViewById(R.id.keyprojektor);
        web.getSettings().setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
        web.loadUrl("https://www.youtube.com/embed/cyOHVmYKYfU");

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(YTProjektor.this, ProjectorAct.class);
        startActivity(a);
        finish();
    }
}