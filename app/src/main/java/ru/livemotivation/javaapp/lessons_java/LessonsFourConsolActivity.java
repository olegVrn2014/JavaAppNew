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

public class LessonsFourConsolActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_four_consol);

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
                        Intent intent = new Intent(LessonsFourConsolActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsFourConsolActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsFourConsolActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsFourConsolActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsFourConsolActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }

    public void ZoomImage () {
        ZoomInImageView less04_image01 = findViewById(R.id.less04_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image01.png?alt=media&token=b65e6033-77c5-4d34-b362-2b0b5b0ab392";
        Glide.with(getApplicationContext()).load(url).into(less04_image01);

        ZoomInImageView less04_image02 = findViewById(R.id.less04_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image02.png?alt=media&token=f22f8e34-a81d-44db-aa9f-fb08e21db0d9";
        Glide.with(getApplicationContext()).load(url2).into(less04_image02);

        ZoomInImageView less04_image03 = findViewById(R.id.less04_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image03.png?alt=media&token=11557cbd-840d-4aca-9e09-5fb2b694f69d";
        Glide.with(getApplicationContext()).load(url3).into(less04_image03);

        ZoomInImageView less04_image04 = findViewById(R.id.less04_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image04.png?alt=media&token=7147246c-6490-44e7-a14d-32905d6bf464";
        Glide.with(getApplicationContext()).load(url4).into(less04_image04);

        ZoomInImageView less04_image05 = findViewById(R.id.less04_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image05.png?alt=media&token=cd530f21-22fd-493e-954b-5376e8c63647";
        Glide.with(getApplicationContext()).load(url5).into(less04_image05);

        ZoomInImageView less04_image06 = findViewById(R.id.less04_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image06.png?alt=media&token=3e715a97-91a6-4cf7-b106-47539abd6237";
        Glide.with(getApplicationContext()).load(url6).into(less04_image06);

        ZoomInImageView less04_image07 = findViewById(R.id.less04_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image07.png?alt=media&token=2da69be4-faab-4f1a-bc2b-9f558e688e66";
        Glide.with(getApplicationContext()).load(url7).into(less04_image07);

        ZoomInImageView less04_image08 = findViewById(R.id.less04_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image08.png?alt=media&token=def27e0f-0817-46b5-a73b-caa5a043c912";
        Glide.with(getApplicationContext()).load(url8).into(less04_image08);

        ZoomInImageView less04_image09 = findViewById(R.id.less04_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image09.png?alt=media&token=4548804b-8d1d-4ca3-9de6-65dc783f56bd";
        Glide.with(getApplicationContext()).load(url9).into(less04_image09);

        ZoomInImageView less04_image10 = findViewById(R.id.less04_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image10.png?alt=media&token=c82b94ee-f879-42ea-b25c-f25bf26459e7";
        Glide.with(getApplicationContext()).load(url10).into(less04_image10);

        ZoomInImageView less04_image11 = findViewById(R.id.less04_image11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image11.png?alt=media&token=8048c5f1-40ee-4693-bcc0-06e08d5b44f5";
        Glide.with(getApplicationContext()).load(url11).into(less04_image11);

        ZoomInImageView less04_image12 = findViewById(R.id.less04_image12);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image12.png?alt=media&token=1e56acc5-8b5d-4456-a3ca-09f217813382";
        Glide.with(getApplicationContext()).load(url12).into(less04_image12);

        ZoomInImageView less04_image13 = findViewById(R.id.less04_image13);
        String url13 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image13.png?alt=media&token=65f459d8-c0b9-4102-9960-6614664e762c";
        Glide.with(getApplicationContext()).load(url13).into(less04_image13);

        ZoomInImageView less04_image14 = findViewById(R.id.less04_image14);
        String url14 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image14.png?alt=media&token=e9d7a9a0-30c4-453f-bfd2-c44cb055e778";
        Glide.with(getApplicationContext()).load(url14).into(less04_image14);

        ZoomInImageView less04_image15 = findViewById(R.id.less04_image15);
        String url15 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image15.png?alt=media&token=2b2f92c2-9447-4f26-acf3-0c99fdd23349";
        Glide.with(getApplicationContext()).load(url15).into(less04_image15);

        ZoomInImageView less04_image16 = findViewById(R.id.less04_image16);
        String url16 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/Less_04%2Fless04_image16.png?alt=media&token=26237f39-7324-48de-8e8b-c171d90b7378";
        Glide.with(getApplicationContext()).load(url16).into(less04_image16);
    }

    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Типы данных", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsFourConsolActivity.this, LessonsThreeTypeActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Основы JAVA", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsFourConsolActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Арифметические операции", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsFourConsolActivity.this, LessonsFiveAriphmeticsActivity.class));
    }
}