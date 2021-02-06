package ru.livemotivation.javaapp.lessons_oop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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

public class OopSevenActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_seven);

        mediaPlayerBtn = MediaPlayer.create(this,R.raw.sounds);
        ZoomImage();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_main:
                        Intent intent = new Intent(OopSevenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopSevenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopSevenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopSevenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopSevenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }

    public void ZoomImage () {
        ZoomInImageView lessOop07_image01 = findViewById(R.id.lessOop07_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F1.png?alt=media&token=241f5bae-8f21-4185-a594-2aec863fb5f5";
        Glide.with(getApplicationContext()).load(url).into(lessOop07_image01);

        ZoomInImageView lessOop07_image02 = findViewById(R.id.lessOop07_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F2.png?alt=media&token=e4d96cf9-9ecc-4654-849d-b5f54c73c6f7";
        Glide.with(getApplicationContext()).load(url2).into(lessOop07_image02);

        ZoomInImageView lessOop07_image03 = findViewById(R.id.lessOop07_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F3.png?alt=media&token=3c8c1e08-c9a1-43c5-9e86-efb420f24cc5";
        Glide.with(getApplicationContext()).load(url3).into(lessOop07_image03);

        ZoomInImageView lessOop07_image04 = findViewById(R.id.lessOop07_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F4.png?alt=media&token=4d73fd6e-f658-4dde-a44b-49a51c8808e3";
        Glide.with(getApplicationContext()).load(url4).into(lessOop07_image04);

        ZoomInImageView lessOop07_image05 = findViewById(R.id.lessOop07_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F5.png?alt=media&token=d8e4ef2a-9560-4355-bdf3-d94ceeac6ca5";
        Glide.with(getApplicationContext()).load(url5).into(lessOop07_image05);

        ZoomInImageView lessOop07_image06 = findViewById(R.id.lessOop07_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F6.png?alt=media&token=24683343-ab9f-4b87-aff0-9f5f29c85c1c";
        Glide.with(getApplicationContext()).load(url6).into(lessOop07_image06);

        ZoomInImageView lessOop07_image07 = findViewById(R.id.lessOop07_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F7.png?alt=media&token=492e467b-535c-45d1-8559-193ac2e54b53";
        Glide.with(getApplicationContext()).load(url7).into(lessOop07_image07);

        ZoomInImageView lessOop07_image08 = findViewById(R.id.lessOop07_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F8.png?alt=media&token=f2d41f55-af47-4766-a99b-3fc4674ef4b7";
        Glide.with(getApplicationContext()).load(url8).into(lessOop07_image08);

        ZoomInImageView lessOop07_image09 = findViewById(R.id.lessOop07_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F9.png?alt=media&token=9663adbd-ea8b-4992-9de0-d00b77e9ef9d";
        Glide.with(getApplicationContext()).load(url9).into(lessOop07_image09);

        ZoomInImageView lessOop07_image10 = findViewById(R.id.lessOop07_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F10.png?alt=media&token=350ef884-79cc-4556-80b4-5309217258c7";
        Glide.with(getApplicationContext()).load(url10).into(lessOop07_image10);

        ZoomInImageView lessOop07_image11 = findViewById(R.id.lessOop07_image11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F11.png?alt=media&token=643468c5-26e1-4d9e-8d1f-4543c0d2c09a";
        Glide.with(getApplicationContext()).load(url11).into(lessOop07_image11);

        ZoomInImageView lessOop07_image12 = findViewById(R.id.lessOop07_image12);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop07%2F12.png?alt=media&token=212ff1be-0e34-4203-887e-70383d87c548";
        Glide.with(getApplicationContext()).load(url12).into(lessOop07_image12);
    }

    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Внутренние и вложенные классы", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopSevenActivity.this, OopSixActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Основы ООП", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopSevenActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Абстрактные классы", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopSevenActivity.this, OopEightActivity.class));
    }


}