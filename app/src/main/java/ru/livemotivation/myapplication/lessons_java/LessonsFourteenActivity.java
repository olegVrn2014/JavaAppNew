package ru.livemotivation.myapplication.lessons_java;

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
import ru.livemotivation.myapplication.ActivityFourOther;
import ru.livemotivation.myapplication.ActivityOneLessonsTheme;
import ru.livemotivation.myapplication.ActivityThreeCollections;
import ru.livemotivation.myapplication.ActivityTwoOop;
import ru.livemotivation.myapplication.BottomNavigationViewHelper;
import ru.livemotivation.myapplication.MainActivity;
import ru.livemotivation.myapplication.R;

public class LessonsFourteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_fourteen);

        ZoomInImageView less14_image01 = findViewById(R.id.less14_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_14%2Fless14_image01.png?alt=media&token=e2d6661f-6608-4f3d-b273-f32d4a63aca0";
        Glide.with(getApplicationContext()).load(url).into(less14_image01);

        ZoomInImageView less14_image02 = findViewById(R.id.less14_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_14%2Fless14_image02.png?alt=media&token=37e59287-3eef-4068-8212-77ac7929bef1";
        Glide.with(getApplicationContext()).load(url2).into(less14_image02);

        ZoomInImageView less14_image03 = findViewById(R.id.less14_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_14%2Fless14_image03.png?alt=media&token=5ec80b7c-db3b-448d-8589-0df29378143a";
        Glide.with(getApplicationContext()).load(url3).into(less14_image03);

        ZoomInImageView less14_image04 = findViewById(R.id.less14_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_14%2Fless14_image04.png?alt=media&token=89cdc017-c744-4291-8f6a-8ec631774572";
        Glide.with(getApplicationContext()).load(url4).into(less14_image04);

        ZoomInImageView less14_image05 = findViewById(R.id.less14_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_14%2Fless14_image05.png?alt=media&token=cb6282f6-730f-46b4-84dc-1f0689f94fec";
        Glide.with(getApplicationContext()).load(url5).into(less14_image05);


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
                        Intent intent = new Intent(LessonsFourteenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsFourteenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsFourteenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsFourteenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsFourteenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(LessonsFourteenActivity.this,LessonsThirteenActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(LessonsFourteenActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(LessonsFourteenActivity.this,LessonsFifteenActivity.class));

    }


}