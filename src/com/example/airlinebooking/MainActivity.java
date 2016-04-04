package com.example.airlinebooking;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText etName;
	private EditText etPassword;
	private ImageButton imbt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
//		��ÿؼ�
		setViews();
//		���ü�����
		setListener();
	}

	private void setListener() {
		// TODO Auto-generated method stub
		imbt.setOnClickListener(new OnClickListener() {
			
			private String name;
			private String password;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setDatas();
				if("lee".equals(name)&&"123456".equals(password)){
					Intent i = new Intent(MainActivity.this,MenuActivity.class);
					startActivity(i);
					finish();
				}else{
					etName.setText("");
					etPassword.setText("");
					Toast.makeText(MainActivity.this, "��������˺Ż�������������������", Toast.LENGTH_SHORT).show();
				}
			}

			private void setDatas() {
				// TODO Auto-generated method stub
//				���ؼ���õ�����ת��Ϊ�ַ���
				name = etName.getText().toString();
				password = etPassword.getText().toString();
			}
		});
	}

	private void setViews() {
		// TODO Auto-generated method stub
//		��ÿؼ�
		etName = (EditText)findViewById(R.id.etName);
		etPassword = (EditText)findViewById(R.id.etPassword);
		imbt = (ImageButton)findViewById(R.id.imbtLogin);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
