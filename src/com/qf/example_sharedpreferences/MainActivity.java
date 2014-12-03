package com.qf.example_sharedpreferences;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
//SharedPreferences�ڲ��洢.�洢������Ϣ.
public class MainActivity extends Activity {
private EditText etxtv;
private TextView txtv;
private ListView lv;
SharedPreferences share;
//private Button btn_save,btn_get;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();

	}
	private void showData() {
	// TODO Auto-generated method stub
	txtv.setText(getData());
	}
	private String getData() {
	// TODO Auto-generated method stub
	String string = share.getString("str", "null");
	return string;
	}
	private void saveData() {
		// TODO Auto-generated method stub
		Editor edit = share.edit();
		Editor putString = edit.putString("str", etxtv.getText().toString());
		putString.commit();
	}
	private void init() {
		// TODO Auto-generated method stub
		etxtv=(EditText) findViewById(R.id.etxtv);
		txtv=(TextView) findViewById(R.id.txtv);
		lv=(ListView) findViewById(R.id.lv);
		share = getSharedPreferences("mfile", Context.MODE_PRIVATE);//Ҫ��Ϊȫ�ֱ���.��Ȼ�����.��ָ���쳣.
	}
	public void btnClick(View view){
		switch(view.getId()){
		case R.id.btn_get:
			showData();
			break;
		case R.id.btn_save:
			saveData();
			break;
		}
	}
}

