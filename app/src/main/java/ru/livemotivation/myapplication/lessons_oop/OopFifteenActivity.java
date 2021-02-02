package ru.livemotivation.myapplication.lessons_oop;

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

public class OopFifteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_fifteen);

        ZoomInImageView lessOop15_image01 = findViewById(R.id.lessOop15_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop15%2F1.png?alt=media&token=4b3ac234-5708-4a65-b5d0-51d522ceaef7";
        Glide.with(getApplicationContext()).load(url).into(lessOop15_image01);

        ZoomInImageView lessOop15_image02 = findViewById(R.id.lessOop15_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop15%2F2.png?alt=media&token=2c677797-b080-4127-95ae-67cd510fb6ac";
        Glide.with(getApplicationContext()).load(url2).into(lessOop15_image02);

        ZoomInImageView lessOop15_image03 = findViewById(R.id.lessOop15_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop15%2F3.png?alt=media&token=66fb8528-5780-4935-b278-d230286d136d";
        Glide.with(getApplicationContext()).load(url3).into(lessOop15_image03);

        ZoomInImageView lessOop15_image04 = findViewById(R.id.lessOop15_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop15%2F4.png?alt=media&token=6e3243f1-6ac8-4a51-a03d-868446e5a485";
        Glide.with(getApplicationContext()).load(url4).into(lessOop15_image04);

        ZoomInImageView lessOop15_image05 = findViewById(R.id.lessOop15_image05);
        String url5= "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop15%2F5.png?alt=media&token=c9e623d9-e4c5-4a3b-8812-14887e4b80e7";
        Glide.with(getApplicationContext()).load(url5).into(lessOop15_image05);

        ZoomInImageView lessOop15_image06 = findViewById(R.id.lessOop15_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop15%2F6.png?alt=media&token=ee4f6b40-e5e8-4d94-89f7-17a9946b8ed6";
        Glide.with(getApplicationContext()).load(url6).into(lessOop15_image06);

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
                        Intent intent = new Intent(OopFifteenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopFifteenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopFifteenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopFifteenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopFifteenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopFifteenActivity.this, OopFourteenActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopFifteenActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(OopFifteenActivity.this, OopSixteenActivity.class));

    }


}