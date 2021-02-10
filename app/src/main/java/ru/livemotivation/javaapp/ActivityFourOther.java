package ru.livemotivation.javaapp;

import android.annotation.SuppressLint;
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


public class ActivityFourOther extends AppCompatActivity {

//    private RecyclerView recyclerView;
//    private RecyclerView.Adapter adapter;
//    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

//        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"Политика конфиденциальности","Настройки"));
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"Поделиться","Настройки"));
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"Оценить","Настройки"));
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"Оставить отзыв","Настройки"));
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"О приложении","Настройки"));
//        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"Выход","Настройки"));
//
//        recyclerView = findViewById(R.id.recyclerViewOther);
//        recyclerView.setHasFixedSize(true);
//        adapter = new RecyclerViewAdapterOther(recyclerViewItems,this);
//        layoutManager = new LinearLayoutManager(this);
//
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(layoutManager);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_main:
                        Intent intent0 = new Intent(ActivityFourOther.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_basics:
                        Intent intent1 = new Intent(ActivityFourOther.this, ActivityOneLessonsTheme.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_oop:
                        Intent intent2 = new Intent(ActivityFourOther.this, ActivityTwoOop.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_collections:
                        Intent intent3 = new Intent(ActivityFourOther.this, ActivityThreeCollections.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_other:
                        break;
                }

                return false;
            }
        });
    }

}