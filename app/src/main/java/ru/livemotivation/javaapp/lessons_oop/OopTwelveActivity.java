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

public class OopTwelveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_twelve);

        ZoomInImageView lessOop12_image01 = findViewById(R.id.lessOop12_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop12%2F1.png?alt=media&token=65dd7987-7ed3-421b-adb3-a26e1b7db0a8";
        Glide.with(getApplicationContext()).load(url).into(lessOop12_image01);

        ZoomInImageView lessOop12_image02 = findViewById(R.id.lessOop12_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop12%2F2.png?alt=media&token=8ce718f7-da0f-43fe-8be9-3c80eaf24caa";
        Glide.with(getApplicationContext()).load(url2).into(lessOop12_image02);

        ZoomInImageView lessOop12_image03 = findViewById(R.id.lessOop12_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop12%2F3.png?alt=media&token=c37d95d4-658e-44a8-ba18-d930ca019ffe";
        Glide.with(getApplicationContext()).load(url3).into(lessOop12_image03);

        ZoomInImageView lessOop12_image04 = findViewById(R.id.lessOop12_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop12%2F4.png?alt=media&token=df703699-552c-49e6-92ce-a4531eb0e751";
        Glide.with(getApplicationContext()).load(url4).into(lessOop12_image04);

        ZoomInImageView lessOop12_image05 = findViewById(R.id.lessOop12_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop12%2F5.png?alt=media&token=791a5514-5a4b-47b8-84b1-23a0e5d1b4c9";
        Glide.with(getApplicationContext()).load(url5).into(lessOop12_image05);

        ZoomInImageView lessOop12_image06 = findViewById(R.id.lessOop12_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop12%2F6.png?alt=media&token=3a7623ac-349b-4f69-a0a4-c15342d8d3a6";
        Glide.with(getApplicationContext()).load(url6).into(lessOop12_image06);

        ZoomInImageView lessOop12_image07 = findViewById(R.id.lessOop12_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop12%2F7.png?alt=media&token=030b538c-8f85-4762-85c7-eef912ddbfa8";
        Glide.with(getApplicationContext()).load(url7).into(lessOop12_image07);






        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_main:
                        Intent intent = new Intent(OopTwelveActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopTwelveActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopTwelveActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopTwelveActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopTwelveActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopTwelveActivity.this, OopElevenActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopTwelveActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(OopTwelveActivity.this, OopThirteenActivity.class));

    }


}