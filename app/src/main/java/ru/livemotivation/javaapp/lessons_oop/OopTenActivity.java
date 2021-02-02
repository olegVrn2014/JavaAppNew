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

public class OopTenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_ten);

        ZoomInImageView lessOop10_image01 = findViewById(R.id.lessOop10_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F1.png?alt=media&token=f6002dea-c411-4841-a40d-9b80ba5202fd";
        Glide.with(getApplicationContext()).load(url).into(lessOop10_image01);

        ZoomInImageView lessOop10_image02 = findViewById(R.id.lessOop10_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F2.png?alt=media&token=02f98c2f-e36d-4d41-bea8-62ddeea1135a";
        Glide.with(getApplicationContext()).load(url2).into(lessOop10_image02);

        ZoomInImageView lessOop10_image03 = findViewById(R.id.lessOop10_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F3.png?alt=media&token=0ac132f8-a16c-4f31-96aa-df8c603b0e1f";
        Glide.with(getApplicationContext()).load(url3).into(lessOop10_image03);

        ZoomInImageView lessOop10_image04 = findViewById(R.id.lessOop10_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F4.png?alt=media&token=0e1efc9b-5e1c-46a7-9f17-ffa1b6393cc9";
        Glide.with(getApplicationContext()).load(url4).into(lessOop10_image04);

        ZoomInImageView lessOop10_image05 = findViewById(R.id.lessOop10_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F5.png?alt=media&token=53073ed2-2eae-41e2-a937-1db31933fa2e";
        Glide.with(getApplicationContext()).load(url5).into(lessOop10_image05);

        ZoomInImageView lessOop10_image06 = findViewById(R.id.lessOop10_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F6.png?alt=media&token=d5299667-a35c-4b37-9760-e79b7e1ec02a";
        Glide.with(getApplicationContext()).load(url6).into(lessOop10_image06);

        ZoomInImageView lessOop10_image07 = findViewById(R.id.lessOop10_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F7.png?alt=media&token=923fe25c-5584-44d0-a1c5-5a17fb0ed7d5";
        Glide.with(getApplicationContext()).load(url7).into(lessOop10_image07);

        ZoomInImageView lessOop10_image08 = findViewById(R.id.lessOop10_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F8.png?alt=media&token=f59588c4-dd3d-44a7-93d0-4529d03ea418";
        Glide.with(getApplicationContext()).load(url8).into(lessOop10_image08);

        ZoomInImageView lessOop10_image09 = findViewById(R.id.lessOop10_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F9.png?alt=media&token=977e456d-12a9-4ce6-aeff-d19af6ff44a0";
        Glide.with(getApplicationContext()).load(url9).into(lessOop10_image09);

        ZoomInImageView lessOop10_image10 = findViewById(R.id.lessOop10_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F10.png?alt=media&token=b5a5f5bc-e83e-4737-b296-82c35f3f1835";
        Glide.with(getApplicationContext()).load(url10).into(lessOop10_image10);

        ZoomInImageView lessOop10_image11 = findViewById(R.id.lessOop10_image11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F11.png?alt=media&token=3714e1b4-a1ba-49ea-931e-c34b09b31c80";
        Glide.with(getApplicationContext()).load(url11).into(lessOop10_image11);

        ZoomInImageView lessOop10_image12 = findViewById(R.id.lessOop10_image12);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F12.png?alt=media&token=236cb1a3-7e27-4aa6-9cf4-e4612da4f56b";
        Glide.with(getApplicationContext()).load(url12).into(lessOop10_image12);

        ZoomInImageView lessOop10_image13 = findViewById(R.id.lessOop10_image13);
        String url13 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F13.png?alt=media&token=f12393a2-5a6d-4bb9-b365-731e3b393757";
        Glide.with(getApplicationContext()).load(url13).into(lessOop10_image13);

        ZoomInImageView lessOop10_image14 = findViewById(R.id.lessOop10_image14);
        String url14 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F14.png?alt=media&token=aac98724-460d-4a9d-a009-bf0bd449f667";
        Glide.with(getApplicationContext()).load(url14).into(lessOop10_image14);

        ZoomInImageView lessOop10_image15 = findViewById(R.id.lessOop10_image15);
        String url15 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F15.png?alt=media&token=0461ae9e-0403-4e5a-8b4f-727c2b3cdea1";
        Glide.with(getApplicationContext()).load(url15).into(lessOop10_image15);

        ZoomInImageView lessOop10_image16 = findViewById(R.id.lessOop10_image16);
        String url16 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F16.png?alt=media&token=d0495030-9e2e-4bf6-986f-85ed4e732f7b";
        Glide.with(getApplicationContext()).load(url16).into(lessOop10_image16);

        ZoomInImageView lessOop10_image17 = findViewById(R.id.lessOop10_image17);
        String url17 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F17.png?alt=media&token=e5b8260a-96c4-4d9d-8c39-bb071cd00ed8";
        Glide.with(getApplicationContext()).load(url17).into(lessOop10_image17);

        ZoomInImageView lessOop10_image18 = findViewById(R.id.lessOop10_image18);
        String url18 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F18.png?alt=media&token=2b4b7b47-a932-4d32-a572-100d2bc0cc77";
        Glide.with(getApplicationContext()).load(url18).into(lessOop10_image18);

        ZoomInImageView lessOop10_image19 = findViewById(R.id.lessOop10_image19);
        String url19 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F19.png?alt=media&token=2c152e33-2fac-4284-b87e-b2c3f44aa7a5";
        Glide.with(getApplicationContext()).load(url19).into(lessOop10_image19);

        ZoomInImageView lessOop10_image20 = findViewById(R.id.lessOop10_image20);
        String url20 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/OOP%2FlessOop10%2F20.png?alt=media&token=1df92c24-9a7c-499b-9329-d52b8392b809";
        Glide.with(getApplicationContext()).load(url20).into(lessOop10_image20);



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
                        Intent intent = new Intent(OopTenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(OopTenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(OopTenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(OopTenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(OopTenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }


    public void onClickPrevious(View view) {
        startActivity(new Intent(OopTenActivity.this, OopNineActivity.class));
    }

    public void onClickLessons(View view) {
        startActivity(new Intent(OopTenActivity.this, ActivityTwoOop.class));
    }

    public void onClickNext(View view) {
        startActivity(new Intent(OopTenActivity.this, OopElevenActivity.class));

    }


}