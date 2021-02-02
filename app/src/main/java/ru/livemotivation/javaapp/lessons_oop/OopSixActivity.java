package ru.livemotivation.javaapp.lessons_oop;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.zolad.zoominimageview.ZoomInImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import ru.livemotivation.javaapp.ActivityFourOther;
import ru.livemotivation.javaapp.ActivityOneLessonsTheme;
import ru.livemotivation.javaapp.ActivityThreeCollections;
import ru.livemotivation.javaapp.ActivityTwoOop;
import ru.livemotivation.javaapp.BottomNavigationViewHelper;
import ru.livemotivation.javaapp.MainActivity;
import ru.livemotivation.javaapp.R;

public class OopSixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_six);

        ZoomInImageView lessOop06_image01 = findViewById(R.id.lessOop06_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop06%2F1.png?alt=media&token=856f02db-2f28-4764-b42d-1b5bdcfa8860";
        Glide.with(getApplicationContext()).load(url).into(lessOop06_image01);

        ZoomInImageView lessOop06_image02 = findViewById(R.id.lessOop06_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop06%2F2.png?alt=media&token=41a71ee6-27f1-4b13-acfc-c9df2e1d2c69";
        Glide.with(getApplicationContext()).load(url2).into(lessOop06_image02);

        ZoomInImageView lessOop06_image03 = findViewById(R.id.lessOop06_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop06%2F3.png?alt=media&token=4e9eaf4b-b4ec-407d-85fd-f14d396a9f00";
        Glide.with(getApplicationContext()).load(url3).into(lessOop06_image03);

        ZoomInImageView lessOop06_image04 = findViewById(R.id.lessOop06_image04);
        String url4= "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop06%2F4.png?alt=media&token=9948ea93-b0e4-4d8a-b443-79bb9e5ccb1b";
        Glide.with(getApplicationContext()).load(url4).into(lessOop06_image04);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_main:
                        Intent intent = new Intent(OopSixActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopSixActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopSixActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopSixActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopSixActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopSixActivity.this, OopFiveActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopSixActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
         startActivity(new Intent(OopSixActivity.this, OopSevenActivity.class));

    }


}