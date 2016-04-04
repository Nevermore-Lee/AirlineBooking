package com.example.airlinebooking;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class SearchBranchActivity extends Activity {

	private ImageView home;
	private Spinner sp;
	private String[] cities;
	private ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//		去除标题栏
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_search_branch);
		setViews();
		setListeners();

	}

	private void setListeners() {
		// TODO Auto-generated method stub
		//		home键返回
		home.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				复写onClick方法
				// TODO Auto-generated method stub
				Intent i = new Intent(SearchBranchActivity.this,MenuActivity.class);
				startActivity(i);
			}
		});
	}


	private void setViews() {
		// TODO Auto-generated method stub
		home = (ImageView)findViewById(R.id.iv_home1);
		sp = (Spinner)findViewById(R.id.sp_search_branch);
		//		设置适配器
		setAdapter();
		adapter = new ArrayAdapter<String>(SearchBranchActivity.this, android.R.layout.simple_spinner_item,cities);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
		sp.setAdapter(adapter);
	}

	private void setAdapter() {
		// TODO Auto-generated method stub
		//		设置城市数组
		setDatas();
	}

	private void setDatas() {
		// TODO Auto-generated method stub
		cities = new String []{"重庆","南京","北京","上海"};
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search_branch, menu);
		return true;
	}

}
