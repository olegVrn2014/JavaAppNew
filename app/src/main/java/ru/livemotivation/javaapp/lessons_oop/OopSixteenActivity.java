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

public class OopSixteenActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_sixteen);

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
                        Intent intent = new Intent(OopSixteenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopSixteenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopSixteenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopSixteenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopSixteenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }
    public void ZoomImage () {
        ZoomInImageView lessOop16_image01 = findViewById(R.id.lessOop16_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop16%2F1.png?alt=media&token=7751515e-7f62-457e-9a9f-dca854d9688e";
        Glide.with(getApplicationContext()).load(url).into(lessOop16_image01);

        ZoomInImageView lessOop16_image02 = findViewById(R.id.lessOop16_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop16%2F2.png?alt=media&token=b32865b3-2df3-451e-9a3c-161de007908a";
        Glide.with(getApplicationContext()).load(url2).into(lessOop16_image02);

        ZoomInImageView lessOop16_image03 = findViewById(R.id.lessOop16_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop16%2F3.png?alt=media&token=9b493f15-b954-46cb-82a8-435d798d8fb0";
        Glide.with(getApplicationContext()).load(url3).into(lessOop16_image03);

        ZoomInImageView lessOop16_image04 = findViewById(R.id.lessOop16_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop16%2F4.png?alt=media&token=531e3542-4931-4661-afb3-6906bc63a8f2";
        Glide.with(getApplicationContext()).load(url4).into(lessOop16_image04);

        ZoomInImageView lessOop16_image05 = findViewById(R.id.lessOop16_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop16%2F5.png?alt=media&token=849762d5-b1d4-4eff-a9f4-f504c34fca7a";
        Glide.with(getApplicationContext()).load(url5).into(lessOop16_image05);

        ZoomInImageView lessOop16_image06 = findViewById(R.id.lessOop16_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop16%2F6.png?alt=media&token=4ede57db-d246-450b-906d-843afdb0c07d";
        Glide.with(getApplicationContext()).load(url6).into(lessOop16_image06);

        ZoomInImageView lessOop16_image07 = findViewById(R.id.lessOop16_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop16%2F7.png?alt=media&token=5ada3169-0492-4c34-8b9a-d973214e919e";
        Glide.with(getApplicationContext()).load(url7).into(lessOop16_image07);

        ZoomInImageView lessOop16_image08 = findViewById(R.id.lessOop16_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop16%2F8.png?alt=media&token=13559de5-56bd-4eaf-aa07-da6b5b3e73ad";
        Glide.with(getApplicationContext()).load(url8).into(lessOop16_image08);

        ZoomInImageView lessOop16_image09 = findViewById(R.id.lessOop16_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop16%2F9.png?alt=media&token=1cd79394-3317-4c50-b4d1-e4c0d1046580";
        Glide.with(getApplicationContext()).load(url9).into(lessOop16_image09);

        ZoomInImageView lessOop16_image10 = findViewById(R.id.lessOop16_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop16%2F10.png?alt=media&token=b47c3af7-e2d4-45b0-8733-b8c4b9dfb786";
        Glide.with(getApplicationContext()).load(url10).into(lessOop16_image10);
    }


    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Ограничение обобщений", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopSixteenActivity.this, OopFifteenActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Основы ООП", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopSixteenActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Ссылочные типы и копирование объектов", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopSixteenActivity.this, OopSeventeenActivity.class));
    }


}