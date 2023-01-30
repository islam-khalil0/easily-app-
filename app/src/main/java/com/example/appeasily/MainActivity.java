package com.example.appeasily;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import sliderParts.slider;

public class MainActivity extends Activity {

    ImageView imageView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);



        imageView = (ImageView) findViewById(R.id.logo);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim);
        imageView.startAnimation(animation);

        final Intent intent = new Intent(MainActivity.this, slider.class);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();

                }
            }
        };

        thread.start();




    }
}