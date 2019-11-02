package com.example.myresumeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AdapterView.AdapterContextMenuInfo;

public class MainActivity extends Activity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
 

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
 
        return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) { 
		    switch (item.getItemId()) {
	        case R.id.edu:
	            Intent iedu=new Intent(MainActivity.this,education.class);
	            startActivity(iedu);
	          return true;
	        case R.id.obj:
	        	Intent iobj=new Intent("objective1");
	            startActivity(iobj);
	            return true;
	        case R.id.cont:
	        	Intent icont=new Intent("contact1");
	            startActivity(icont);
	            return true;
	        case R.id.per:
	        	Intent iper=new Intent("personal1");
	            startActivity(iper);
	            return true;
	        case R.id.ref:
	        	Intent iref=new Intent("reference1");
	            startActivity(iref);
	            return true;
	        default:
	        	return super.onOptionsItemSelected(item);
	    }
	}}
	
	/* tv1=(TextView)findViewById(R.id.tv1);
       
        String htmlText = "\t\t\t\tHello,My Self<font color=Red> Pankaj Dhanaji Mohite</font>,from<font color=red> Mumbai.</font>I am pursuing my bachelor degree third year of Computer Engineering in </font><font color=red>Terna Engineering College</font>,Nerul(Navi Mumbai).My strengths are hard working,self-motivated,always ready to learn something new.<p>\t\t\tMy weakness is nothing,but I will be find overcome it soon.My hobby is surfing internet related to my interest.My family concerns 5 members including me.";
		tv1.setText(Html.fromHtml(htmlText));
	*/ 
	
	

