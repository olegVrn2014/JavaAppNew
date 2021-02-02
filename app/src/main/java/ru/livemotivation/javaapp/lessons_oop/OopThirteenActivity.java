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

public class OopThirteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_thirteen);

        ZoomInImageView lessOop13_image01 = findViewById(R.id.lessOop13_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop13%2F1.png?alt=media&token=d8a9983f-05dc-475a-91ee-b81a1b6ceabc";
        Glide.with(getApplicationContext()).load(url).into(lessOop13_image01);

        ZoomInImageView lessOop13_image02 = findViewById(R.id.lessOop13_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop13%2F2.png?alt=media&token=9ce29524-cd54-49bc-b1c8-ac0b557b61d7";
        Glide.with(getApplicationContext()).load(url2).into(lessOop13_image02);

        ZoomInImageView lessOop13_image03 = findViewById(R.id.lessOop13_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop13%2F3.png?alt=media&token=e4e16b1a-0426-4793-b744-e021884eb177";
        Glide.with(getApplicationContext()).load(url3).into(lessOop13_image03);

        ZoomInImageView lessOop13_image04 = findViewById(R.id.lessOop13_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop13%2F4.png?alt=media&token=0360d20d-9084-4d76-bb81-54c64c8111b3";
        Glide.with(getApplicationContext()).load(url4).into(lessOop13_image04);

        ZoomInImageView lessOop13_image05 = findViewById(R.id.lessOop13_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop13%2F5.png?alt=media&token=658a7174-c8a7-4f8f-ae89-223c9a16d388";
        Glide.with(getApplicationContext()).load(url5).into(lessOop13_image05);

        ZoomInImageView lessOop13_image06 = findViewById(R.id.lessOop13_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop13%2F6.png?alt=media&token=a4f69a2b-de4e-4f64-aa50-d4a71c171caf";
        Glide.with(getApplicationContext()).load(url6).into(lessOop13_image06);




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
                        Intent intent = new Intent(OopThirteenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopThirteenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopThirteenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopThirteenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopThirteenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopThirteenActivity.this, OopTwelveActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopThirteenActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(OopThirteenActivity.this, OopFourteenActivity.class));

    }


}