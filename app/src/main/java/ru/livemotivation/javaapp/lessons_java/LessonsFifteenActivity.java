package ru.livemotivation.javaapp.lessons_java;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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

public class LessonsFifteenActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_fifteen);

        mediaPlayerBtn = MediaPlayer.create(this,R.raw.sounds);
        ZoomImage();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_main:
                        Intent intent = new Intent(LessonsFifteenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsFifteenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsFifteenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsFifteenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsFifteenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }

    public void ZoomImage () {
        ZoomInImageView less15_image01 = findViewById(R.id.less15_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_15%2Fless15_image01.png?alt=media&token=73b8f0db-c5a0-48bf-b0a7-6d65a15a5eda";
        Glide.with(getApplicationContext()).load(url).into(less15_image01);

        ZoomInImageView less15_image02 = findViewById(R.id.less15_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_15%2Fless15_image02.png?alt=media&token=e6d49a5d-0306-4dab-8fe6-66bb6a988e62";
        Glide.with(getApplicationContext()).load(url2).into(less15_image02);

        ZoomInImageView less15_image03 = findViewById(R.id.less15_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_15%2Fless15_image03.png?alt=media&token=224c2935-311b-4b45-aaf7-d97eb0061be9";
        Glide.with(getApplicationContext()).load(url3).into(less15_image03);

        ZoomInImageView less15_image04 = findViewById(R.id.less15_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_15%2Fless15_image04.png?alt=media&token=4785874f-b764-4026-b41a-6674a12ca44a";
        Glide.with(getApplicationContext()).load(url4).into(less15_image04);

        ZoomInImageView less15_image05 = findViewById(R.id.less15_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_15%2Fless15_image05.png?alt=media&token=327993b6-3bda-42fb-b117-15b13228b232";
        Glide.with(getApplicationContext()).load(url5).into(less15_image05);

        ZoomInImageView less15_image06 = findViewById(R.id.less15_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_15%2Fless15_image06.png?alt=media&token=a815b4ea-2070-4520-8abc-1909c8fb0376";
        Glide.with(getApplicationContext()).load(url6).into(less15_image06);
    }


    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Параметры методов", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsFifteenActivity.this,LessonsFourteenActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Основы JAVA", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsFifteenActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Перегрузка методов", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsFifteenActivity.this,LessonsSixteenActivity.class));

    }


}