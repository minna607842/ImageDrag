package com.example.imagedrag;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class MyView extends View {
	//イメージの座標
	float x = 200;
	float y = 200;

	//イメージ
	Bitmap bitmap;

	//Paintオブジェクト
	Paint paint;

	//コンストラクタ
	public MyView(Context context){
		super(context);
		//Resourcesオブジェクトを取得
		Resources res = getResources();
		//リソースからBitmapオブジェクトを生成
		bitmap = BitmapFactory.decodeResource(res, R.drawable.sheep);
		//Paintオブジェクトを生成
		paint = new Paint();
	}

	@Override
	protected void onDraw(Canvas canvas){
		super.onDraw(canvas);
		//Bitmapオブジェクトの幅と高さを取得する
		int width = bitmap.getWidth();
		int height = bitmap.getHeight();

		//Bitmapオブジェクトを描画する
		canvas.drawBitmap(bitmap, x- width / 2, y - height / 2, paint);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event){
		switch (event.getAction()){
			case MotionEvent.ACTION_DOWN:
			case MotionEvent.ACTION_MOVE:

				//イベント位置の座標を取得
				x = event.getX();
				y = event.getY();
				//画面を更新
				invalidate();
				break;
			case MotionEvent.ACTION_UP:
				break;

		}
		return true;
	}
}
