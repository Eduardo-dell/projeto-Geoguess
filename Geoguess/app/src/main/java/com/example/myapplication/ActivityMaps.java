package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import com.example.myapplication.R;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import android.widget.Toast;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ActivityMaps extends Activity{
Button btn;
WebView myWebView;
WebSettings webSettings;
String path = "lugares.csv";
View btnI;


	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
requestWindowFeature(Window.FEATURE_NO_TITLE);
   setContentView(R.layout.activity_maps);
	
	myWebView = findViewById(R.id.webview1);
	myWebView.setWebViewClient(new WebViewClient());
webSettings = myWebView.getSettings();
webSettings.setJavaScriptEnabled(true);
myWebView.setBackgroundColor(0);

    
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
WindowManager.LayoutParams.FLAG_FULLSCREEN);
	myWebView.loadUrl("https://sigmageo.herokuapp.com/");
    
    }
    public void setVisibility(View view){
     btnI = findViewById(R.id.botaoLiberar);
     Toast.makeText(ActivityMaps.this,"Parabéns, agora volte a tela anterior e inicie novamente para um novo mapa!", Toast.LENGTH_LONG).show();
     
     btnI.setVisibility(View.GONE);
    }
}
