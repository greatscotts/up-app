package com.app.quantum;

import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

 
public class Map extends Activity {
    private WebView webView;
    WebView ourBrow;
  

 
    @SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
 
        setContentView(R.layout.map);
 
        
        WebView image = (WebView)findViewById(R.id.webView1);
        image.getSettings().setBuiltInZoomControls(true);
        
        image.getSettings().setUseWideViewPort(true);
        image.setLayoutParams(new     LinearLayout.LayoutParams(LayoutParams.FILL_PARENT,LinearLayout.LayoutParams.FILL_PARENT));
        image.loadUrl("file:///android_asset/index.html");
       
         
         
         
         
     }
 	public void onClick(View v) {
 		// TODO Auto-generated method stub
 		
 	}
 }

       
