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

public class LessonsNineActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_nine);

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
                        Intent intent = new Intent(LessonsNineActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(LessonsNineActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(LessonsNineActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(LessonsNineActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(LessonsNineActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }
                return false;
            }
        });
    }

    public void ZoomImage (){
        ZoomInImageView less09_image01 = findViewById(R.id.less09_image01 );
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image01.png?alt=media&token=7c0bd4cf-cdc5-4e5c-a389-44ba72cce4da";
        Glide.with(getApplicationContext()).load(url).into(less09_image01 );

        ZoomInImageView less09_image02 = findViewById(R.id.less09_image02 );
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image02.png?alt=media&token=67dceeab-af74-4d0b-bb42-2c59afb63114";
        Glide.with(getApplicationContext()).load(url2).into(less09_image02 );

        ZoomInImageView less09_image03 = findViewById(R.id.less09_image03 );
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image03.png?alt=media&token=ccf0c331-f246-4161-859e-6846f6bc6f12";
        Glide.with(getApplicationContext()).load(url3).into(less09_image03 );

        ZoomInImageView less09_image04 = findViewById(R.id.less09_image04 );
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image04.png?alt=media&token=4c79bd6e-e26f-463e-b649-016858bca6f5";
        Glide.with(getApplicationContext()).load(url4).into(less09_image04 );

        ZoomInImageView less09_image05 = findViewById(R.id.less09_image05 );
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image05.png?alt=media&token=1c83c219-67be-4a43-802d-46d594494efb";
        Glide.with(getApplicationContext()).load(url5).into(less09_image05 );

        ZoomInImageView less09_image06 = findViewById(R.id.less09_image06 );
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image06.png?alt=media&token=e451eae4-6aa4-408e-8528-edda7cc99ed4";
        Glide.with(getApplicationContext()).load(url6).into(less09_image06 );

        ZoomInImageView less09_image07 = findViewById(R.id.less09_image07 );
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image07.png?alt=media&token=13fad7b4-ac67-4743-9e06-e70df58311b4";
        Glide.with(getApplicationContext()).load(url7).into(less09_image07 );

        ZoomInImageView less09_image08 = findViewById(R.id.less09_image08 );
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image08.png?alt=media&token=69cae146-b1c1-4770-8e14-0e90896a3573";
        Glide.with(getApplicationContext()).load(url8).into(less09_image08 );

        ZoomInImageView less09_image09 = findViewById(R.id.less09_image09 );
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image09.png?alt=media&token=b791680e-2248-4e74-ae14-10ed39e5a8f2";
        Glide.with(getApplicationContext()).load(url9).into(less09_image09 );

        ZoomInImageView less09_image10 = findViewById(R.id.less09_image10 );
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image10.png?alt=media&token=14e397af-3e2f-42c7-82a3-dc6e205abeaf";
        Glide.with(getApplicationContext()).load(url10).into(less09_image10 );

        ZoomInImageView less09_image11 = findViewById(R.id.less09_image11 );
        String url11 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image11.png?alt=media&token=6ca0dd69-466b-4096-b3f5-fd83e936580e";
        Glide.with(getApplicationContext()).load(url11).into(less09_image11 );

        ZoomInImageView less09_image12 = findViewById(R.id.less09_image12 );
        String url12 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image12.png?alt=media&token=adec96c4-8173-4060-af10-6b99edde35c8";
        Glide.with(getApplicationContext()).load(url12).into(less09_image12 );

        ZoomInImageView less09_image13 = findViewById(R.id.less09_image13 );
        String url13 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image13.png?alt=media&token=1aa86d5e-24b0-43a6-85db-087db42cdee6";
        Glide.with(getApplicationContext()).load(url13).into(less09_image13 );

        ZoomInImageView less09_image14 = findViewById(R.id.less09_image14 );
        String url14 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/less_09%2Fless09_image14.png?alt=media&token=993caf94-2d1e-4e61-86af-18a9d732ca4b";
        Glide.with(getApplicationContext()).load(url14).into(less09_image14 );
    }


    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Операции присваивания", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsNineActivity.this,LessonsEightActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Основы JAVA", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsNineActivity.this, ActivityOneLessonsTheme.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Условные конструкции", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LessonsNineActivity.this,LessonsTenActivity.class));

    }


}