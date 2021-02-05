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

public class OopElevenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_eleven);

        ZoomInImageView lessOop11_image01 = findViewById(R.id.lessOop11_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2Flessoop11%2F1.png?alt=media&token=743f6dbb-7ea8-4b9e-8825-c41182451ca1";
        Glide.with(getApplicationContext()).load(url).into(lessOop11_image01);

        ZoomInImageView lessOop11_image02 = findViewById(R.id.lessOop11_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2Flessoop11%2F2.png?alt=media&token=1a92e1dd-d291-4f26-90a1-bad3617c0d90";
        Glide.with(getApplicationContext()).load(url2).into(lessOop11_image02);

        ZoomInImageView lessOop11_image03 = findViewById(R.id.lessOop11_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2Flessoop11%2F3.png?alt=media&token=54f752a0-b85e-47d2-b4a7-f914df9ea2e7";
        Glide.with(getApplicationContext()).load(url3).into(lessOop11_image03);

        ZoomInImageView lessOop11_image04 = findViewById(R.id.lessOop11_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2Flessoop11%2F4.png?alt=media&token=7821c489-2ca5-46a8-95eb-0ff2fe81435a";
        Glide.with(getApplicationContext()).load(url4).into(lessOop11_image04);

        ZoomInImageView lessOop11_image05 = findViewById(R.id.lessOop11_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2Flessoop11%2F5.png?alt=media&token=7aa5a97b-6c0d-4d64-92ab-70079eae43c4";
        Glide.with(getApplicationContext()).load(url5).into(lessOop11_image05);


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
                        Intent intent = new Intent(OopElevenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopElevenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopElevenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopElevenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopElevenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopElevenActivity.this, OopTenActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopElevenActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(OopElevenActivity.this, OopTwelveActivity.class));

    }


}