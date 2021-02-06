package ru.livemotivation.javaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class ActivityThreeCollections extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_collections_bottom,"1) Типы коллекций","Коллекции"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_collections_bottom,"2) Класс ArrayList и интерфейс List","Коллекции"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_collections_bottom,"3) Очереди и класс ArrayDeque","Коллекции"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_collections_bottom,"4) Класс LinkedList","Коллекции"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_collections_bottom,"5) Интерфейс Set и класс HashSet","Коллекции"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_collections_bottom,"6) SortedSet, NavigableSet, TreeSet","Коллекции"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_collections_bottom,"7) Интерфейсы Comparable и Comparator","Коллекции"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_collections_bottom,"8) Интерфейс Map и класс HashMap","Коллекции"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_collections_bottom,"9) Интерфейсы SortedMap и NavigableMap","Коллекции"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_collections_bottom,"10) Итераторы","Коллекции"));


        recyclerView = findViewById(R.id.recyclerViewCollections);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapterCollections(recyclerViewItems,this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);



        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_main:
                        Intent intent0 = new Intent(ActivityThreeCollections.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_basics:
                        Intent intent1 = new Intent(ActivityThreeCollections.this, ActivityOneLessonsTheme.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_oop:
                        Intent intent2 = new Intent(ActivityThreeCollections.this, ActivityTwoOop.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_collections:

                        break;

                    case R.id.ic_other:
                        Intent intent4 = new Intent(ActivityThreeCollections.this, ActivityFourOther.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });
    }
}

