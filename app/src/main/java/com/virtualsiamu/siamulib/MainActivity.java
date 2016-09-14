package com.virtualsiamu.siamulib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private ImageView[] imageViews;
    private String urlWebViewString;
    private LinearLayout linearLayout;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        linearLayout = (LinearLayout) findViewById(R.id.linIcon);
        webView = (WebView) findViewById(R.id.webView);
        imageViews = new ImageView[4];
        imageViews[0] = (ImageView) findViewById(R.id.imageButton17);
        imageViews[1] = (ImageView) findViewById(R.id.imageButton33);
        imageViews[2] = (ImageView) findViewById(R.id.imageButton34);
        imageViews[3] = (ImageView) findViewById(R.id.imageButton35);

        //Get Event from Click
        for (int i = 0; i < imageViews.length; i += 1) {
            imageViews[i].setOnClickListener(this);
        }   // for


    }   // Main Method

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        linearLayout.setVisibility(View.VISIBLE);
        webView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.imageButton17:
                urlWebViewString = "http://androidthai.in.th/home.html";
                break;
            case R.id.imageButton33:
                urlWebViewString = "http://androidthai.in.th/conternt-android.html";
                break;
            case R.id.imageButton34:
                urlWebViewString = "http://androidthai.in.th/java-intro.html";
                break;
            case R.id.imageButton35:
                urlWebViewString = "http://androidthai.in.th/developer.html";
                break;
            default:
                urlWebViewString = "http://androidthai.in.th/home.html";
                break;
        }   // switch

        linearLayout.setVisibility(View.INVISIBLE);
        webView.setVisibility(View.VISIBLE);

        Log.d("14SepV1", "urlPHP ==> " + urlWebViewString);

        WebViewClient webViewClient = new WebViewClient();
        webView.setWebViewClient(webViewClient);
        webView.loadUrl(urlWebViewString);
        webView.getSettings().setJavaScriptEnabled(true);


    }   // onClick

}   // Main Class





