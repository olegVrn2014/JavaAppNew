package ru.livemotivation.javaapp.lessons_collections;

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

public class CollectionsSevenActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections_seven);

        mediaPlayerBtn = MediaPlayer.create(this,R.raw.sounds);
        ZoomImage();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_main:
                        Intent intent = new Intent(CollectionsSevenActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(CollectionsSevenActivity.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(CollectionsSevenActivity.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(CollectionsSevenActivity.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(CollectionsSevenActivity.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }

    public void ZoomImage (){
        ZoomInImageView lessCollections07_image01 = findViewById(R.id.lessCollections07_image01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F1.png?alt=media&token=fe76d176-cbc5-4e33-a23b-0cd76917ca9b";
        Glide.with(getApplicationContext()).load(url).into(lessCollections07_image01);

        ZoomInImageView lessCollections07_image02 = findViewById(R.id.lessCollections07_image02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F2.png?alt=media&token=e8d8c84b-5c04-49fe-9c5c-c553e9a1960a";
        Glide.with(getApplicationContext()).load(url2).into(lessCollections07_image02);

        ZoomInImageView lessCollections07_image03 = findViewById(R.id.lessCollections07_image03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F3.png?alt=media&token=0d904cc5-c466-4e1b-a7cb-b4149bf61ff8";
        Glide.with(getApplicationContext()).load(url3).into(lessCollections07_image03);

        ZoomInImageView lessCollections07_image04 = findViewById(R.id.lessCollections07_image04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F4.png?alt=media&token=c3595eee-8660-4762-847a-c4b37cd653a3";
        Glide.with(getApplicationContext()).load(url4).into(lessCollections07_image04);

        ZoomInImageView lessCollections07_image05 = findViewById(R.id.lessCollections07_image05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F5.png?alt=media&token=1aee1d60-a153-489f-bc5f-d87220755604";
        Glide.with(getApplicationContext()).load(url5).into(lessCollections07_image05);

        ZoomInImageView lessCollections07_image06 = findViewById(R.id.lessCollections07_image06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F6.png?alt=media&token=29150861-43f0-401d-b3de-0be118fda590";
        Glide.with(getApplicationContext()).load(url6).into(lessCollections07_image06);

        ZoomInImageView lessCollections07_image07 = findViewById(R.id.lessCollections07_image07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F7.png?alt=media&token=599dcedd-648d-4926-9a54-226ff9c5f45b";
        Glide.with(getApplicationContext()).load(url7).into(lessCollections07_image07);

        ZoomInImageView lessCollections07_image08 = findViewById(R.id.lessCollections07_image08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F8.png?alt=media&token=5e3adb88-0b2d-47e1-b28f-e295cffc5940";
        Glide.with(getApplicationContext()).load(url8).into(lessCollections07_image08);

        ZoomInImageView lessCollections07_image09 = findViewById(R.id.lessCollections07_image09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F9.png?alt=media&token=5abb78cd-d228-425f-84c0-9497fcf90ca3";
        Glide.with(getApplicationContext()).load(url9).into(lessCollections07_image09);

        ZoomInImageView lessCollections07_image10 = findViewById(R.id.lessCollections07_image10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F10.png?alt=media&token=87d4f4f7-48b8-4412-b59a-d493e428e865";
        Glide.with(getApplicationContext()).load(url10).into(lessCollections07_image10);

        ZoomInImageView lessCollections07_image11 = findViewById(R.id.lessCollections07_image11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F11.png?alt=media&token=b2164587-9dfe-4928-bfcf-2163a4767de5";
        Glide.with(getApplicationContext()).load(url11).into(lessCollections07_image11);

        ZoomInImageView lessCollections07_image12 = findViewById(R.id.lessCollections07_image12);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/collections%2FColl_less07%2F12.png?alt=media&token=1effc88f-6a4d-45ad-93a6-2bf4ede759ea";
        Glide.with(getApplicationContext()).load(url12).into(lessCollections07_image12);
    }


    public void onClickPrevious(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "SortedSet, NavigableSet, TreeSet", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(CollectionsSevenActivity.this, CollectionsSixActivity.class));
    }

    public void onClickLessons(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Коллекции", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(CollectionsSevenActivity.this, ActivityThreeCollections.class));
    }

    public void onClickNext(View view) {
        mediaPlayerBtn.start();
        Toast.makeText(this, "Интерфейс Map и класс HashMap", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(CollectionsSevenActivity.this, CollectionsEightActivity.class));
    }
}