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

public class Social extends Activity {
	private WebView webView;
	WebView ourBrow;

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if ((keyCode == KeyEvent.KEYCODE_BACK)) {
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

		setContentView(R.layout.social);

		Button q = (Button) findViewById(R.id.button2);
		q.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(Social.this, Info.class);
				startActivity(i);
				finish();
			}
		});

		Button z = (Button) findViewById(R.id.button5);
		z.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(Social.this, Logon.class);
				startActivity(i);
				finish();
			}
		});

		Button n = (Button) findViewById(R.id.button1);
		n.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(Social.this, News.class);
				startActivity(i);
				finish();
			}
		});

		Button b = (Button) findViewById(R.id.button3);
		b.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(Social.this, Misc.class);
				startActivity(i);
				finish();
			}
		});

		TabHost th = (TabHost) findViewById(R.id.tabhost);
		th.setup();
		TabSpec specs = th.newTabSpec("tag1");
		specs.setContent(R.id.tab1);
		specs.setIndicator("FACEBOOK");
		th.addTab(specs);

		specs = th.newTabSpec("tag2");
		specs.setContent(R.id.tab2);
		specs.setIndicator("STATUS");
		th.addTab(specs);

		specs = th.newTabSpec("tag3");
		specs.setContent(R.id.tab3);
		specs.setIndicator("TWITTER");
		th.addTab(specs);

		ourBrow = (WebView) findViewById(R.id.wvBrowser);
		ourBrow.loadUrl("http://m.facebook.com/pages/University-of-the-Philippines/141308735861?sid=0.8850994913373142");
		WebSettings webSettings = ourBrow.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webSettings.setUserAgentString("CUSTOM_UA");
		ourBrow.setWebViewClient(new WebViewClient());

		ourBrow.setWebViewClient(new WebViewClient());

		WebView ourBrow3 = (WebView) findViewById(R.id.wvBrowser3);
		ourBrow3.loadUrl("https://mobile.twitter.com/upsystem");
		WebSettings webSettings1 = ourBrow3.getSettings();
		webSettings1.setJavaScriptEnabled(true);
		webSettings1.setUserAgentString("CUSTOM_UA");
		ourBrow3.setWebViewClient(new WebViewClient());

		WebView ourBrow2 = (WebView) findViewById(R.id.wvBrowser2);
		ourBrow2.loadUrl("http://m.facebook.com/dialog/feed?app_id=413246535432352&name=UPMOBILEPORTAL&caption=Android%20Application&%20description=Via%UP%20MOBILE%20PORTAL%20for%20Android&redirect_uri=http://www.facebook.com/");

		ourBrow2.setWebViewClient(new WebViewClient());

	}

	public void onClick(View v) {
		// TODO Auto-generated method stub

	}
}
