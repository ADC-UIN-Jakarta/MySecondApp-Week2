package com.myuiapp.basic;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
//import android.view.MenuItem;
import android.widget.TextView;

public class ShowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show);
		
		TextView txtName = (TextView)findViewById(R.id.tv_show_nama);
		TextView txtDate = (TextView)findViewById(R.id.tv_show_tgl);
		TextView txtPhone = (TextView)findViewById(R.id.tv_show_tlp);
		TextView txtJob = (TextView)findViewById(R.id.tv_show_pkrj);
	
		Intent i = getIntent();
		
		// Receiving the Data
		String name = i.getStringExtra("name");
		String date = i.getStringExtra("date");
		String phone = i.getStringExtra("phone");
		String job = i.getStringExtra("job");
		
		txtName.setText(name);
		txtDate.setText(date);
		txtPhone.setText(phone);
		txtJob.setText(job);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show, menu);
		return true;
	}

	/*public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			Intent i = new Intent(this,MenuActivity.class);
			i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(i);
			return true;
		default :
			return super.onOptionsItemSelected(item);
		}
	}*/
}
