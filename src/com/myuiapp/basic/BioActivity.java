package com.myuiapp.basic;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BioActivity extends Activity {

	Button btnShow;
	EditText inputName;
	EditText inputDate;
	EditText inputPhone;
	EditText inputJob;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bio);
		
		btnShow = (Button)findViewById(R.id.btn_show);
		inputName = (EditText)findViewById(R.id.et_nama);
		inputDate = (EditText)findViewById(R.id.et_tgl);
		inputPhone = (EditText)findViewById(R.id.et_notlp);
		inputJob = (EditText)findViewById(R.id.et_pkrj);

		//Listening to button event
		btnShow.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(BioActivity.this,ShowActivity.class);
				i.putExtra("name", inputName.getText().toString());
				i.putExtra("date", inputDate.getText().toString());
				i.putExtra("phone", inputPhone.getText().toString());
				i.putExtra("job", inputJob.getText().toString());
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
