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

public class LessonsFiveAriphmeticsActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_five_ariphmetics);

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
                        Intent intent = new Intent(LessonsFiveAriphmeticsActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsFiveAriphmeticsActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsFiveAriphmeticsActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsFiveAriphmeticsActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsFiveAriphmeticsActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }

    public void ZoomImage (){
        ZoomInImageView less05_image01 = findViewById(R.id.less05_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image01.png?alt=media&token=42a940ec-6985-4ba3-91f4-d73a03fdc070";
        Glide.with(getApplicationContext()).load(url).into(less05_image01);

        ZoomInImageView less05_image02 = findViewById(R.id.less05_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image02.png?alt=media&token=cadb1fbe-7860-40bb-820a-cc0fcfb68fe7";
        Glide.with(getApplicationContext()).load(url2).into(less05_image02);

        ZoomInImageView less05_image03 = findViewById(R.id.less05_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image03.png?alt=media&token=75fe8505-50c7-4e28-8447-ff1d56450600";
        Glide.with(getApplicationContext()).load(url3).into(less05_image03);

        ZoomInImageView less05_image04 = findViewById(R.id.less05_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image04.png?alt=media&token=d3c941e4-4347-45c5-8536-3493efdcc318";
        Glide.with(getApplicationContext()).load(url4).into(less05_image04);

        ZoomInImageView less05_image05 = findViewById(R.id.less05_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image05.png?alt=media&token=6bfa35f6-7a07-483f-b35d-5a4f3c4932b5";
        Glide.with(getApplicationContext()).load(url5).into(less05_image05);

        ZoomInImageView less05_image06 = findViewById(R.id.less05_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image06.png?alt=media&token=cf88934c-fb72-4c5d-8de9-bc0139156fc9";
        Glide.with(getApplicationContext()).load(url6).into(less05_image06);

        ZoomInImageView less05_image07 = findViewById(R.id.less05_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image07.png?alt=media&token=affc828d-bb39-4f44-aa70-f023abaa8d79";
        Glide.with(getApplicationContext()).load(url7).into(less05_image07);

        ZoomInImageView less05_image08 = findViewById(R.id.less05_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image08.png?alt=media&token=a7451d81-0e4b-4958-9164-92c7de0a42ab";
        Glide.with(getApplicationContext()).load(url8).into(less05_image08);

        ZoomInImageView less05_image09 = findViewById(R.id.less05_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image09.png?alt=media&token=dee7ca48-724f-42e9-9101-d44630001ccc";
        Glide.with(getApplicationContext()).load(url9).into(less05_image09);

        ZoomInImageView less05_image10 = findViewById(R.id.less05_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image10.png?alt=media&token=805135f1-076e-4535-a3d1-b59a562d5e6e";
        Glide.with(getApplicationContext()).load(url10).into(less05_image10);

        ZoomInImageView less05_image11 = findViewById(R.id.less05_image11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image11.png?alt=media&token=89e6c68d-9cae-4e94-8430-0d241ba6be5e";
        Glide.with(getApplicationContext()).load(url11).into(less05_image11);

        ZoomInImageView less05_image12 = findViewById(R.id.less05_image12);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image12.png?alt=media&token=bd72ada0-6a28-4257-8d7f-adc71fa05e99";
        Glide.with(getApplicationContext()).load(url12).into(less05_image12);

        ZoomInImageView less05_image13 = findViewById(R.id.less05_image13);
        String url13 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image13.png?alt=media&token=cb0526c0-4b1c-4302-b7de-44b3ee07ff85";
        Glide.with(getApplicationContext()).load(url13).into(less05_image13);

        ZoomInImageView less05_image14 = findViewById(R.id.less05_image14);
        String url14 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image14.png?alt=media&token=7d5a590a-e32e-4ca7-9221-dbe2344efb19";
        Glide.with(getApplicationContext()).load(url14).into(less05_image14);

        ZoomInImageView less05_image15 = findViewById(R.id.less05_image15);
        String url15 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_05%2Fless05_image15.png?alt=media&token=5cf822e2-a567-4407-9c54-61d98ec375ba";
        Glide.with(getApplicationContext()).load(url15).into(less05_image15);
    }


    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Консольный ввод", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsFiveAriphmeticsActivity.this,LessonsFourConsolActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Основы JAVA", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsFiveAriphmeticsActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Поразрядные операции", Toast.LENGTH_SHORT).show();
          startActivity(new Intent(LessonsFiveAriphmeticsActivity.this,LessonsSixActivity.class));

    }


}
