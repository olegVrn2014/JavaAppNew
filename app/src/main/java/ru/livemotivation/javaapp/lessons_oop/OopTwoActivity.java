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

public class OopTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_two);

        ZoomInImageView lessOop02_image01 = findViewById(R.id.lessOop02_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image01.png?alt=media&token=f05641c6-ed10-452b-8a11-fa5f9229806c";
        Glide.with(getApplicationContext()).load(url).into(lessOop02_image01);

        ZoomInImageView lessOop02_image02_1 = findViewById(R.id.lessOop02_image02_1);
        String url2_1 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image02.1.png?alt=media&token=beacdb9a-044c-4c31-a793-3213b9e9fc4d";
        Glide.with(getApplicationContext()).load(url2_1).into(lessOop02_image02_1);

        ZoomInImageView lessOop02_image02_2 = findViewById(R.id.lessOop02_image02_2);
        String url2_2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image02.2.png?alt=media&token=8d39ab45-f298-47cd-bf78-261b1d4a25e3";
        Glide.with(getApplicationContext()).load(url2_2).into(lessOop02_image02_2);

        ZoomInImageView lessOop02_image03 = findViewById(R.id.lessOop02_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image03.png?alt=media&token=05b40d8e-5cb6-446a-adca-c96775ef9333";
        Glide.with(getApplicationContext()).load(url3).into(lessOop02_image03);

        ZoomInImageView lessOop02_image04 = findViewById(R.id.lessOop02_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image04.png?alt=media&token=446eceb3-fb63-4470-9250-9c4ed619b4d7";
        Glide.with(getApplicationContext()).load(url4).into(lessOop02_image04);

        ZoomInImageView lessOop02_image05 = findViewById(R.id.lessOop02_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image05.png?alt=media&token=ce26dc03-ce87-4d5e-8a1f-6e0151ce6baf";
        Glide.with(getApplicationContext()).load(url5).into(lessOop02_image05);

        ZoomInImageView lessOop02_image06 = findViewById(R.id.lessOop02_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image06.png?alt=media&token=c11435dd-b929-4dd5-bfd5-4e8845dea94c";
        Glide.with(getApplicationContext()).load(url6).into(lessOop02_image06);

        ZoomInImageView lessOop02_image07 = findViewById(R.id.lessOop02_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image07.png?alt=media&token=5e90d83a-3dc7-44be-9615-cd624ea080be";
        Glide.with(getApplicationContext()).load(url7).into(lessOop02_image07);

        ZoomInImageView lessOop02_image08 = findViewById(R.id.lessOop02_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image08.png?alt=media&token=b5b279a9-7e06-4ef3-a45f-bde976c50add";
        Glide.with(getApplicationContext()).load(url8).into(lessOop02_image08);

        ZoomInImageView lessOop02_image09 = findViewById(R.id.lessOop02_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image09.png?alt=media&token=6b097550-2586-4aac-be65-f73da9895f22";
        Glide.with(getApplicationContext()).load(url9).into(lessOop02_image09);

        ZoomInImageView lessOop02_image10 = findViewById(R.id.lessOop02_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image10.png?alt=media&token=b77385dd-6fd7-4d41-8141-92a72615d3a7";
        Glide.with(getApplicationContext()).load(url10).into(lessOop02_image10);

        ZoomInImageView lessOop02_image11 = findViewById(R.id.lessOop02_image11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop02%2FlessOOP2_image11.png?alt=media&token=069fea99-9d5e-4511-9139-eb354b7af7ac";
        Glide.with(getApplicationContext()).load(url11).into(lessOop02_image11);






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
                        Intent intent = new Intent(OopTwoActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopTwoActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopTwoActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopTwoActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopTwoActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopTwoActivity.this, OopOneActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopTwoActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
       startActivity(new Intent(OopTwoActivity.this, OopThreeActivity.class));

    }


}