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

public class OopFourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_four);

        ZoomInImageView lessOop04_image01 = findViewById(R.id.lessOop04_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop04%2FlessOOP4_image01.png?alt=media&token=089668fa-9e4d-4c30-8162-13c7e49029fd";
        Glide.with(getApplicationContext()).load(url).into(lessOop04_image01);

        ZoomInImageView lessOop04_image02 = findViewById(R.id.lessOop04_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop04%2FlessOOP4_image02.jpg?alt=media&token=1da7d4ce-de0a-437c-8e4e-aadf422bb865";
        Glide.with(getApplicationContext()).load(url2).into(lessOop04_image02);

        ZoomInImageView lessOop04_image03 = findViewById(R.id.lessOop04_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop04%2FlessOOP4_image03.png?alt=media&token=18277710-e345-4475-a92e-e5f46bbccb04";
        Glide.with(getApplicationContext()).load(url3).into(lessOop04_image03);

        ZoomInImageView lessOop04_image04 = findViewById(R.id.lessOop04_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop04%2FlessOOP4_image04.png?alt=media&token=32c0ec48-cdb5-45aa-b59f-1a5c48dc5245";
        Glide.with(getApplicationContext()).load(url4).into(lessOop04_image04);

        ZoomInImageView lessOop04_image05 = findViewById(R.id.lessOop04_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop04%2FlessOOP4_image05.png?alt=media&token=42af29c0-5cb7-4d5f-98c2-fb7e5eb8f193";
        Glide.with(getApplicationContext()).load(url5).into(lessOop04_image05);

        ZoomInImageView lessOop04_image06 = findViewById(R.id.lessOop04_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop04%2FlessOOP4_image06.png?alt=media&token=630b3c0f-ede4-4d82-bd3f-4481b72e6864";
        Glide.with(getApplicationContext()).load(url6).into(lessOop04_image06);

        ZoomInImageView lessOop04_image07 = findViewById(R.id.lessOop04_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop04%2FlessOOP4_image07.jpg?alt=media&token=740430fc-e236-43c7-9187-dde2211f1c64";
        Glide.with(getApplicationContext()).load(url7).into(lessOop04_image07);

        ZoomInImageView lessOop04_image08 = findViewById(R.id.lessOop04_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop04%2FlessOOP4_image08.png?alt=media&token=0e26cf3d-07d8-4788-a06e-8ce3d39710a9";
        Glide.with(getApplicationContext()).load(url8).into(lessOop04_image08);

        ZoomInImageView lessOop04_image09 = findViewById(R.id.lessOop04_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop04%2FlessOOP4_image09.jpg?alt=media&token=08af24f2-6a9e-458b-ac6c-c2070ca05c8f";
        Glide.with(getApplicationContext()).load(url9).into(lessOop04_image09);

        ZoomInImageView lessOop04_image10 = findViewById(R.id.lessOop04_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop04%2FlessOOP4_image10.png?alt=media&token=4d17015b-df3c-4538-a3ba-6a517e8934ca";
        Glide.with(getApplicationContext()).load(url10).into(lessOop04_image10);


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
                        Intent intent = new Intent(OopFourActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopFourActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopFourActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopFourActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopFourActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopFourActivity.this, OopThreeActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopFourActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(OopFourActivity.this, OopFiveActivity.class));

    }


}