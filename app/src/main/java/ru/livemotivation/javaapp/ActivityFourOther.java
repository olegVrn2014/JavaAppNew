package ru.livemotivation.javaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class ActivityFourOther extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"1) Потоки ввода-вывода","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"2) Чтение и запись файлов","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"3) Закрытие потоков","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"4) Классы ByteArrayInputStream и ByteArrayOutputStream","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"5) Буферизованные потоки","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"6) Форматируемый ввод и вывод","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"7) Классы DataOutputStream и DataInputStream","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"8) Чтение и запись текстовых файлов","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"9) Буферизация символьных потоков","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"10) Сериализация","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"11) Класс File. Работа с файлами и каталогами","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"12) Работа с ZIP-архивами","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"13) Класс Console","Работа с файлами"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_library_books,"14) Введение в строки","Работа со строками"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_library_books,"15) Основные операции со строками","Работа со строками"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_library_books,"16) StringBuffer и StringBuilder","Работа со строками"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_library_books,"17) Регулярные выражения","Работа со строками"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline,"18) Введение в лямбда-выражения","Лямбда-выражения"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline,"19) Лямбды как параметры и результаты методов","Лямбда-выражения"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline,"20) Встроенные функциональные интерфейсы","Лямбда-выражения"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_view,"21) Класс Thread","Многопоточное программирование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_view,"22) Создание и выполнение потоков","Многопоточное программирование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_view,"23) Завершение и прерывание потока","Многопоточное программирование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_view,"24) Синхронизация потоков. Оператор synchronized","Многопоточное программирование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_view,"25) Методы wait и notify","Многопоточное программирование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_view,"26) Семафоры","Многопоточное программирование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_view,"27) Обмен между потоками. Класс Exchanger","Многопоточное программирование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_view,"28) Класс Phaser","Многопоточное программирование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_view,"29) Блокировки. ReentrantLock","Многопоточное программирование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_view,"30) Условия в блокировках","Многопоточное программирование"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"31) Введение в Stream API","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"32) Создание потока данных","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"33) Фильтрация, перебор элементов и отображение","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"34) Сортировка","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"35) Получение подпотока и объединение потоков","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"36) Методы skip и limit","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"37) Операции сведения","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"38) Метод reduce","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"39) Тип Optional","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"40) Метод collect","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"41) Группировка","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"42) Параллельные потоки","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_other_bottom,"43) Параллельные операции над массивами","Stream API"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline,"44) Создание модуля","Модульность"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline,"45) Зависимые модули","Модульность"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline,"46) Взаимодействие между модулями","Модульность"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_library_books,"47) Математические вычисления и класс Math","Доп классы"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_library_books,"48) Большие числа BigInteger и BigDecimal","Доп классы"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_library_books,"49) Работа с датами. LocalDate","Доп классы"));


        recyclerView = findViewById(R.id.recyclerViewOther);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapterOther(recyclerViewItems,this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);





        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
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