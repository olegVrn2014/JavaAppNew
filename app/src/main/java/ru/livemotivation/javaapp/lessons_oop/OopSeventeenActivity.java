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
import ru.livemotivation.javaapp.lessons_exceptions.ExceptionsEighteenActivity;

public class OopSeventeenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_seventeen);

        ZoomInImageView lessOop17_image01 = findViewById(R.id.lessOop17_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop17%2F1.png?alt=media&token=8b7a5ab0-e17f-4c38-8666-4e5bf4cfeef0";
        Glide.with(getApplicationContext()).load(url).into(lessOop17_image01);

        ZoomInImageView lessOop17_image02 = findViewById(R.id.lessOop17_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop17%2F2.png?alt=media&token=48c3eeb1-13db-4c16-b66a-c94cce406838";
        Glide.with(getApplicationContext()).load(url2).into(lessOop17_image02);

        ZoomInImageView lessOop17_image03 = findViewById(R.id.lessOop17_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop17%2F3.png?alt=media&token=5fb14782-002b-4b71-9e76-3ef94ef7bbfd";
        Glide.with(getApplicationContext()).load(url3).into(lessOop17_image03);

        ZoomInImageView lessOop17_image04 = findViewById(R.id.lessOop17_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop17%2F4.png?alt=media&token=708f9b15-e551-4972-a4a3-f3a9a28369d7";
        Glide.with(getApplicationContext()).load(url4).into(lessOop17_image04);

        ZoomInImageView lessOop17_image05 = findViewById(R.id.lessOop17_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop17%2F5.png?alt=media&token=d4dee376-7650-4726-bc79-fd29725ddaf7";
        Glide.with(getApplicationContext()).load(url5).into(lessOop17_image05);

        ZoomInImageView lessOop17_image06 = findViewById(R.id.lessOop17_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop17%2F6.png?alt=media&token=fbbd7d08-ad85-495e-a17a-e40ebeeb725c";
        Glide.with(getApplicationContext()).load(url6).into(lessOop17_image06);

        ZoomInImageView lessOop17_image07 = findViewById(R.id.lessOop17_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop17%2F7.png?alt=media&token=211ea552-9639-4949-856a-addc33b97085";
        Glide.with(getApplicationContext()).load(url7).into(lessOop17_image07);

        ZoomInImageView lessOop17_image08 = findViewById(R.id.lessOop17_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop17%2F8.png?alt=media&token=f49dadc5-7881-4cce-b81c-72c102f441fb";
        Glide.with(getApplicationContext()).load(url8).into(lessOop17_image08);

        ZoomInImageView lessOop17_image09 = findViewById(R.id.lessOop17_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop17%2F9.png?alt=media&token=830d1763-fd4e-451e-b724-88d1275c76e8";
        Glide.with(getApplicationContext()).load(url9).into(lessOop17_image09);




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
                        Intent intent = new Intent(OopSeventeenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopSeventeenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopSeventeenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopSeventeenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopSeventeenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopSeventeenActivity.this, OopSixteenActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopSeventeenActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(OopSeventeenActivity.this, ExceptionsEighteenActivity.class));

    }


}