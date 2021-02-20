package ru.livemotivation.javaapp;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;


public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";

    private ImageView imageViewLauncher;

      @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
      @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_layout,container,false);

        imageViewLauncher = view.findViewById(R.id.image_view_launcher);
        imageViewLauncher.setClipToOutline(true);

        return view;
    }
}