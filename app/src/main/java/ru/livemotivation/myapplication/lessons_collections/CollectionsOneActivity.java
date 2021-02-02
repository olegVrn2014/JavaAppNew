package ru.livemotivation.myapplication.lessons_collections;

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
import ru.livemotivation.myapplication.lessons_exceptions.ExceptionsTwentyActivity;

public class CollectionsOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections_one);

        ZoomInImageView lessCollections01_image01 = findViewById(R.id.lessCollections01_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less01%2F1.png?alt=media&token=90366e7c-582f-42fa-b1aa-c0eba9585e41";
        Glide.with(getApplicationContext()).load(url).into(lessCollections01_image01);

        ZoomInImageView lessCollections01_image02 = findViewById(R.id.lessCollections01_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less01%2F2.png?alt=media&token=d6832661-5b7b-4c23-9e9e-10dda54db067";
        Glide.with(getApplicationContext()).load(url).into(lessCollections01_image02);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_main:
                        Intent intent = new Intent(CollectionsOneActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(CollectionsOneActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(CollectionsOneActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(CollectionsOneActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(CollectionsOneActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(CollectionsOneActivity.this, ExceptionsTwentyActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(CollectionsOneActivity.this, ActivityThreeCollections.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(CollectionsOneActivity.this, CollectionsTwoActivity.class));

    }


}