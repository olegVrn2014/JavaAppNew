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


public class ActivityTwoOop extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"1) Классы и объекты","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"2) Пакеты","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"3) Модификаторы доступа и инкапсуляция","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"4) Статический модификатор","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"5) Объекты как параметры методов","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"6) Внутренние и вложенные классы","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"7) Наследование","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"8) Абстрактные классы","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"9) Иерархия наследования","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"10) Интерфейсы","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"11) Интерфейсы в механизме обратного вызова","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"12) Перечисления enum","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"13) Класс Object и его методы","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"14) Обобщения (Generics)","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"15) Ограничения обобщений","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"16) Наследование и обобщения","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"17) Ссылочные типы и копирование объектов","Объе́ктно-ориенти́рованное программи́рование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"18) Обработка исключений","Обработка исключений"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"19) Классы исключений","Обработка исключений"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_oop_bottom,"20) Создание своих классов исключений","Обработка исключений"));

        recyclerView = findViewById(R.id.recyclerViewOop);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapterOop(recyclerViewItems,this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);



        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_main:
                        Intent intent0 = new Intent(ActivityTwoOop.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_basics:
                        Intent intent1 = new Intent(ActivityTwoOop.this, ActivityOneLessonsTheme.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_oop:

                        break;

                    case R.id.ic_collections:
                        Intent intent3 = new Intent(ActivityTwoOop.this, ActivityThreeCollections.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_other:
                        Intent intent4 = new Intent(ActivityTwoOop.this, ActivityFourOther.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });
    }

}