package com.app.quantum;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;


 
public class Status extends Activity {
    private WebView webView;
    WebView ourBrow;
    

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
	    if ((keyCode == KeyEvent.KEYCODE_BACK))
	    {
	    	Intent openLogon = new Intent("com.app.quantum.LOGON");
			startActivity(openLogon);
			finish();
	    }
	    return super.onKeyDown(keyCode, event);
	}
 
    @SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
 
        setContentView(R.layout.status);
    
        
    	
	
        
      

        WebView webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setGeolocationEnabled(true);
		webView.getSettings().setJavaScriptEnabled(true);
		WebView myWebView = (WebView) findViewById(R.id.webView1);
		myWebView.setWebViewClient(new WebViewClient());
        
		ourBrow = (WebView) findViewById(R.id.webView1);
		ourBrow.loadUrl("http://m.facebook.com/dialog/feed?app_id=413246535432352&name=UPMOBILEPORTAL&caption=Android%20Application&%20description=Via%UP%20MOBILE%20PORTAL%20for%20Android&redirect_uri=http://www.facebook.com/");
        webView.setWebViewClient(new WebViewClient() {
        	
        	
        	
 
            /*
             * (non-Javadoc)
             *
             * @see
             * android.webkit.WebViewClient#onReceivedError(android.webkit.WebView
             * , int, java.lang.String, java.lang.String)
             */
            @Override
            public void onReceivedError(WebView view, int errorCode,
                    String description, String failingUrl) {
                // TODO Auto-generated method stub
                super.onReceivedError(view, errorCode, description, failingUrl);
                loadError();
            }
        });
 
        webView.loadUrl("http://m.facebook.com/dialog/feed?app_id=413246535432352&name=UPMOBILEPORTAL&caption=Android%20Application&%20description=Via%UP%20MOBILE%20PORTAL%20for%20Android&redirect_uri=http://www.facebook.com/");
    }
 

    @SuppressLint("NewApi")
  	private void loadError() {
    	 Intent intent = new Intent("com.app.quantum.STATUS2");
    	    intent.setComponent(ComponentName.unflattenFromString("com.app.quantum"));
    	    intent.addCategory("android.intent.category.DEFAULT");
    	    startActivity(intent);
    	    finish();
   
    

    }

	public boolean isNetworkAvailable() {
		ConnectivityManager cm = (ConnectivityManager)
		getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = cm.getActiveNetworkInfo();
		// if no network is available networkInfo will be null
		// otherwise check if we are connected
		if (networkInfo != null && networkInfo.isConnected()) {
		    return true;
		}

		return false;


		}

        
   
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
