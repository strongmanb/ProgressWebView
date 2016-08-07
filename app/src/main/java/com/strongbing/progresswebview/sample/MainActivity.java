package com.strongbing.progresswebview.sample;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.strongbing.progresswebview.ProgressWebView ;

public class MainActivity extends AppCompatActivity {

    private ProgressWebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (ProgressWebView) findViewById(R.id.webview);
        WebView wv = mWebView.getWebView();
        //wv.loadUrl("http://www.baidu.com/");

    }
}
