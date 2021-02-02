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

public class OopThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_three);

        ZoomInImageView lessOop03_image01 = findViewById(R.id.lessOop03_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop03%2F%D0%91%D0%B5%D0%B7%20%D0%B8%D0%BC%D0%B5%D0%BD%D0%B8.png?alt=media&token=05a737aa-230e-4ca3-ac81-11bceac54d9e";
        Glide.with(getApplicationContext()).load(url).into(lessOop03_image01);

        ZoomInImageView lessOop03_image02 = findViewById(R.id.lessOop03_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop03%2F%D0%91%D0%B5%D0%B7%20%D0%B8%D0%BC%D0%B5%D0%BD%D0%B82.png?alt=media&token=cc31cbbf-3638-4f0b-9106-57bbc133851a";
        Glide.with(getApplicationContext()).load(url2).into(lessOop03_image02);



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
                        Intent intent = new Intent(OopThreeActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopThreeActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopThreeActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopThreeActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopThreeActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopThreeActivity.this, OopTwoActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopThreeActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
          startActivity(new Intent(OopThreeActivity.this, OopFourActivity.class));

    }


}