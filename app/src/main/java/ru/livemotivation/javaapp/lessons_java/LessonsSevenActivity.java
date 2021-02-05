package ru.livemotivation.javaapp.lessons_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
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

public class LessonsSevenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_seven);

        ZoomInImageView less07_image01 = findViewById(R.id.less07_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_07%2Fless07_image01.png?alt=media&token=e169fc79-1624-4668-aac5-6e5135c28d47";
        Glide.with(getApplicationContext()).load(url).into(less07_image01);

        ZoomInImageView less07_image02 = findViewById(R.id.less07_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_07%2Fless07_image02.png?alt=media&token=166a29db-5736-4c7f-bd35-d0a839aebc87";
        Glide.with(getApplicationContext()).load(url2).into(less07_image02);

        ZoomInImageView less07_image03 = findViewById(R.id.less07_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_07%2Fless07_image03.png?alt=media&token=c81173f1-8a95-4510-9d04-95fd99b10ea2";
        Glide.with(getApplicationContext()).load(url3).into(less07_image03);

        ZoomInImageView less07_image04 = findViewById(R.id.less07_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_07%2Fless07_image04.png?alt=media&token=64a1e2b2-67df-4ed0-93f5-015772f7666c";
        Glide.with(getApplicationContext()).load(url4).into(less07_image04);

        ZoomInImageView less07_image05 = findViewById(R.id.less07_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_07%2Fless07_image05.png?alt=media&token=f093e22f-d267-493b-8fd5-e6a11de4eb18";
        Glide.with(getApplicationContext()).load(url5).into(less07_image05);

        ZoomInImageView less07_image06 = findViewById(R.id.less07_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_07%2Fless07_image06.png?alt=media&token=ec64f977-22e0-4126-8575-ac97ed867873";
        Glide.with(getApplicationContext()).load(url6).into(less07_image06);

        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)findViewById(R.id.less07_image07);
        imageView.setImage(ImageSource.resource(R.drawable.less07_image07));

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
                        Intent intent = new Intent(LessonsSevenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsSevenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsSevenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsSevenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsSevenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(LessonsSevenActivity.this,LessonsSixActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(LessonsSevenActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(LessonsSevenActivity.this,LessonsEightActivity.class));

    }


}