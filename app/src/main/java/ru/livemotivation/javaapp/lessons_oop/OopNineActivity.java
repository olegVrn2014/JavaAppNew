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

public class OopNineActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_nine);

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
                        Intent intent = new Intent(OopNineActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopNineActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopNineActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopNineActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopNineActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }
    public void ZoomImage () {
        ZoomInImageView lessOop09_image01 = findViewById(R.id.lessOop09_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop09%2F1.png?alt=media&token=760e8292-8f81-48a8-8109-79e269b3345f";
        Glide.with(getApplicationContext()).load(url).into(lessOop09_image01);

        ZoomInImageView lessOop09_image02 = findViewById(R.id.lessOop09_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop09%2F2.png?alt=media&token=f47c8667-73c7-401c-a69e-3bd31589d911";
        Glide.with(getApplicationContext()).load(url2).into(lessOop09_image02);

        ZoomInImageView lessOop09_image03 = findViewById(R.id.lessOop09_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop09%2F3.png?alt=media&token=8d2a62ad-4be5-4a3f-96f2-f677eea7c6cc";
        Glide.with(getApplicationContext()).load(url3).into(lessOop09_image03);

        ZoomInImageView lessOop09_image04 = findViewById(R.id.lessOop09_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop09%2F4.png?alt=media&token=ab2d192f-e457-458c-ad74-3d72d5536d7d";
        Glide.with(getApplicationContext()).load(url4).into(lessOop09_image04);

        ZoomInImageView lessOop09_image05 = findViewById(R.id.lessOop09_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop09%2F5.png?alt=media&token=acaf18df-2e49-45f7-917f-c555a4e72e5d";
        Glide.with(getApplicationContext()).load(url5).into(lessOop09_image05);

        ZoomInImageView lessOop09_image06 = findViewById(R.id.lessOop09_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop09%2F6.png?alt=media&token=04d0f88c-77cd-4b72-8ad9-b7f5e73898c6";
        Glide.with(getApplicationContext()).load(url6).into(lessOop09_image06);

        ZoomInImageView lessOop09_image07 = findViewById(R.id.lessOop09_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop09%2F7.png?alt=media&token=e1aafd54-92a0-4323-af33-9eb6f32a998a";
        Glide.with(getApplicationContext()).load(url).into(lessOop09_image07);
    }


    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Абстрактные классы", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopNineActivity.this, OopEightActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Основы ООП", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopNineActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Интерфейсы", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopNineActivity.this, OopTenActivity.class));

    }


}