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

public class BookThirtyOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_thirty_one);

        Button buttonBook31 = findViewById(R.id.buttonBook31);

        ZoomInImageView book31_image = findViewById(R.id.book31_image);
        final String urlImage = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/booksDownload%2FBook31%2Fbook_31.jpg?alt=media&token=207bbe13-c1e6-4472-98ea-d326de4fb16a";
        Glide.with(getApplicationContext()).load(urlImage).into(book31_image);

        final String urlBook = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/booksDownload%2FBook31%2FOsnovy_programmirovania_na_Java_Dlya_shkolnikov__i_ne_tolko.pdf?alt=media&token=74344d5a-9881-410a-a40f-dcba03664820";

        buttonBook31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(urlBook));
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(BookThirtyOne.this, "Неверная ссылка,обратитесь к разработчику", Toast.LENGTH_SHORT).show();
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
                        Intent intent = new Intent(BookThirtyOne.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(BookThirtyOne.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(BookThirtyOne.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(BookThirtyOne.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(BookThirtyOne.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }
}