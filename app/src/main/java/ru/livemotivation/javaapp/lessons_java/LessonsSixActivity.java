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

public class LessonsSixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_six);


        ImageView less06_image01 = findViewById(R.id.less06_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_06%2Fless06_image01.png?alt=media&token=1ec29a76-b40a-4fdb-a971-bc7c80ad9b41";
        Glide.with(getApplicationContext()).load(url).into(less06_image01);

        ImageView less06_image02 = findViewById(R.id.less06_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_06%2Fless06_image02.png?alt=media&token=fbf84a2c-414c-4e91-8910-cf46fbd0dd47";
        Glide.with(getApplicationContext()).load(url2).into(less06_image02);

        ImageView less06_image03 = findViewById(R.id.less06_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_06%2Fless06_image03.png?alt=media&token=3ff11c77-898b-496d-b857-9fd3f6f387ad";
        Glide.with(getApplicationContext()).load(url3).into(less06_image03);

        ImageView less06_image04 = findViewById(R.id.less06_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_06%2Fless06_image04.png?alt=media&token=8a5254fd-6e51-4389-87fd-5630718ee315";
        Glide.with(getApplicationContext()).load(url4).into(less06_image04);

        ImageView less06_image05 = findViewById(R.id.less06_image05);
        String url5= "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_06%2Fless06_image05.png?alt=media&token=1c38eb1a-2198-4352-95fb-df68053df05d";
        Glide.with(getApplicationContext()).load(url5).into(less06_image05);








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
                        Intent intent = new Intent(LessonsSixActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsSixActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsSixActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsSixActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsSixActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(LessonsSixActivity.this,LessonsFiveAriphmeticsActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(LessonsSixActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
       startActivity(new Intent(LessonsSixActivity.this,LessonsSevenActivity.class));

    }


}