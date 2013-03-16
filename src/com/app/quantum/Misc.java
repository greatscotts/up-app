package com.app.quantum;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.support.v4.app.NavUtils;


public class Misc extends Activity implements OnClickListener {

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
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
	
        setContentView(R.layout.misc);
       
        
        
        TabHost th = (TabHost) findViewById (R.id.tabhost);
        th.setup();
        TabSpec specs= th.newTabSpec("tag1");
        specs.setContent(R.id.tab1);
        specs.setIndicator("PROFILE");
        th.addTab(specs);
        
        specs= th.newTabSpec("tag2");
        specs.setContent(R.id.tab3);
        specs.setIndicator("Gallery");
        th.addTab(specs);
        
        specs= th.newTabSpec("tag3");
        specs.setContent(R.id.tab2);
        specs.setIndicator("Calendar");
        th.addTab(specs);
        
        
       
        
        
        Button n = (Button) findViewById(R.id.button1);
	     n.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Misc.this,News.class);
	        startActivity(i);
	        finish();
	        } 
	     });
      

	    Button q = (Button) findViewById(R.id.button2);
	     q.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Misc.this,Info.class);
	        startActivity(i);
	        finish();
	        } 
	     });
       
     
	     Button a = (Button) findViewById(R.id.button5);
	     a.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Misc.this,Logon.class);
	        startActivity(i);
	        finish();
	        } 
	     });
     
	     Button c = (Button) findViewById(R.id.button4);
	     c.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Misc.this,Social.class);
	        startActivity(i);
	        finish();
	        } 
	     });

	    
		
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
