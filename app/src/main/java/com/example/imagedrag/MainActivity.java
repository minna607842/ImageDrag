package com.example.imagedrag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);

		// MyViewクラスのインスタンスを生成
		MyView myView = new MyView(this);
		// MyViewをアクティビティの画面に設定
		setContentView(myView);
	}
}