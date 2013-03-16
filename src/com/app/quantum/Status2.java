package com.app.quantum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;


public class Status2 extends Activity  {

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
		
		setContentView(R.layout.status2);
		
	}
}
