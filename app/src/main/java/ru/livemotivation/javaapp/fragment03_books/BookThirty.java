package ru.livemotivation.javaapp.fragment03_books;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import ru.livemotivation.javaapp.ActivityFourOther;
import ru.livemotivation.javaapp.ActivityOneLessonsTheme;
import ru.livemotivation.javaapp.ActivityThreeCollections;
import ru.livemotivation.javaapp.ActivityTwoOop;
import ru.livemotivation.javaapp.BottomNavigationViewHelper;
import ru.livemotivation.javaapp.MainActivity;
import ru.livemotivation.javaapp.R;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.zolad.zoominimageview.ZoomInImageView;

public class BookThirty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_thirty);

        Button buttonBook30 = findViewById(R.id.buttonBook30);

        ZoomInImageView book30_image = findViewById(R.id.book30_image);
        final String urlImage = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/booksDownload%2FBook30%2Fbook_30.jpg?alt=media&token=b6f7f14d-41fe-4dd7-8743-8f0c344f7b7d";
        Glide.with(getApplicationContext()).load(urlImage).into(book30_image);

        final String urlBook = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/booksDownload%2FBook30%2FProhorenok_N_Osnovy_Java.pdf?alt=media&token=63277f71-6cfc-46f9-9edc-100ac63cd833";

        buttonBook30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(urlBook));
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(BookThirty.this, "Неверная ссылка,обратитесь к разработчику", Toast.LENGTH_SHORT).show();
                }
            }
        });


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_main:
                        Intent intent = new Intent(BookThirty.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(BookThirty.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(BookThirty.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(BookThirty.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(BookThirty.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }
}