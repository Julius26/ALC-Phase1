package com.example.phase1challenge;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {


//    declaring webview
    WebView mWebViewALC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        setTitle("About ALC");


        mWebViewALC = findViewById(R.id.web_view_alc);
        mWebViewALC.getSettings().setLoadsImagesAutomatically(true);
        mWebViewALC.getSettings().setJavaScriptEnabled(true);
        mWebViewALC.getSettings().setBuiltInZoomControls(true);
        mWebViewALC.loadUrl("https://andela.com/alc/");

        mWebViewALC.setWebViewClient(
                new shouldOverrideSSL()
        );


    }


    private class shouldOverrideSSL extends WebViewClient {
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
//            super.onReceivedSslError(view, handler, error);
            handler.proceed();
        }

    }

}


