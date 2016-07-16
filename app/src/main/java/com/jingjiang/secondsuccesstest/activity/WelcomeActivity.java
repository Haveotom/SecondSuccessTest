package com.jingjiang.secondsuccesstest.activity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.jingjiang.secondsuccesstest.R;

/**
 * Created by dllo on 16/7/15.
 * 石超 写了 欢迎页
 */
public class WelcomeActivity extends AppCompatActivity {
    private ImageView image;
    private CountDownTimer timer;

    private TextView tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_welcome);
        image = (ImageView) findViewById(R.id.image);

        tv = (TextView) findViewById(R.id.tv);
        timer = new CountDownTimer(1000, 10000) {
            @Override
            public void onTick(long l) {
            }

            @Override
            public void onFinish() {

            }
        }.start();


    }
}
