package com.example.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onTenPct(View view){
    	EditText etTotalAmt = (EditText)findViewById(R.id.etTotalAmt);
    	Double totalAmout = Double.valueOf(etTotalAmt.getText().toString().trim());
    	double tip = totalAmout.doubleValue() * 0.1;
    	TextView tipView = (TextView)findViewById(R.id.tvTipAmt);
    	tipView.setText("Tip is : " + tip);
    	etTotalAmt.setText("");
    }
    
    public void onFifteenPct(View view){
    	EditText etTotalAmt = (EditText)findViewById(R.id.etTotalAmt);
    	Double totalAmout = Double.valueOf(etTotalAmt.getText().toString().trim());
    	double tip = totalAmout.doubleValue() * 0.15;
    	TextView tipView = (TextView)findViewById(R.id.tvTipAmt);
    	tipView.setText("Tip is : " + tip);
    	etTotalAmt.setText("");
    }
    
    public void onTwentyPct(View view){
    	EditText etTotalAmt = (EditText)findViewById(R.id.etTotalAmt);
    	Double totalAmout = Double.valueOf(etTotalAmt.getText().toString().trim());
    	double tip = totalAmout.doubleValue() * 0.2;
    	TextView tipView = (TextView)findViewById(R.id.tvTipAmt);
    	tipView.setText("Tip is : " + tip);
    	etTotalAmt.setText("");
    }
}
