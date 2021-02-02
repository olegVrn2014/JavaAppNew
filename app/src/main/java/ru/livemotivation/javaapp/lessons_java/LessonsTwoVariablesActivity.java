package ru.livemotivation.javaapp.lessons_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import ru.livemotivation.javaapp.ActivityFourOther;
import ru.livemotivation.javaapp.ActivityOneLessonsTheme;
import ru.livemotivation.javaapp.ActivityThreeCollections;
import ru.livemotivation.javaapp.ActivityTwoOop;
import ru.livemotivation.javaapp.BottomNavigationViewHelper;
import ru.livemotivation.javaapp.MainActivity;
import ru.livemotivation.javaapp.R;

public class LessonsTwoVariablesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_two_variables);

       ImageView less02_image01 = findViewById(R.id.less02_image01);
       String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_02%2Fless02_image01.png?alt=media&token=4da4039b-ada6-4fc7-b803-a368832a3979";
       Glide.with(getApplicationContext()).load(url).into(less02_image01);

        ImageView less02_image02 = findViewById(R.id.less02_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_02%2Fless02_image02.png?alt=media&token=682da013-f6d3-4836-a322-8d01105ba0ef";
        Glide.with(getApplicationContext()).load(url2).into(less02_image02);

        ImageView less02_image03 = findViewById(R.id.less02_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_02%2Fless02_image03.png?alt=media&token=fd9ff0a3-f345-41d3-911f-0a3856d8747c";
        Glide.with(getApplicationContext()).load(url3).into(less02_image03);

        ImageView less02_image04 = findViewById(R.id.less02_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_02%2Fless02_image04.png?alt=media&token=5715980b-9dee-4da9-a9cd-a287b2058a6f";
        Glide.with(getApplicationContext()).load(url4).into(less02_image04);

        ImageView less02_image05 = findViewById(R.id.less02_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_02%2Fless02_image05.png?alt=media&token=c493a9be-fa84-4899-ac15-4b0ae555c0b5";
        Glide.with(getApplicationContext()).load(url5).into(less02_image05);

        ImageView less02_image06 = findViewById(R.id.less02_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_02%2Fless02_image06.png?alt=media&token=a4cbe15b-094d-4efb-a0c7-3fd7c2f825ad";
        Glide.with(getApplicationContext()).load(url6).into(less02_image06);

        ImageView less02_image07 = findViewById(R.id.less02_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_02%2Fless02_image07.png?alt=media&token=7a5d9522-9fd0-477e-9fb2-ccbdff59c3ce";
        Glide.with(getApplicationContext()).load(url7).into(less02_image07);

        ImageView less02_image08 = findViewById(R.id.less02_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_02%2Fless02_image08.png?alt=media&token=aa7010ab-e35b-4781-a088-443ba744449c";
        Glide.with(getApplicationContext()).load(url8).into(less02_image08);

        ImageView less02_image09 = findViewById(R.id.less02_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_02%2Fless02_image09.png?alt=media&token=3c16d9c7-6a12-47a1-a2e8-068b867166a8";
        Glide.with(getApplicationContext()).load(url9).into(less02_image09);

        ImageView less02_image10 = findViewById(R.id.less02_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_02%2Fless02_image10.png?alt=media&token=a8172c12-61f5-4691-ad7d-0b296c319d04";
        Glide.with(getApplicationContext()).load(url10).into(less02_image10);






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
                        Intent intent = new Intent(LessonsTwoVariablesActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsTwoVariablesActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsTwoVariablesActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsTwoVariablesActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsTwoVariablesActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }

    public void onClickPrevious(View view) {
        startActivity(new Intent(LessonsTwoVariablesActivity.this,LessonsOneHelloWorldActivity.class));
    }

    public void onClickLessons(View view) {
         startActivity(new Intent(LessonsTwoVariablesActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
         startActivity(new Intent(LessonsTwoVariablesActivity.this,LessonsThreeTypeActivity.class));

    }


}
