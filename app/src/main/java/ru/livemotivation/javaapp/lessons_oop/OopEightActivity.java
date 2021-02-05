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

public class OopEightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_eight);

        ZoomInImageView lessOop08_image01 = findViewById(R.id.lessOop08_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop08%2F1.png?alt=media&token=c4850111-cdbd-435d-9fe0-db2d0a9990a7";
        Glide.with(getApplicationContext()).load(url).into(lessOop08_image01);

        ZoomInImageView lessOop08_image02 = findViewById(R.id.lessOop08_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop08%2F2.png?alt=media&token=f96a8053-2c1f-4c04-a843-f8c126736c0d";
        Glide.with(getApplicationContext()).load(url2).into(lessOop08_image02);

        ZoomInImageView lessOop08_image03 = findViewById(R.id.lessOop08_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop08%2F3.png?alt=media&token=3b3f5bee-d0e2-4d7b-91fb-cbf16b8354b4";
        Glide.with(getApplicationContext()).load(url3).into(lessOop08_image03);

        ZoomInImageView lessOop08_image04 = findViewById(R.id.lessOop08_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop08%2F4.png?alt=media&token=819906c5-b6d1-4e79-aefc-2599964598ff";
        Glide.with(getApplicationContext()).load(url4).into(lessOop08_image04);

        ZoomInImageView lessOop08_image05 = findViewById(R.id.lessOop08_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop08%2F5.png?alt=media&token=da5e9231-add8-4ae6-b0f9-b8f71ec7ee20";
        Glide.with(getApplicationContext()).load(url5).into(lessOop08_image05);





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
                        Intent intent = new Intent(OopEightActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopEightActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopEightActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopEightActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopEightActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopEightActivity.this, OopSevenActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopEightActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(OopEightActivity.this, OopNineActivity.class));

    }


}