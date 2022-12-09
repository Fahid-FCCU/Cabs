package com.example.cabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView appLogo;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initViews();
        //setFullScreenWindow();

    }
    private void initViews(){
        appLogo = findViewById(R.id.ivApplogo);
        handler = new Handler(Looper.getMainLooper()); // used for waiting the screen for specific time
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 1000ms=1sec
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
            }
        }, 3000);//give the time 1000*number of seconds

    }

    private void setFullScreenWindow() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}