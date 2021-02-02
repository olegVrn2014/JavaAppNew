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

public class CollectionsTenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections_ten);

        ZoomInImageView lessCollections10_image01 = findViewById(R.id.lessCollections10_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less10%2F1.png?alt=media&token=16b90b4a-65f8-4ad9-91ff-c5e1fe0383e0";
        Glide.with(getApplicationContext()).load(url).into(lessCollections10_image01);

        ZoomInImageView lessCollections10_image02 = findViewById(R.id.lessCollections10_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less10%2F2.png?alt=media&token=10309627-1069-4792-a8e3-64757ab827d0";
        Glide.with(getApplicationContext()).load(url2).into(lessCollections10_image02);

        ZoomInImageView lessCollections10_image03 = findViewById(R.id.lessCollections10_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less10%2F3.png?alt=media&token=8f3ef5d7-279b-4282-b990-e8a5dcc4a0df";
        Glide.with(getApplicationContext()).load(url3).into(lessCollections10_image03);

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
                        Intent intent = new Intent(CollectionsTenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(CollectionsTenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(CollectionsTenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(CollectionsTenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(CollectionsTenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(CollectionsTenActivity.this, CollectionsNineActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(CollectionsTenActivity.this, ActivityThreeCollections.class));
    }

    public void onClickNext(View view) {
      //  startActivity(new Intent(CollectionsTenActivity.this, CollectionsTenActivity.class));

    }
}