package com.example.appeasily;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.nfc.tech.TagTechnology;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity3 extends AppCompatActivity {

    sliderAdapterInApp mySlider ;
    ViewPager viewPager ;
    Button btn_home, btn_profile, btn_sections;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        drawerLayout = (DrawerLayout) findViewById(R.id.dr);
        btn_home = (Button) findViewById(R.id.button_home);
        btn_profile = (Button) findViewById(R.id.profile_button);
        btn_sections = (Button) findViewById(R.id.sections_button);
        viewPager = (ViewPager) findViewById(R.id.slider_in_app);


        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        //drawer layout home
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MainActivity3.slade_timer(),4000,6000);


        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                home_fragment fragment = new home_fragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragmentContainerView, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });


        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                profile_fragment fragment = new profile_fragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragmentContainerView, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        btn_sections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sections_fragment fragment = new sections_fragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragmentContainerView, fragment);
                ft.addToBackStack(null);
                ft.commit();

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        
        return super.onOptionsItemSelected(item);

    }

    class slade_timer extends TimerTask{

        @Override
        public void run() {
            MainActivity3.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewPager.getCurrentItem()<4){
                        viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
                    }else
                        viewPager.setCurrentItem(0);
                }
            });
        }
    }

}