package com.myuiapp.basic;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class AboutActivity extends Activity {

	TextView description;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		
		StringBuilder builder = new StringBuilder();
			for (String dialog : ABOUT) {
				builder.append(dialog).append("\n\n");
			}
			
		description = (TextView) findViewById(R.id.tv_description);
		description.setText(builder.toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}
	
	public static final String[] ABOUT = new String[] {
		
		"Adalah tempat untuk berbagi Pengetahuan, Ide,"+ 
	    "Kerjasama meliputi Bagaimana? (meliputi cara pengembangan"+
	    " dan penentuan fitur), Untuk Siapa? (target pengguna yang"+
	    "dituju pembisnis, mahasiswa dan lain2), Dimana?"+ 
	    "(sekolah, perkantoran atau umum) dalam mengembangkan aplikasi Android"
	};
	
}
