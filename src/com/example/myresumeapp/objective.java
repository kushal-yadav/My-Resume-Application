package com.example.myresumeapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class objective extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.objective);
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.obj, menu);
        return true;
    }
    @Override
	public boolean onOptionsItemSelected(MenuItem item) { 
		    switch (item.getItemId()) {
	        case R.id.edu:
	            Intent iedu=new Intent(objective.this,MainActivity.class);
	            startActivity(iedu);
	          return true;
	        case R.id.obj:
	        	Intent iobj=new Intent("objective1");
	            startActivity(iobj);
	            return true;
	        case R.id.main:
	        	Intent imain=new Intent("main1");
	            startActivity(imain);
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

    
    }
    
}
