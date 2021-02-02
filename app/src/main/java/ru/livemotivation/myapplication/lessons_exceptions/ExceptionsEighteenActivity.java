package ru.livemotivation.myapplication.lessons_exceptions;

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
import ru.livemotivation.myapplication.lessons_oop.OopSeventeenActivity;

public class ExceptionsEighteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exceptions_eighteen);

        ZoomInImageView lessException18_image01 = findViewById(R.id.lessException18_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/exceptions%2FlessOop18%2F1.png?alt=media&token=83f88e4b-e7f6-4f25-8b1b-6c9c2ed92f23";
        Glide.with(getApplicationContext()).load(url).into(lessException18_image01);

        ZoomInImageView lessException18_image02 = findViewById(R.id.lessException18_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/exceptions%2FlessOop18%2F2.png?alt=media&token=f3fe5392-9134-490e-ab97-4407ac59c487";
        Glide.with(getApplicationContext()).load(url2).into(lessException18_image02);

        ZoomInImageView lessException18_image03 = findViewById(R.id.lessException18_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/exceptions%2FlessOop18%2F3.png?alt=media&token=74bf85c7-c36b-43af-a4ea-3be4f85d9ce7";
        Glide.with(getApplicationContext()).load(url3).into(lessException18_image03);


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
                        Intent intent = new Intent(ExceptionsEighteenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(ExceptionsEighteenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(ExceptionsEighteenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(ExceptionsEighteenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(ExceptionsEighteenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(ExceptionsEighteenActivity.this, OopSeventeenActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(ExceptionsEighteenActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(ExceptionsEighteenActivity.this, ExceptionsNineteenActivity.class));

    }


}