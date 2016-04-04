package com.example.airlinebooking;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

public class MenuActivity extends Activity {

	private ImageButton imbt1;
	private ImageButton imbt2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_menu);
//		»ñµÃ¿Ø¼þ
		setViews();
		setListeners();
	}

	private void setListeners() {
		// TODO Auto-generated method stub
		imbt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MenuActivity.this,SearchBranchActivity.class);
				startActivity(i);
			}
		});
		imbt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MenuActivity.this,SearchFlightPlanActivity.class);
				startActivity(i);
			}
		});
	}

	private void setViews() {
		// TODO Auto-generated method stub
		imbt1 = (ImageButton)findViewById(R.id.imbt_search_branch);
		imbt2 = (ImageButton)findViewById(R.id.imbt_search_flight_plan);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
