package com.app.quantum;




import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Logon extends Activity {
	
	
	private WebView webView;
    WebView ourBrow;
  

 
    @SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
 
        setContentView(R.layout.home);
        


		Button b = (Button) findViewById(R.id.button3);
		b.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(Logon.this, Misc.class);
				startActivity(i);
				finish();
			}
		});

		Button q = (Button) findViewById(R.id.button2);
		q.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(Logon.this, Info.class);
				startActivity(i);
				finish();
			}
		});
		Button z = (Button) findViewById(R.id.button1);
		z.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(Logon.this, News.class);
				startActivity(i);
				finish();
			}
		});
		
		 Button n = (Button) findViewById(R.id.button6);
	     n.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Logon.this,Status.class);
	        startActivity(i);
	        finish();
	        } 
	     });

		Button g = (Button) findViewById(R.id.button4);
		g.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(Logon.this, Social.class);
				startActivity(i);
				finish();
			}
		});
	
 
        webView = (WebView) findViewById(R.id.webView1);
       

        WebView webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setGeolocationEnabled(true);
		webView.getSettings().setJavaScriptEnabled(true);
		WebView myWebView = (WebView) findViewById(R.id.webView1);
		myWebView.setWebViewClient(new WebViewClient());
        
		ourBrow = (WebView) findViewById(R.id.webView1);
		ourBrow.loadUrl("file:///android_asset/last.html");
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
 
        webView.loadUrl("file:///android_asset/last.html");
    }
 
    @SuppressLint("NewApi")
	private void loadError() {
    	WebView wv = (WebView)findViewById(R.id.webView1);
    	wv.loadUrl("file:///android_asset/last.html");
       
    

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

	@Override
	public void onBackPressed() {
		new AlertDialog.Builder(this)
				.setIcon(android.R.drawable.ic_dialog_alert)
				.setTitle("Closing Application")
				.setMessage("Are you sure you want exit UP MOBILE PORTAL?")
				.setPositiveButton("Yes",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								finish();
							}

						}).setNegativeButton("No", null).show();
	}

}
