package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.wa.dev.edukasikomputer.R;

public class Yutubquerty extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yutubquerty);
        WebView web=(WebView)findViewById(R.id.key);
        web.getSettings().setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
        web.loadUrl("https://www.youtube.com/embed/39WiYZmH3lM");

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}