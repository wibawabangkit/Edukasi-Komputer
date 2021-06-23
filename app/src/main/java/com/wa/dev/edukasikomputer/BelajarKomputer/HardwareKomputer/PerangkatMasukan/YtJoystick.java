package com.wa.dev.edukasikomputer.BelajarKomputer.HardwareKomputer.PerangkatMasukan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.wa.dev.edukasikomputer.R;

public class YtJoystick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yt_joystick);
        WebView web=(WebView)findViewById(R.id.keyjoy);
        web.getSettings().setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
        web.loadUrl("https://www.youtube.com/embed/3kSeXnlGxro");

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