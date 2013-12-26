package com.conrad.s01_16_datapicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends Activity {
	
	private DatePicker datePicker;
	private Button button;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		datePicker = (DatePicker)findViewById(R.id.testDatePicker);
		button = (Button)findViewById(R.id.button);
		ButtonOnClickListener buttonListener = new ButtonOnClickListener();
		button.setOnClickListener(buttonListener);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	class ButtonOnClickListener implements OnClickListener{
		@Override
		public void onClick(View v) {
			int year = datePicker.getYear();
			int month = datePicker.getMonth();
			int date = datePicker.getDayOfMonth();
			System.out.println(year + " " + month +" "+ date);
		}
	}

}
