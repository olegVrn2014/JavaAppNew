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

public class LessonsThreeTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_three_type);

        ZoomInImageView less03_image01 = findViewById(R.id.less03_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_03%2Fless03_image01.png?alt=media&token=1e78ed46-b7af-412d-98d1-71e64b9863f4";
        Glide.with(getApplicationContext()).load(url).into(less03_image01);

        ZoomInImageView less03_image02 = findViewById(R.id.less03_image02);
         String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_03%2Fless03_image02.png?alt=media&token=a1277c85-f544-409f-a242-455a4202437c";
        Glide.with(getApplicationContext()).load(url2).into(less03_image02);

        ZoomInImageView less03_image03 = findViewById(R.id.less03_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_03%2Fless03_image03.png?alt=media&token=75f11b41-fd30-4fe7-9041-50826e2506bd";
        Glide.with(getApplicationContext()).load(url3).into(less03_image03);

        ZoomInImageView less03_image04 = findViewById(R.id.less03_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_03%2Fless03_image04.png?alt=media&token=d3a8724d-a32c-4812-866c-f4ff2f711c38";
        Glide.with(getApplicationContext()).load(url4).into(less03_image04);

        ZoomInImageView less03_image05 = findViewById(R.id.less03_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_03%2Fless03_image05.png?alt=media&token=336b3d2c-b8f7-4e5a-b4d3-c29996618ad2";
        Glide.with(getApplicationContext()).load(url5).into(less03_image05);

        ZoomInImageView less03_image06 = findViewById(R.id.less03_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_03%2Fless03_image06.png?alt=media&token=25d6376a-e95d-4a69-ba11-927544d9c2c4";
        Glide.with(getApplicationContext()).load(url6).into(less03_image06);

        ZoomInImageView less03_image07 = findViewById(R.id.less03_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_03%2Fless03_image07.png?alt=media&token=cf3835f1-2747-4543-85eb-46ae5e77de7f";
        Glide.with(getApplicationContext()).load(url7).into(less03_image07);

        ZoomInImageView less03_image08 = findViewById(R.id.less03_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_03%2Fless03_image08.png?alt=media&token=4fcdf4e9-2f6e-40f9-a49d-4c159385164c";
        Glide.with(getApplicationContext()).load(url8).into(less03_image08);

        ZoomInImageView less03_image09 = findViewById(R.id.less03_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_03%2Fless03_image09.png?alt=media&token=25e47ec5-3539-4d2d-aace-8f37692cfdd2";
        Glide.with(getApplicationContext()).load(url9).into(less03_image09);

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
                        Intent intent = new Intent(LessonsThreeTypeActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsThreeTypeActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsThreeTypeActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsThreeTypeActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsThreeTypeActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }

    public void onClickPrevious(View view) {
        startActivity(new Intent(LessonsThreeTypeActivity.this,LessonsTwoVariablesActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(LessonsThreeTypeActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(LessonsThreeTypeActivity.this,LessonsFourConsolActivity.class));

    }


}


