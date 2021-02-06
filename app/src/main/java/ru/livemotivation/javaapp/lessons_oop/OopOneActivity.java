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
import ru.livemotivation.javaapp.lessons_java.LessonsEighteenActivity;

public class OopOneActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_one);

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
                        Intent intent = new Intent(OopOneActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopOneActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopOneActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopOneActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopOneActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }

    public void ZoomImage () {
        ZoomInImageView lessOop01_image01 = findViewById(R.id.lessOop01_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image01.png?alt=media&token=14d05338-036a-4fe0-8e19-c6fca659069e";
        Glide.with(getApplicationContext()).load(url).into(lessOop01_image01);

        ZoomInImageView lessOop01_image02 = findViewById(R.id.lessOop01_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image02.png?alt=media&token=869b5279-be97-4f98-9d22-e96e416ae048";
        Glide.with(getApplicationContext()).load(url2).into(lessOop01_image02);

        ZoomInImageView lessOop01_image03 = findViewById(R.id.lessOop01_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image03.png?alt=media&token=180d84b9-7ff0-4d13-b137-5ef8f8b37788";
        Glide.with(getApplicationContext()).load(url3).into(lessOop01_image03);

        ZoomInImageView lessOop01_image04 = findViewById(R.id.lessOop01_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image04.png?alt=media&token=ad732b3e-bec9-427e-9ed0-a3dc2543221b";
        Glide.with(getApplicationContext()).load(url4).into(lessOop01_image04);

        ZoomInImageView lessOop01_image05 = findViewById(R.id.lessOop01_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image05.png?alt=media&token=ecaad399-8fa7-4ea2-8499-9fbda8e50237";
        Glide.with(getApplicationContext()).load(url5).into(lessOop01_image05);

        ZoomInImageView lessOop01_image06 = findViewById(R.id.lessOop01_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image06.png?alt=media&token=83d25910-fa7b-4860-b3f8-910db6724bf3";
        Glide.with(getApplicationContext()).load(url6).into(lessOop01_image06);

        ZoomInImageView lessOop01_image07 = findViewById(R.id.lessOop01_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image07.png?alt=media&token=7d995f06-4e6a-4a2e-b812-c8de49501747";
        Glide.with(getApplicationContext()).load(url7).into(lessOop01_image07);

        ZoomInImageView lessOop01_image08 = findViewById(R.id.lessOop01_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image08.png?alt=media&token=bf5ac3dc-605a-4a52-9e68-734799f381cb";
        Glide.with(getApplicationContext()).load(url8).into(lessOop01_image08);

        ZoomInImageView lessOop01_image09 = findViewById(R.id.lessOop01_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image09.png?alt=media&token=f76ae754-57a7-442a-b4aa-1aa745ef99c4";
        Glide.with(getApplicationContext()).load(url9).into(lessOop01_image09);

        ZoomInImageView lessOop01_image10 = findViewById(R.id.lessOop01_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image10.png?alt=media&token=66e38046-20ad-4995-91a9-491adc9f7960";
        Glide.with(getApplicationContext()).load(url10).into(lessOop01_image10);

        ZoomInImageView lessOop01_image11 = findViewById(R.id.lessOop01_image11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image11.png?alt=media&token=04f73125-513d-414d-8920-24f4defe2515";
        Glide.with(getApplicationContext()).load(url11).into(lessOop01_image11);

        ZoomInImageView lessOop01_image12 = findViewById(R.id.lessOop01_image12);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image12.png?alt=media&token=8c308936-e365-40a0-a86a-39c86f707079";
        Glide.with(getApplicationContext()).load(url12).into(lessOop01_image12);

        ZoomInImageView lessOop01_image13 = findViewById(R.id.lessOop01_image13);
        String url13 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image13.png?alt=media&token=a3f78db3-0687-4f5e-92ad-5858739b5a32";
        Glide.with(getApplicationContext()).load(url13).into(lessOop01_image13);

        ZoomInImageView lessOop01_image14 = findViewById(R.id.lessOop01_image14);
        String url14 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image14.png?alt=media&token=4974af8f-bbc0-4327-8443-4c20cdbd4132";
        Glide.with(getApplicationContext()).load(url14).into(lessOop01_image14);

        ZoomInImageView lessOop01_image15 = findViewById(R.id.lessOop01_image15);
        String url15 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image15.png?alt=media&token=a0692496-401b-4b25-9171-57dfa234d3fa";
        Glide.with(getApplicationContext()).load(url15).into(lessOop01_image15);

        ZoomInImageView lessOop01_image16 = findViewById(R.id.lessOop01_image16);
        String url16 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop01%2FlessOOP1_image16.png?alt=media&token=59a72ea2-a7c1-4b4b-b12a-f4d4b7db333f";
        Glide.with(getApplicationContext()).load(url16).into(lessOop01_image16);
    }


    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Введение в обработку исключений", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopOneActivity.this, LessonsEighteenActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Основы ООП", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopOneActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Пакеты", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OopOneActivity.this, OopTwoActivity.class));

    }


}