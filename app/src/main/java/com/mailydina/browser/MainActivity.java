package com.mailydina.browser;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button go;
    EditText ed;
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed=(EditText)findViewById(R.id.domain);
        go=(Button) findViewById(R.id.go);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView web = (WebView) findViewById(R.id.webview);
                String url = ed.getText().toString();
                web.loadUrl("https://"+url);
                web.setWebViewClient(new WebViewClient());
                web.getSettings().setJavaScriptEnabled(true);
            }
        });
    }
}