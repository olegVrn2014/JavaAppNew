package ru.livemotivation.javaapp.lessons_java;

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

public class LessonsThirteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_thirteen);


        ZoomInImageView less13_image01 = findViewById(R.id.less13_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_13%2Fless13_image01.png?alt=media&token=20365501-f80e-41e4-a7fd-8fc2e307d0a9";
        Glide.with(getApplicationContext()).load(url).into(less13_image01);

        ZoomInImageView less13_image02 = findViewById(R.id.less13_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_13%2Fless13_image02.png?alt=media&token=6f862e61-f14a-4e2d-a8ea-ad5a984d4ff2";
        Glide.with(getApplicationContext()).load(url2).into(less13_image02);

        ZoomInImageView less13_image03 = findViewById(R.id.less13_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_13%2Fless13_image03.png?alt=media&token=b862568e-b4da-41f8-8a66-bb42c3cd7946";
        Glide.with(getApplicationContext()).load(url3).into(less13_image03);

        ZoomInImageView less13_image04 = findViewById(R.id.less13_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_13%2Fless13_image04.png?alt=media&token=1d43eb89-203a-417a-8a35-cb9938840f34";
        Glide.with(getApplicationContext()).load(url4).into(less13_image04);

        ZoomInImageView less13_image05 = findViewById(R.id.less13_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_13%2Fless13_image05.png?alt=media&token=cd958e22-0295-4f0f-be0e-53bd42710a41";
        Glide.with(getApplicationContext()).load(url5).into(less13_image05);

        ZoomInImageView less13_image06 = findViewById(R.id.less13_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_13%2Fless13_image06.png?alt=media&token=c6040c58-d800-492c-ad5c-95330a294d9c";
        Glide.with(getApplicationContext()).load(url6).into(less13_image06);



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
                        Intent intent = new Intent(LessonsThirteenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsThirteenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsThirteenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsThirteenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsThirteenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(LessonsThirteenActivity.this,LessonsTwelveActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(LessonsThirteenActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
         startActivity(new Intent(LessonsThirteenActivity.this,LessonsFourteenActivity.class));

    }


}