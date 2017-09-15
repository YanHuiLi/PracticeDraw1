package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    Paint paint = null;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        /**
         * 传入三个的独有信息确定一个圆的圆点和半径
         * cx cy确定圆的圆点位置
         * radius 半径
         * paint  画笔
         * @param cx     The x-coordinate of the center of the cirle to be drawn
         * @param cy     The y-coordinate of the center of the cirle to be drawn
         * @param radius The radius of the cirle to be drawn
         * @param paint  The paint used to draw the circle
         */

        //实心圆黑色
        drawCircle01(canvas);

        //空心圆
        drawCircle02(canvas);

        //实心圆
        drawCircle03(canvas);

        //空心圆
        drawCircle04(canvas);


    }

    private void drawCircle04(Canvas canvas) {

        paint= new Paint(Paint.ANTI_ALIAS_FLAG);//抗锯齿
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(60);//设置线条的宽度
        canvas.drawCircle(700,500,150,paint);
    }

    private void drawCircle03(Canvas canvas) {
        paint=new Paint(Paint.ANTI_ALIAS_FLAG);//加上扛锯齿的flag
        paint.setColor(Color.GRAY);//设置颜色
        canvas.drawCircle(350,500,150,paint);
    }

    private void drawCircle02(Canvas canvas) {
        /**
         * 空心圆
         */
        paint=new Paint();
        paint.setStyle(Paint.Style.STROKE);//画线模式
        paint.setStrokeWidth(5);//设置线条的宽度
        canvas.drawCircle(700, 150, 150, paint);
    }

    private void drawCircle01(Canvas canvas) {
        /**
         * 实心圆
         */
        paint=new Paint();
        canvas.drawCircle(350, 150, 150, paint);
    }
}
