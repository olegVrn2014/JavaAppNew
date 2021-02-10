package ru.livemotivation.javaapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import ru.livemotivation.javaapp.lessons_other.OtherOneActivity;
import ru.livemotivation.javaapp.lessons_other.OtherTwoActivity;


public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment3_layout, container, false);

        ZoomImage(view);
        onClickImage(view);

        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void ZoomImage(View view){
        ZoomInImageView book01 = view.findViewById(R.id.book01);
        String url = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_01.jpg?alt=media&token=0800fccb-9add-466a-b858-40c4baeff3bb";
        book01.setClipToOutline(true);
        Glide.with(getContext()).load(url).into(book01);

        ZoomInImageView book02 = view.findViewById(R.id.book02);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_02.jpg?alt=media&token=52d811f3-5e75-4bb6-a207-d4eef7787cc2";
        book02.setClipToOutline(true);
        Glide.with(getContext()).load(url2).into(book02);

        ZoomInImageView book03 = view.findViewById(R.id.book03);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_03.jpg?alt=media&token=a0544089-1235-499c-80ab-5d33513b3301";
        book03.setClipToOutline(true);
        Glide.with(getContext()).load(url3).into(book03);

        ZoomInImageView book04 = view.findViewById(R.id.book04);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_04.jpg?alt=media&token=a45df40e-a4c6-472b-a832-7eec207f2208";
        book04.setClipToOutline(true);
        Glide.with(getContext()).load(url4).into(book04);

        ZoomInImageView book05 = view.findViewById(R.id.book05);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_05.jpg?alt=media&token=66655fbd-10f4-437e-88b8-5f528252d593";
        book05.setClipToOutline(true);
        Glide.with(getContext()).load(url5).into(book05);

        ZoomInImageView book06 = view.findViewById(R.id.book06);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_06.jpg?alt=media&token=67568055-e15a-41a4-a7aa-031417f75526";
        book06.setClipToOutline(true);
        Glide.with(getContext()).load(url6).into(book06);

        ZoomInImageView book07 = view.findViewById(R.id.book07);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_07.jpg?alt=media&token=c729ea19-6bdb-42dc-80c8-1d6f62b8faee";
        book07.setClipToOutline(true);
        Glide.with(getContext()).load(url7).into(book07);

        ZoomInImageView book08 = view.findViewById(R.id.book08);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_08.jpg?alt=media&token=1e49328e-504a-4610-9f48-9d9d4f814bcd";
        book08.setClipToOutline(true);
        Glide.with(getContext()).load(url8).into(book08);

        ZoomInImageView book09 = view.findViewById(R.id.book09);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_09.jpg?alt=media&token=5278c908-2c0b-4715-9742-a60c607a9bfa";
        book09.setClipToOutline(true);
        Glide.with(getContext()).load(url9).into(book09);

        ZoomInImageView book10 = view.findViewById(R.id.book10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_10.jpg?alt=media&token=6d0676a8-52c0-47cf-abe4-e7c19d3d977a";
        book10.setClipToOutline(true);
        Glide.with(getContext()).load(url10).into(book10);

        ZoomInImageView book11= view.findViewById(R.id.book11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_11.jpg?alt=media&token=8976d9f4-a193-49ac-bbc5-0440370fd0ad";
        book11.setClipToOutline(true);
        Glide.with(getContext()).load(url11).into(book11);

        ZoomInImageView book12 = view.findViewById(R.id.book12);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_12.jpg?alt=media&token=fd7d692c-e595-43dc-aefb-e604e21ef854";
        book12.setClipToOutline(true);
        Glide.with(getContext()).load(url12).into(book12);
    }

    public void onClickImage(View view){
        ZoomInImageView book01 = view.findViewById(R.id.book01);
        book01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), OtherOneActivity.class);
                Toast.makeText(getContext(), "Книга 1", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        ZoomInImageView book02 = view.findViewById(R.id.book02);
        book02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                Toast.makeText(getContext(), "Книга 2", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        ZoomInImageView book03 = view.findViewById(R.id.book03);
        book03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 3", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book04 = view.findViewById(R.id.book04);
        book04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 4", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book05 = view.findViewById(R.id.book05);
        book05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 5", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book06 = view.findViewById(R.id.book06);
        book06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 6", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book07 = view.findViewById(R.id.book07);
        book07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 7", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book08 = view.findViewById(R.id.book08);
        book08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 8", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book09 = view.findViewById(R.id.book09);
        book09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 9", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book10 = view.findViewById(R.id.book10);
        book10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 10", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book11 = view.findViewById(R.id.book11);
        book11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 11", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book12 = view.findViewById(R.id.book12);
        book12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 12", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

    }


}

