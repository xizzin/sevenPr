package com.example.sevenprjava;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    WebView wevView;
    ProgressBar progressBar;
    String url="google.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wevView = findViewById(R.id.webView);
        progressBar = findViewById(R.id.progress_bar);

        wevView.setWebViewClient(new WebViewClient());
        wevView.loadUrl(url);
        wevView.getSettings().setJavaScriptEnabled(true);

    }
}