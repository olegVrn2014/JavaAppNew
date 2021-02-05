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
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import ru.livemotivation.javaapp.ActivityFourOther;
import ru.livemotivation.javaapp.ActivityOneLessonsTheme;
import ru.livemotivation.javaapp.ActivityThreeCollections;
import ru.livemotivation.javaapp.ActivityTwoOop;
import ru.livemotivation.javaapp.BottomNavigationViewHelper;
import ru.livemotivation.javaapp.MainActivity;
import ru.livemotivation.javaapp.R;

public class LessonsOneHelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_hello_world);

        ZoomInImageView less01_image01 = findViewById(R.id.less01_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_01%2Fless01_image.png?alt=media&token=dfc3495d-9876-45fc-b748-3968cec79f99";
        Glide.with(getApplicationContext()).load(url).into(less01_image01);

        ZoomInImageView less01_image02 = findViewById(R.id.less01_image02);
        String url02 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_01%2Fless01_image02.png?alt=media&token=cb8174f3-9945-42af-8fc7-53dea502153b";
        Glide.with(getApplicationContext()).load(url02).into(less01_image02);

        ZoomInImageView less01_image03 = findViewById(R.id.less01_image03);
        String url03 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_01%2Fless01_image03.png?alt=media&token=12a58c6d-2099-483f-b7d1-d4daad6ffc80";
        Glide.with(getApplicationContext()).load(url03).into(less01_image03);

        ZoomInImageView less01_image04 = findViewById(R.id.less01_image04);
        String url04 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_01%2Fless01_image04.png?alt=media&token=dcaa9e61-0c56-4d09-b006-60e081cc0b82";
        Glide.with(getApplicationContext()).load(url04).into(less01_image04);

        ZoomInImageView less01_image05 = findViewById(R.id.less01_image05);
        String url05 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_01%2Fless01_image05.png?alt=media&token=4fdcc0ea-61dd-4cce-a6c5-6994458ecdff";
        Glide.with(getApplicationContext()).load(url05).into(less01_image05);

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
                        Intent intent = new Intent(LessonsOneHelloWorldActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsOneHelloWorldActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsOneHelloWorldActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsOneHelloWorldActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsOneHelloWorldActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(LessonsOneHelloWorldActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(LessonsOneHelloWorldActivity.this, LessonsTwoVariablesActivity.class));

    }
}
