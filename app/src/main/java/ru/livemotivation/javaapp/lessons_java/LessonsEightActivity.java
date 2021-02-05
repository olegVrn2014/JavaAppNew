package ru.livemotivation.javaapp.lessons_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

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

public class LessonsEightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_eight);

        ZoomInImageView less08_image01 = findViewById(R.id.less08_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_08%2Fless08_image01.png?alt=media&token=880611b4-7fb0-44fb-bbfa-dc17a9d0799a";
        Glide.with(getApplicationContext()).load(url).into(less08_image01);

        ZoomInImageView less08_image02 = findViewById(R.id.less08_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_08%2Fless08_image02.png?alt=media&token=5edbf70a-7336-411d-9e31-0347a3470699";
        Glide.with(getApplicationContext()).load(url2).into(less08_image02);

        ZoomInImageView less08_image03 = findViewById(R.id.less08_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_08%2Fless08_image03.png?alt=media&token=7c85c02e-ac31-4920-bfc5-1c16b2e3c9da";
        Glide.with(getApplicationContext()).load(url3).into(less08_image03);

        ZoomInImageView less08_image04 = findViewById(R.id.less08_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_08%2Fless08_image04.png?alt=media&token=e285295f-8da0-4f17-b846-e46d1e912037";
        Glide.with(getApplicationContext()).load(url4).into(less08_image04);

        ZoomInImageView less08_image05 = findViewById(R.id.less08_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_08%2Fless08_image05.png?alt=media&token=253639f0-9334-46cd-8772-6450091d0cac";
        Glide.with(getApplicationContext()).load(url5).into(less08_image05);

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
                        Intent intent = new Intent(LessonsEightActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsEightActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsEightActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsEightActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsEightActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(LessonsEightActivity.this,LessonsSevenActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(LessonsEightActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(LessonsEightActivity.this,LessonsNineActivity.class));

    }


}