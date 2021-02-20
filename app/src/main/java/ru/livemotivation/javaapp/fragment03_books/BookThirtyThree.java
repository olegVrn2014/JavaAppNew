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

public class BookThirtyThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_thirty_three);

        Button buttonBook33 = findViewById(R.id.buttonBook33);

        ZoomInImageView book33_image = findViewById(R.id.book33_image);
        final String urlImage = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/booksDownload%2FBook33%2Fbook_33.jpg?alt=media&token=d0e981c5-1e49-479f-9a10-f4eb6ff117b7";
        Glide.with(getApplicationContext()).load(urlImage).into(book33_image);

        final String urlBook = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/booksDownload%2FBook33%2FDzhoshua_Blokh_-_Java_Effektivnoe_programmirovanie_3-e_izd.pdf?alt=media&token=e6fa5ed1-8a78-4f33-a1e4-dcb33e2896a9";

        buttonBook33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(urlBook));
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(BookThirtyThree.this, "Неверная ссылка,обратитесь к разработчику", Toast.LENGTH_SHORT).show();
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
                        Intent intent = new Intent(BookThirtyThree.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(BookThirtyThree.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(BookThirtyThree.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(BookThirtyThree.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(BookThirtyThree.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }
}