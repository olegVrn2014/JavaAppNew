package ru.livemotivation.javaapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class ActivityFourOther extends AppCompatActivity{

    Button exit, estimate, aboutApp, share, feedback;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        feedback = findViewById(R.id.feedback);
        share = findViewById(R.id.share);
        aboutApp = findViewById(R.id.about_app);
        estimate = findViewById(R.id.estimate);
        exit = findViewById(R.id.exit);

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //тут изменить ссылку на свою
                    Toast.makeText(ActivityFourOther.this, "В разработке", Toast.LENGTH_SHORT).show();
                     startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.funplus.kingofavalon")));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                //тут изменить ссылку на свою
                String textToSend="Скачай приложение по изучению языка программирования Java)";
                String urlJavaApp = "https://play.google.com/store/apps/details?id=com.funplus.kingofavalon";
                intent.putExtra(Intent.EXTRA_TEXT, textToSend + " " + urlJavaApp);
                try
                {
                    startActivity(Intent.createChooser(intent, "Поделись с другом"));
                }
                catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_SHORT).show();
                }
            }
        });

        aboutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    openAboutApp();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        estimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(ActivityFourOther.this, "В разработке", Toast.LENGTH_SHORT).show();
                    //тут изменить ссылку на свою
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.funplus.kingofavalon")));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    openQuitDialog();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });



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

    private void openQuitDialog() {
        AlertDialog.Builder quitDialog = new AlertDialog.Builder(
                ActivityFourOther.this);
        quitDialog.setTitle("Вы уверены что хотите выйти?");

        quitDialog.setPositiveButton("Да!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                moveTaskToBack(true); android.os.Process.killProcess(android.os.Process.myPid()); System.exit(1);
                finish();
            }
        });

        quitDialog.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                Toast.makeText(ActivityFourOther.this, "Спасибо что остались с нами)", Toast.LENGTH_SHORT).show();
            }
        });

        quitDialog.show();
    }

    private void openAboutApp() {
        AlertDialog.Builder aboutAppDialog = new AlertDialog.Builder(
                ActivityFourOther.this);
        aboutAppDialog.setTitle(getResources().getText(R.string.versionNameApp)).setMessage(getResources().getText(R.string.main_description)).setCancelable(true).setIcon(R.drawable.icon);



        aboutAppDialog.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        aboutAppDialog.show();
    }

}