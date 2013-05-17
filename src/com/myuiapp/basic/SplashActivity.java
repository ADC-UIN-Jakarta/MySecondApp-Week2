package com.myuiapp.basic;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class SplashActivity extends Activity {

	private long displayDelay = 3000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				finish();
				Intent i = new Intent(SplashActivity.this, MenuActivity.class);
				startActivity(i);
			}
		};
		Timer timer = new Timer();
		timer.schedule(task,displayDelay);
	}


}
