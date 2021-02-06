package ru.livemotivation.javaapp.lessons_java;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
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

public class LessonsElevenActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_eleven);

        mediaPlayerBtn = MediaPlayer.create(this,R.raw.sounds);
        ZoomImage();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_main:
                        Intent intent = new Intent(LessonsElevenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsElevenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsElevenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsElevenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsElevenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }

    public void ZoomImage () {
        ZoomInImageView less11_image01 = findViewById(R.id.less11_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_11%2Fless11_image01.png?alt=media&token=68adfc5d-8a09-41da-90ae-8f49ed1047fa";
        Glide.with(getApplicationContext()).load(url).into(less11_image01);

        ZoomInImageView less11_image02 = findViewById(R.id.less11_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_11%2Fless11_image02.png?alt=media&token=260a3118-9e99-48be-9c6c-02aff25e13ad";
        Glide.with(getApplicationContext()).load(url2).into(less11_image02);

        ZoomInImageView less11_image03 = findViewById(R.id.less11_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_11%2Fless11_image03.png?alt=media&token=85f82b3a-ac01-4fac-92a3-847cd7b63082";
        Glide.with(getApplicationContext()).load(url3).into(less11_image03);

        ZoomInImageView less11_image04 = findViewById(R.id.less11_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_11%2Fless11_image04.png?alt=media&token=910b67df-b371-4cd3-a8e2-2d9f97c1641b";
        Glide.with(getApplicationContext()).load(url4).into(less11_image04);

        ZoomInImageView less11_image05 = findViewById(R.id.less11_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_11%2Fless11_image05.png?alt=media&token=c824e6b7-b021-40a7-8f8f-0109277adc03";
        Glide.with(getApplicationContext()).load(url5).into(less11_image05);

        ZoomInImageView less11_image06 = findViewById(R.id.less11_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_11%2Fless11_image06.png?alt=media&token=db4a3d05-e225-4d27-a05e-64f6a5d04fbf";
        Glide.with(getApplicationContext()).load(url6).into(less11_image06);

        ZoomInImageView less11_image07 = findViewById(R.id.less11_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_11%2Fless11_image07.png?alt=media&token=ad8237fe-30da-45a1-b729-b21464f5002e";
        Glide.with(getApplicationContext()).load(url7).into(less11_image07);

        ZoomInImageView less11_image08 = findViewById(R.id.less11_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_11%2Fless11_image08.png?alt=media&token=b2a42a58-3c06-484b-b5c5-01c2d282ee98";
        Glide.with(getApplicationContext()).load(url8).into(less11_image08);

        ZoomInImageView less11_image09 = findViewById(R.id.less11_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_11%2Fless11_image09.png?alt=media&token=547ef871-14db-4800-ac36-5b30f95eb727";
        Glide.with(getApplicationContext()).load(url9).into(less11_image09);

        ZoomInImageView less11_image10 = findViewById(R.id.less11_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_11%2Fless11_image10.png?alt=media&token=5e23abb1-1c96-4c4b-97e3-a2dd4f2c7ec1";
        Glide.with(getApplicationContext()).load(url10).into(less11_image10);
    }


    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Условные конструкции", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsElevenActivity.this,LessonsTenActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Основы JAVA", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsElevenActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Массивы", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsElevenActivity.this,LessonsTwelveActivity.class));

    }


}