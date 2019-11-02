package com.example.myresumeapp;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class home extends Activity {
	EditText et1,et2,et3;
	private Toast t1;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
	}
	 public void authenticate(View v)
	    {
	    	String s1=et1.getText().toString();
	        String s2=et2.getText().toString();
	        String s3=et3.getText().toString();
			
			if(s3.length()>7)
	    	{
	    		Toast t1=Toast.makeText(this,"Memory Out of bound.",Toast.LENGTH_LONG);
	    		t1.show();
	    		Toast t2=Toast.makeText(this,"Max Memory size 7",Toast.LENGTH_LONG);
	    		t2.show();
	    	}else if(s1.equals("abc@gmail.com")&&s2.equals("1234"))
	    		{Toast t1=Toast.makeText(this,"Verifying...",Toast.LENGTH_SHORT);
	    		t1.show();
	    		Toast t2=Toast.makeText(this,"Verified! Log in successsful",Toast.LENGTH_LONG);
	    		t2.show();
	    		Intent i=new Intent(home.this,MainActivity.class);
				Bundle b=new Bundle();
				i.putExtras(b);
				startActivity(i);
	    		}else
	    	{
	    		Toast t1=Toast.makeText(this,"Error. Retry",Toast.LENGTH_LONG);
	    		t1.show();
	    	}		
	    }
   
}
