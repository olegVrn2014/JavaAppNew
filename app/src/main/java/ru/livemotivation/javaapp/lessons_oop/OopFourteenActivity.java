package ru.livemotivation.javaapp.lessons_oop;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

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

public class OopFourteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_fourteen);

        ZoomInImageView lessOop14_image01 = findViewById(R.id.lessOop14_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F1.png?alt=media&token=12c6f49b-5517-4b9c-8183-6d471616fa79";
        Glide.with(getApplicationContext()).load(url).into(lessOop14_image01);

        ZoomInImageView lessOop14_image02 = findViewById(R.id.lessOop14_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F2.png?alt=media&token=169fd8b1-3861-48ca-8da9-ffff74898c96";
        Glide.with(getApplicationContext()).load(url2).into(lessOop14_image02);

        ZoomInImageView lessOop14_image03 = findViewById(R.id.lessOop14_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F3.png?alt=media&token=d708eef5-9787-4070-9772-77e3bd71f5b2";
        Glide.with(getApplicationContext()).load(url3).into(lessOop14_image03);

        ZoomInImageView lessOop14_image04 = findViewById(R.id.lessOop14_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F4.png?alt=media&token=be46bc3f-f1c5-4ff2-908b-5917afd1abf8";
        Glide.with(getApplicationContext()).load(url4).into(lessOop14_image04);

        ZoomInImageView lessOop14_image05 = findViewById(R.id.lessOop14_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F5.png?alt=media&token=0f38ec40-4d0c-452f-a91c-17ace7acf22a";
        Glide.with(getApplicationContext()).load(url5).into(lessOop14_image05);

        ZoomInImageView lessOop14_image06 = findViewById(R.id.lessOop14_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F6.png?alt=media&token=6ee43a68-ed72-410c-8944-6c141dc73c98";
        Glide.with(getApplicationContext()).load(url6).into(lessOop14_image06);

        ZoomInImageView lessOop14_image07 = findViewById(R.id.lessOop14_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F7.png?alt=media&token=cdd64be6-b87e-4794-afde-2568895368c0";
        Glide.with(getApplicationContext()).load(url7).into(lessOop14_image07);

        ZoomInImageView lessOop14_image08 = findViewById(R.id.lessOop14_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F8.png?alt=media&token=4164d5b9-d96c-4055-a903-8f16d12874e8";
        Glide.with(getApplicationContext()).load(url8).into(lessOop14_image08);

        ZoomInImageView lessOop14_image09 = findViewById(R.id.lessOop14_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F9.png?alt=media&token=3fa31882-31e3-4db2-b382-b3322dc5b080";
        Glide.with(getApplicationContext()).load(url9).into(lessOop14_image09);

        ZoomInImageView lessOop14_image10 = findViewById(R.id.lessOop14_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F10.png?alt=media&token=ebadcec8-847b-4730-9596-c79383d6849e";
        Glide.with(getApplicationContext()).load(url10).into(lessOop14_image10);

        ZoomInImageView lessOop14_image11 = findViewById(R.id.lessOop14_image11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F11.png?alt=media&token=bd819eda-024a-4f2a-ae5e-293029a765db";
        Glide.with(getApplicationContext()).load(url11).into(lessOop14_image11);

        ZoomInImageView lessOop14_image12 = findViewById(R.id.lessOop14_image12);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F12.png?alt=media&token=f2a9fce0-688c-44bb-aeeb-76ccde911529";
        Glide.with(getApplicationContext()).load(url12).into(lessOop14_image12);

        ZoomInImageView lessOop14_image13 = findViewById(R.id.lessOop14_image13);
        String url13 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F13.png?alt=media&token=2deaeee8-b8e0-4523-aeff-839462b5976b";
        Glide.with(getApplicationContext()).load(url13).into(lessOop14_image13);

        ZoomInImageView lessOop14_image14 = findViewById(R.id.lessOop14_image14);
        String url14 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop14%2F14.png?alt=media&token=06b0e65b-d45a-4c16-9e12-3aa8a99140e7";
        Glide.with(getApplicationContext()).load(url14).into(lessOop14_image14);
        
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_main:
                        Intent intent = new Intent(OopFourteenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopFourteenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopFourteenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopFourteenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopFourteenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopFourteenActivity.this, OopThirteenActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopFourteenActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(OopFourteenActivity.this, OopFifteenActivity.class));

    }


}