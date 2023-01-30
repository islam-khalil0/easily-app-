package sliderParts;

import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.appeasily.MainActivity2;
import com.example.appeasily.R;


public class slider extends AppCompatActivity {

    private ViewPager viewPager;
    private sliderAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);



        viewPager = (ViewPager) findViewById(R.id.view_pg);


        myAdapter = new sliderAdapter(this);
        viewPager.setAdapter(myAdapter);

        Intent intent = new Intent(slider.this, MainActivity2.class);

        Thread thread = new Thread() {
            @Override
            public void run() {

                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();
                }
            }
        };

        thread.start();





    }
}

