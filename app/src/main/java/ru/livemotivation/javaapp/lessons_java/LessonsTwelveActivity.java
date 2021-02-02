package ru.livemotivation.javaapp.lessons_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import ru.livemotivation.javaapp.ActivityFourOther;
import ru.livemotivation.javaapp.ActivityOneLessonsTheme;
import ru.livemotivation.javaapp.ActivityThreeCollections;
import ru.livemotivation.javaapp.ActivityTwoOop;
import ru.livemotivation.javaapp.BottomNavigationViewHelper;
import ru.livemotivation.javaapp.MainActivity;
import ru.livemotivation.javaapp.R;

public class LessonsTwelveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_twelve);

        ImageView less12_image01 = findViewById(R.id.less12_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image01.png?alt=media&token=1cd2e9f3-8532-4252-9f10-02722828303b";
        Glide.with(getApplicationContext()).load(url).into(less12_image01);

        ImageView less12_image02 = findViewById(R.id.less12_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image02.png?alt=media&token=a1d09caa-2382-4b57-bb86-ec892fd7dbee";
        Glide.with(getApplicationContext()).load(url2).into(less12_image02);

        ImageView less12_image03 = findViewById(R.id.less12_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image03.png?alt=media&token=00d308bd-c6f7-4351-8a8e-23b847b0880b";
        Glide.with(getApplicationContext()).load(url3).into(less12_image03);

        ImageView less12_image04 = findViewById(R.id.less12_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image04.png?alt=media&token=ab074876-3d52-43e8-a4f2-921ee7ccdadb";
        Glide.with(getApplicationContext()).load(url4).into(less12_image04);

        ImageView less12_image05 = findViewById(R.id.less12_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image05.png?alt=media&token=f981c158-fb40-454d-8adf-d0e42c8f7b9e";
        Glide.with(getApplicationContext()).load(url5).into(less12_image05);

        ImageView less12_image06 = findViewById(R.id.less12_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image06.png?alt=media&token=5ddf778f-5932-4690-920a-16004d2cf5ad";
        Glide.with(getApplicationContext()).load(url6).into(less12_image06);

        ImageView less12_image07 = findViewById(R.id.less12_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image07.png?alt=media&token=42e7da57-46bf-44cc-94e5-36f1f1ae1313";
        Glide.with(getApplicationContext()).load(url7).into(less12_image07);

        ImageView less12_image08 = findViewById(R.id.less12_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image08.png?alt=media&token=0babc379-8d1f-4e8b-a81e-7d137fe5fa68";
        Glide.with(getApplicationContext()).load(url8).into(less12_image08);

        ImageView less12_image09 = findViewById(R.id.less12_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image09.png?alt=media&token=32a9c9a5-460d-4ae9-abbf-07d7ef569b86";
        Glide.with(getApplicationContext()).load(url9).into(less12_image09);

        ImageView less12_image10 = findViewById(R.id.less12_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image10.png?alt=media&token=2e23d65a-bb01-4050-9f48-305356c6e852";
        Glide.with(getApplicationContext()).load(url10).into(less12_image10);

        ImageView less12_image11 = findViewById(R.id.less12_image11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image11.png?alt=media&token=dd177f40-0e31-40c9-81e3-7f0c529bdcaa";
        Glide.with(getApplicationContext()).load(url11).into(less12_image11);

        ImageView less12_image12 = findViewById(R.id.less12_image12);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image12.png?alt=media&token=fa2a5568-8760-4607-946e-58fd713149e4";
        Glide.with(getApplicationContext()).load(url12).into(less12_image12);

        ImageView less12_image13 = findViewById(R.id.less12_image13);
        String url13 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image13.png?alt=media&token=168dcf02-dbd4-4d62-86db-f39d0de8e4e5";
        Glide.with(getApplicationContext()).load(url13).into(less12_image13);

        ImageView less12_image14 = findViewById(R.id.less12_image14);
        String url14 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image14.png?alt=media&token=3a19c335-caa2-4df7-9cb9-061383c06124";
        Glide.with(getApplicationContext()).load(url14).into(less12_image14);

        ImageView less12_image15 = findViewById(R.id.less12_image15);
        String url15 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image15.png?alt=media&token=1fcdc7d2-6c3e-48a6-bc1b-d537ff6fb723";
        Glide.with(getApplicationContext()).load(url15).into(less12_image15);

        ImageView less12_image16 = findViewById(R.id.less12_image16);
        String url16 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image16.png?alt=media&token=fc42315f-cca0-45cd-b2f8-dc787c4d9d56";
        Glide.with(getApplicationContext()).load(url16).into(less12_image16);

        ImageView less12_image17 = findViewById(R.id.less12_image17);
        String url17 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image17.png?alt=media&token=a74754f5-ddfb-473b-8df4-2e004b974c1c";
        Glide.with(getApplicationContext()).load(url7).into(less12_image17);

        ImageView less12_image18 = findViewById(R.id.less12_image18);
        String url18 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image18.png?alt=media&token=35d80ef1-f935-478b-8c38-71c73d891a87";
        Glide.with(getApplicationContext()).load(url18).into(less12_image18);

        ImageView less12_image19 = findViewById(R.id.less12_image19);
        String url19 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_12%2Fless12_image19.png?alt=media&token=609334ce-7387-49f6-98bc-3c06b1d58bbd";
        Glide.with(getApplicationContext()).load(url19).into(less12_image19);





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
                        Intent intent = new Intent(LessonsTwelveActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsTwelveActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsTwelveActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsTwelveActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsTwelveActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(LessonsTwelveActivity.this,LessonsElevenActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(LessonsTwelveActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(LessonsTwelveActivity.this,LessonsThirteenActivity.class));

    }


}