package com.app.quantum;






import android.app.Activity;
import android.app.ListActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class Info extends Activity {

	 private ListView lv1;
	 
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
		

	 private String lv_arr[]={"Directory Telephone","UP Map","About Us","About UP MOBILE PORTAL","Contact us"};
	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.info);
	        
	       
       	


	        lv1=(ListView)findViewById(R.id.listView1);

	        // By using setAdpater method in listview we an add string array in list.

	        lv1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , lv_arr));


	       

	        lv1=(ListView)findViewById(R.id.listView1);

	        // By using setAdpater method in listview we an add string array in list.

	        lv1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , lv_arr));


	        lv1.setOnItemClickListener(new OnItemClickListener() {
	            public void onItemClick(AdapterView<?> parent, View view,
	                int position, long id) {
	                final TextView mTextView = (TextView)view;
	                switch (position) {
	                  case 0:
	                   Intent newActivity0 = new Intent(Info.this,Directory.class);     
	                   startActivity(newActivity0);
	                  
	                  break;
	                  case 1:
		                   Intent newActivity1 = new Intent(Info.this,Map.class);     
		                   startActivity(newActivity1);
		                 
		                  break;
		                  
	                  case 2:
		                   Intent newActivity2 = new Intent(Info.this,About.class);     
		                   startActivity(newActivity2);
		                 
		                  break;
		                  
	                  case 3:
		                   Intent newActivity5 = new Intent(Info.this,Upabout.class);     
		                   startActivity(newActivity5);
		                 
		                  break;
		                  
	                  case 4:
		                   Intent newActivity6 = new Intent(Info.this,Contact.class);     
		                   startActivity(newActivity6);
		                 
		                  break;
	                }

	            }
	          });

	   	 
	   	     
	   	     Button b = (Button) findViewById(R.id.button3);
	   	     b.setOnClickListener(new View.OnClickListener() {
	   	        public void onClick(View arg0) {
	   	        Intent i = new Intent(Info.this,Misc.class);
	   	        startActivity(i);
	   	        finish();
	   	        } 
	   	     });
	   	     
	   	     Button g = (Button) findViewById(R.id.button4);
	   	     g.setOnClickListener(new View.OnClickListener() {
	   	        public void onClick(View arg0) {
	   	        Intent i = new Intent(Info.this,Social.class);
	   	        startActivity(i);
	   	        finish();
	   	        } 
	   	     });
	   	     
	   	  Button n = (Button) findViewById(R.id.button1);
		     n.setOnClickListener(new View.OnClickListener() {
		        public void onClick(View arg0) {
		        Intent i = new Intent(Info.this,News.class);
		        startActivity(i);
		        finish();
		        } 
		     });
	   	     
	   	     
	   	     
	   	     Button z = (Button) findViewById(R.id.button5);
	   	     z.setOnClickListener(new View.OnClickListener() {
	   	        public void onClick(View arg0) {
	   	        Intent i = new Intent(Info.this,Logon.class);
	   	        startActivity(i);
	   	        finish();
	   	        } 
	   	     });
		    }


	        
	        
	          }

	
	
	


