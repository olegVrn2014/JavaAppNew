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

public class BookFiveteen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_fiveteen);

        Button buttonBook15 = findViewById(R.id.buttonBook15);

        ZoomInImageView book15_image = findViewById(R.id.book15_image);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/booksDownload%2FBook15%2Fbook_15.jpg?alt=media&token=8c783df7-42d6-44b6-aead-bb873a1b22c7";
        Glide.with(getApplicationContext()).load(url).into(book15_image);

        final String url1 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/booksDownload%2FBook15%2FJava_Code_Sbornik_iskhodnikov_2018.pdf?alt=media&token=cb79a68e-f6b6-4aa3-b799-47af047dcb44";

        buttonBook15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url1));
                    startActivity(intent);
                } catch (Exception E) {
                    Toast.makeText(BookFiveteen.this, "Неверная ссылка,обратитесь к разработчику", Toast.LENGTH_SHORT).show();
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
                        Intent intent = new Intent(BookFiveteen.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.ic_basics:
                        Intent intent2 = new Intent(BookFiveteen.this, ActivityOneLessonsTheme.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_oop:
                        Intent intent3 = new Intent(BookFiveteen.this, ActivityTwoOop.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_collections:
                        Intent intent4 = new Intent(BookFiveteen.this, ActivityThreeCollections.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_other:
                        Intent intent5 = new Intent(BookFiveteen.this, ActivityFourOther.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }
}