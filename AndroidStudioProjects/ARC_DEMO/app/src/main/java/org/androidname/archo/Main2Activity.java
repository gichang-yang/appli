package org.androidname.archo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        WebView webView;
        webView = (WebView) findViewById(R.id.webView);
        WebSettings Settings = webView.getSettings();
        Settings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        Intent intent = getIntent();
        if(intent!=null) {
            int recieve = intent.getIntExtra("address",7);
            if(recieve == 0) webView.loadUrl("https://drive.google.com/folderview?id=0BwYSOi7twqKIVEUzRlQwMFc3T2s&usp=sharing");
            else if(recieve ==1) webView.loadUrl("https://drive.google.com/folderview?id=0BwYSOi7twqKIZjEtUU41LXd4RGs&usp=sharing");
            else if(recieve ==2) webView.loadUrl("https://drive.google.com/folderview?id=0BwYSOi7twqKISW9kNEtheWZOcVE&usp=sharing");
            else if(recieve ==3) webView.loadUrl("http://saint.ssu.ac.kr");
            else if(recieve ==4) webView.loadUrl("http://www.ssu.ac.kr");
            else if(recieve ==5) webView.loadUrl("http://sw.ssu.ac.kr/");
            else Toast.makeText(getBaseContext(),"error",Toast.LENGTH_LONG).show();
        }
    }


}


