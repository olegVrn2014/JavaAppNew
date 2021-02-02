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
import ru.livemotivation.javaapp.lessons_oop.OopOneActivity;

public class LessonsEighteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_eighteen);

        ZoomInImageView less18_image01 = findViewById(R.id.less18_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_18%2Fless18_image01.png?alt=media&token=5ee54d95-8fc1-40fb-97ef-c4b7010cf0f8";
        Glide.with(getApplicationContext()).load(url).into(less18_image01);

        ZoomInImageView less18_image02 = findViewById(R.id.less18_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_18%2Fless18_image02.png?alt=media&token=5d424813-1723-424b-8513-fa4cf4f58a3f";
        Glide.with(getApplicationContext()).load(url2).into(less18_image02);

        ZoomInImageView less18_image03 = findViewById(R.id.less18_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_18%2Fless18_image03.png?alt=media&token=bfd073a3-81fb-46f0-abe1-418c5428e7f2";
        Glide.with(getApplicationContext()).load(url3).into(less18_image03);

        ZoomInImageView less18_image04 = findViewById(R.id.less18_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_18%2Fless18_image04.png?alt=media&token=31acb08a-6dc6-44ef-87e2-daf1e028c3b2";
        Glide.with(getApplicationContext()).load(url4).into(less18_image04);

        ZoomInImageView less18_image05 = findViewById(R.id.less18_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_18%2Fless18_image05.png?alt=media&token=30fff7cb-0fd0-42b9-801a-405709d96242";
        Glide.with(getApplicationContext()).load(url5).into(less18_image05);

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
                        Intent intent = new Intent(LessonsEighteenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsEighteenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsEighteenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsEighteenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsEighteenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(LessonsEighteenActivity.this,LessonsSeventeenActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(LessonsEighteenActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(LessonsEighteenActivity.this, OopOneActivity.class));

    }


}