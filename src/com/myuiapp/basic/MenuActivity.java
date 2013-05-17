package com.myuiapp.basic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MenuActivity extends Activity {

	ListView contentListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		contentListView = (ListView) findViewById(R.id.lv_content);
	
		String[] items = {
				getResources().getString(R.string.title_activity_bio),
				getResources().getString(R.string.title_activity_gallery),
				getResources().getString(R.string.adc_uinjkt),
		};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.menu_items, items);
		
		contentListView.setAdapter(adapter);
		
		contentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View itemViewClicked, int position, long id) {
				TextView tvClicked = (TextView) itemViewClicked;
				String strText = tvClicked.getText().toString();
				
				if(strText.equalsIgnoreCase(getResources().getString(R.string.title_activity_bio))){
					Intent intent = new Intent(MenuActivity.this,BioActivity.class);
					startActivity(intent);
				}else if (strText.equalsIgnoreCase(getResources().getString(R.string.title_activity_gallery))){
					Intent intent = new Intent(MenuActivity.this,GalleryActivity.class);
					startActivity(intent);
				}else if (strText.equalsIgnoreCase(getResources().getString(R.string.adc_uinjkt))){
					Intent intent = new Intent(MenuActivity.this,AboutActivity.class);
					startActivity(intent);
				}
			}
		});
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			Intent i = new Intent(this,MenuActivity.class);
			i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(i);
			return true;
		default :
			return super.onOptionsItemSelected(item);
		}
	}
	

}
