package ru.livemotivation.javaapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ActivityOneLessonsTheme extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"1) Первая программа","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"2) Переменные","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"3) Типы данных","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"4) Консольный ввод","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"5) Арифметические операции","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"6) Поразрядные операции","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"7) Условные выражения","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"8) Операции присваивания","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"9) Преобразование базовых типов данных","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"10) Условные конструкции","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"11) Циклы","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"12) Массивы","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"13) Методы","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"14) Параметры методов","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"15) Оператор return","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"16) Перегрузка методов","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"17) Рекурсивные функции","Основы Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_basic_java,"18) Обработка исключений","Основы Java"));



        recyclerView = findViewById(R.id.recyclerViewJava);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapterJava(recyclerViewItems,this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);



        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_main:
                        Intent intent0 = new Intent(ActivityOneLessonsTheme.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_basics:

                        break;

                    case R.id.ic_oop:
                        Intent intent2 = new Intent(ActivityOneLessonsTheme.this, ActivityTwoOop.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_collections:
                        Intent intent3 = new Intent(ActivityOneLessonsTheme.this, ActivityThreeCollections.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_other:
                        Intent intent4 = new Intent(ActivityOneLessonsTheme.this, ActivityFourOther.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });
    }
    @Override
    public void onBackPressed() {
        try {
            moveTaskToBack(true); android.os.Process.killProcess(android.os.Process.myPid()); System.exit(1);
        }catch (Exception e){
          e.printStackTrace();
        }
        finish();
    }
}