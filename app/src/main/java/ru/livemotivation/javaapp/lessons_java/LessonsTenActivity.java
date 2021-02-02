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

public class LessonsTenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_ten);

        ImageView less10_image01 = findViewById(R.id.less10_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_10%2Fless10_image01.png?alt=media&token=c2d658e5-31e3-45db-ba90-cd28955b1a11";
        Glide.with(getApplicationContext()).load(url).into(less10_image01);

        ImageView less10_image02 = findViewById(R.id.less10_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_10%2Fless10_image02.png?alt=media&token=2856587e-06d1-4c7d-8fca-468fcf5faac0";
        Glide.with(getApplicationContext()).load(url2).into(less10_image02);

        ImageView less10_image03 = findViewById(R.id.less10_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_10%2Fless10_image03.png?alt=media&token=2b578b01-c75c-4ea0-81a6-da74461a8f36";
        Glide.with(getApplicationContext()).load(url3).into(less10_image03);

        ImageView less10_image04 = findViewById(R.id.less10_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_10%2Fless10_image04.png?alt=media&token=112f32c4-c662-459a-bfcf-9211554a56a7";
        Glide.with(getApplicationContext()).load(url4).into(less10_image04);

        ImageView less10_image05 = findViewById(R.id.less10_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_10%2Fless10_image05.png?alt=media&token=31ddbdda-5207-4612-a6a1-5657f2a73852";
        Glide.with(getApplicationContext()).load(url5).into(less10_image05);

        ImageView less10_image06 = findViewById(R.id.less10_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_10%2Fless10_image06.png?alt=media&token=c0e17b2b-f70b-4c55-8b9b-c8ed7c0188d9";
        Glide.with(getApplicationContext()).load(url6).into(less10_image06);

        ImageView less10_image07 = findViewById(R.id.less10_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_10%2Fless10_image07.png?alt=media&token=2c466c3a-61be-4707-b59d-aae512f7ec17";
        Glide.with(getApplicationContext()).load(url7).into(less10_image07);

              ImageView less10_image08 = findViewById(R.id.less10_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_10%2Fless10_image08.png?alt=media&token=1168d80a-e0e1-4c98-9db6-9e24648ae69b";
        Glide.with(getApplicationContext()).load(url8).into(less10_image08);



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
                        Intent intent = new Intent(LessonsTenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsTenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsTenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsTenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsTenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(LessonsTenActivity.this,LessonsNineActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(LessonsTenActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(LessonsTenActivity.this,LessonsElevenActivity.class));

    }


}