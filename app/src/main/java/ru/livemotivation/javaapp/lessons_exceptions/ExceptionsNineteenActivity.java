package ru.livemotivation.javaapp.lessons_exceptions;

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

public class ExceptionsNineteenActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exceptions_nineteen);

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
                        Intent intent = new Intent(ExceptionsNineteenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(ExceptionsNineteenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(ExceptionsNineteenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(ExceptionsNineteenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(ExceptionsNineteenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }
    public void ZoomImage (){
        ZoomInImageView lessException19_image01 = findViewById(R.id.lessException19_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/exceptions%2FlessOop19%2F1.png?alt=media&token=0c7f74c2-0d07-436a-88c5-e3775bfdbd39";
        Glide.with(getApplicationContext()).load(url).into(lessException19_image01);

        ZoomInImageView lessException19_image02 = findViewById(R.id.lessException19_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/exceptions%2FlessOop19%2F2.png?alt=media&token=c887d270-c063-45d8-8146-da5c4fee8770";
        Glide.with(getApplicationContext()).load(url2).into(lessException19_image02);

        ZoomInImageView lessException19_image03 = findViewById(R.id.lessException19_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/exceptions%2FlessOop19%2F3.png?alt=media&token=94f45e22-2525-4eac-8cb8-01a5f9874910";
        Glide.with(getApplicationContext()).load(url3).into(lessException19_image03);
    }


    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Обработка исключений", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(ExceptionsNineteenActivity.this, ExceptionsEighteenActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Основы ООП", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(ExceptionsNineteenActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Создание своих классов исключений", Toast.LENGTH_SHORT).show();
       startActivity(new Intent(ExceptionsNineteenActivity.this, ExceptionsTwentyActivity.class));
    }


}