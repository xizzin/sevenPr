package com.example.sevenprjava;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class WebViewClient extends android.webkit.WebViewClient {
    private ProgressBar progressBar;

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon){
        progressBar.setVisibility(View.VISIBLE);
        super.onPageStarted(view, url, favicon);
    }
    
    @Override
    public void onPageFinished(WebView view, String url){
        progressBar.setVisibility(View.GONE);
        super.onPageFinished(view, url);
    }
}
