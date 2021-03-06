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

public class LessonsSixteenActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_sixteen);

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
                        Intent intent = new Intent(LessonsSixteenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsSixteenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsSixteenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsSixteenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsSixteenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }

    public void ZoomImage () {
        ZoomInImageView less16_image01 = findViewById(R.id.less16_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_16%2Fless16_image01.png?alt=media&token=91af42b7-25e2-44ec-b356-eb107803861a";
        Glide.with(getApplicationContext()).load(url).into(less16_image01);

        ZoomInImageView less16_image02 = findViewById(R.id.less16_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_16%2Fless16_image02.png?alt=media&token=427b8bcd-f946-4d87-8be2-71f790d7a38e";
        Glide.with(getApplicationContext()).load(url2).into(less16_image02);
    }

    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Оператор return", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsSixteenActivity.this,LessonsFifteenActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Основы JAVA", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsSixteenActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Рекурсивные функции", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsSixteenActivity.this,LessonsSeventeenActivity.class));
    }


}