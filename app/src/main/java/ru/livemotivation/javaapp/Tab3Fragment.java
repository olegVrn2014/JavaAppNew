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

        ZoomInImageView book13 = view.findViewById(R.id.book13);
        String url13 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_13.jpg?alt=media&token=391b9dc4-11db-445e-a9f1-a3c1496b6680";
        book13.setClipToOutline(true);
        Glide.with(getContext()).load(url13).into(book13);

        ZoomInImageView book14 = view.findViewById(R.id.book14);
        String url14 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_14.jpg?alt=media&token=30fb6594-8866-4c4c-885c-19a156764c55";
        book14.setClipToOutline(true);
        Glide.with(getContext()).load(url14).into(book14);

        ZoomInImageView book15 = view.findViewById(R.id.book15);
        String url15 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_15.jpg?alt=media&token=d6af7b9e-1d83-410f-b18e-143e0333cc51";
        book15.setClipToOutline(true);
        Glide.with(getContext()).load(url15).into(book15);

        ZoomInImageView book16 = view.findViewById(R.id.book16);
        String url16 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_16.jpg?alt=media&token=f292e9b7-c651-48fd-8450-e4221b4a27aa";
        book16.setClipToOutline(true);
        Glide.with(getContext()).load(url16).into(book16);

        ZoomInImageView book17 = view.findViewById(R.id.book17);
        String url17 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_17.jpg?alt=media&token=6b1d1504-4ec5-4967-a0bd-66ebe18c8dfe";
        book17.setClipToOutline(true);
        Glide.with(getContext()).load(url17).into(book17);

        ZoomInImageView book18 = view.findViewById(R.id.book18);
        String url18 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_18.jpg?alt=media&token=4c084bed-ecdd-4792-8b4d-bc7c59a44ac0";
        book18.setClipToOutline(true);
        Glide.with(getContext()).load(url18).into(book18);

        ZoomInImageView book19 = view.findViewById(R.id.book19);
        String url19 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_19.jpg?alt=media&token=f8f7220e-14be-4db6-82ac-239125fe09cf";
        book19.setClipToOutline(true);
        Glide.with(getContext()).load(url19).into(book19);

        ZoomInImageView book20 = view.findViewById(R.id.book20);
        String url20 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_20.jpg?alt=media&token=73d380db-54e1-4979-b359-3ebd5bf05b25";
        book20.setClipToOutline(true);
        Glide.with(getContext()).load(url20).into(book20);

        ZoomInImageView book21 = view.findViewById(R.id.book21);
        String url21 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_21.jpg?alt=media&token=e391a99f-e9c8-4dbd-8c76-0269f753132d";
        book21.setClipToOutline(true);
        Glide.with(getContext()).load(url21).into(book21);

        ZoomInImageView book22 = view.findViewById(R.id.book22);
        String url22 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_22.jpg?alt=media&token=ad75bcd4-c089-477b-b1ce-cb3f29347f49";
        book22.setClipToOutline(true);
        Glide.with(getContext()).load(url22).into(book22);

        ZoomInImageView book23 = view.findViewById(R.id.book23);
        String url23 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_23.jpg?alt=media&token=510eba04-31c5-43c8-ba22-6ee658a51054";
        book23.setClipToOutline(true);
        Glide.with(getContext()).load(url23).into(book23);

        ZoomInImageView book24 = view.findViewById(R.id.book24);
        String url24 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_24.jpg?alt=media&token=cf913d63-9eed-4e1b-881d-4e560bb77aa3";
        book24.setClipToOutline(true);
        Glide.with(getContext()).load(url24).into(book24);

        ZoomInImageView book25 = view.findViewById(R.id.book25);
        String url25 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_25.jpg?alt=media&token=bd0e76ec-9fd8-4be7-bc6e-cd682a5794b9";
        book25.setClipToOutline(true);
        Glide.with(getContext()).load(url25).into(book25);

        ZoomInImageView book26 = view.findViewById(R.id.book26);
        String url26 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_26.jpg?alt=media&token=5e55ca26-be8a-4c3c-bfe3-31409c8f3228";
        book26.setClipToOutline(true);
        Glide.with(getContext()).load(url26).into(book26);

        ZoomInImageView book27 = view.findViewById(R.id.book27);
        String url27 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_27.jpg?alt=media&token=03f68df4-4eab-4942-b068-5627770ca48f";
        book27.setClipToOutline(true);
        Glide.with(getContext()).load(url27).into(book27);

        ZoomInImageView book28 = view.findViewById(R.id.book28);
        String url28 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_28.jpg?alt=media&token=4f03eaed-702d-4764-808d-c65c5a5b199c";
        book28.setClipToOutline(true);
        Glide.with(getContext()).load(url28).into(book28);

        ZoomInImageView book29 = view.findViewById(R.id.book29);
        String url29 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_29.jpg?alt=media&token=53c5f3a2-638a-458d-a4b9-4ed1bc547d80";
        book29.setClipToOutline(true);
        Glide.with(getContext()).load(url29).into(book29);

        ZoomInImageView book30 = view.findViewById(R.id.book30);
        String url30 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_30.jpg?alt=media&token=e7cdc649-ed57-4cbd-a106-abf4fa81c177";
        book30.setClipToOutline(true);
        Glide.with(getContext()).load(url30).into(book30);

        ZoomInImageView book31 = view.findViewById(R.id.book31);
        String url31 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_31.jpg?alt=media&token=5247d968-064e-42b6-b44f-ca7def7c3f50";
        book31.setClipToOutline(true);
        Glide.with(getContext()).load(url31).into(book31);

        ZoomInImageView book32 = view.findViewById(R.id.book32);
        String url32 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_32.jpg?alt=media&token=133affbf-7b5f-4b73-98d9-7bea4e17f0e9";
        book32.setClipToOutline(true);
        Glide.with(getContext()).load(url32).into(book32);

        ZoomInImageView book33 = view.findViewById(R.id.book33);
        String url33 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_33.jpg?alt=media&token=00b7d165-4668-48b8-9901-0cc2fa5daa8c";
        book33.setClipToOutline(true);
        Glide.with(getContext()).load(url33).into(book33);

        ZoomInImageView book34 = view.findViewById(R.id.book34);
        String url34 = "https://firebasestorage.googleapis.com/v0/b/javaapp-497c0.appspot.com/o/books%2Fbook_34.jpg?alt=media&token=1dc336b3-16d2-41b8-bc1b-e505474f3d5f";
        book34.setClipToOutline(true);
        Glide.with(getContext()).load(url34).into(book34);

        ZoomInImageView book35 = view.findViewById(R.id.book35);
        book35.setVisibility(View.INVISIBLE);
        String url35 = "";
        book35.setClipToOutline(true);
        Glide.with(getContext()).load(url35).into(book35);

        ZoomInImageView book36 = view.findViewById(R.id.book36);
        book36.setVisibility(View.INVISIBLE);
        String url36 = "";
        book36.setClipToOutline(true);
        Glide.with(getContext()).load(url36).into(book36);
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

        ZoomInImageView book13 = view.findViewById(R.id.book13);
        book13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 13", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book14 = view.findViewById(R.id.book14);
        book14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 14", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book15 = view.findViewById(R.id.book15);
        book15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 15", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book16 = view.findViewById(R.id.book16);
        book16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 16", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book17 = view.findViewById(R.id.book17);
        book17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 17", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book18 = view.findViewById(R.id.book18);
        book18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 18", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book19 = view.findViewById(R.id.book19);
        book19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 19", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book20 = view.findViewById(R.id.book20);
        book20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 20", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book21 = view.findViewById(R.id.book21);
        book21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 21", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book22 = view.findViewById(R.id.book22);
        book22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 22", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book23 = view.findViewById(R.id.book23);
        book23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 23", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book24 = view.findViewById(R.id.book24);
        book24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 24", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book25 = view.findViewById(R.id.book25);
        book25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 25", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book26 = view.findViewById(R.id.book26);
        book26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 26", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book27 = view.findViewById(R.id.book27);
        book27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 27", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book28 = view.findViewById(R.id.book28);
        book28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 28", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book29 = view.findViewById(R.id.book29);
        book29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 29", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book30 = view.findViewById(R.id.book30);
        book30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 30", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book31 = view.findViewById(R.id.book31);
        book31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 31", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book32 = view.findViewById(R.id.book32);
        book32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 32", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book33 = view.findViewById(R.id.book33);
        book33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 33", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });

        ZoomInImageView book34 = view.findViewById(R.id.book34);
        book34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Книга 34", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(getContext(), OtherTwoActivity.class);
                //   startActivity(intent);
            }
        });
    }


}

