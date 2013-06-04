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
    	
    	calcTip(view, 0.1);
    }


	private void calcTip(View view, Double tipPct) {
		EditText etTotalAmt = (EditText)findViewById(R.id.etTotalAmt);
		Double totalAmout = Double.valueOf(etTotalAmt.getText().toString().trim());
		if (totalAmout == null )
			totalAmout = 0.0;
    	double tip = totalAmout.doubleValue() * tipPct;
    	TextView tipView = (TextView)findViewById(R.id.tvTipAmt);
    	tipView.setText("Tip is : " + tip);
    	etTotalAmt.setText("");
	}
    
    public void onFifteenPct(View view){
    	calcTip(view, 0.15);
    }
    
    public void onTwentyPct(View view){
    	calcTip(view, 0.2);
    }
}
