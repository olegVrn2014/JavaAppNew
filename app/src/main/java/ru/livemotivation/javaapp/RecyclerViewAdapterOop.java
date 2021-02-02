package ru.livemotivation.javaapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.livemotivation.javaapp.lessons_exceptions.ExceptionsEighteenActivity;
import ru.livemotivation.javaapp.lessons_exceptions.ExceptionsNineteenActivity;
import ru.livemotivation.javaapp.lessons_exceptions.ExceptionsTwentyActivity;
import ru.livemotivation.javaapp.lessons_oop.OopEightActivity;
import ru.livemotivation.javaapp.lessons_oop.OopElevenActivity;
import ru.livemotivation.javaapp.lessons_oop.OopFifteenActivity;
import ru.livemotivation.javaapp.lessons_oop.OopFiveActivity;
import ru.livemotivation.javaapp.lessons_oop.OopFourActivity;
import ru.livemotivation.javaapp.lessons_oop.OopFourteenActivity;
import ru.livemotivation.javaapp.lessons_oop.OopNineActivity;
import ru.livemotivation.javaapp.lessons_oop.OopOneActivity;
import ru.livemotivation.javaapp.lessons_oop.OopSevenActivity;
import ru.livemotivation.javaapp.lessons_oop.OopSeventeenActivity;
import ru.livemotivation.javaapp.lessons_oop.OopSixActivity;
import ru.livemotivation.javaapp.lessons_oop.OopSixteenActivity;
import ru.livemotivation.javaapp.lessons_oop.OopTenActivity;
import ru.livemotivation.javaapp.lessons_oop.OopThirteenActivity;
import ru.livemotivation.javaapp.lessons_oop.OopThreeActivity;
import ru.livemotivation.javaapp.lessons_oop.OopTwelveActivity;
import ru.livemotivation.javaapp.lessons_oop.OopTwoActivity;

public class RecyclerViewAdapterOop extends RecyclerView.Adapter<RecyclerViewAdapterOop.RececlerViewViewHolder> {
    private ArrayList<RecyclerViewItem> arrayList;
    Context context;


    class RececlerViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;

        public RececlerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }

        @Override
        public void onClick(View v) {
            switch (getAdapterPosition()){
                case 0:
                    Intent intent = new Intent(context, OopOneActivity.class);
                    context.startActivity(intent);
                    break;
                case 1:
                    Intent intent1 = new Intent(context, OopTwoActivity.class);
                    context.startActivity(intent1);
                    break;
                case 2:
                    Intent intent2 = new Intent(context, OopThreeActivity.class);
                    context.startActivity(intent2);
                    break;
                case 3:
                    Intent intent3 = new Intent(context, OopFourActivity.class);
                    context.startActivity(intent3);
                    break;
                case 4:
                    Intent intent4 = new Intent(context, OopFiveActivity.class);
                    context.startActivity(intent4);
                    break;
                case 5:
                    Intent intent5 = new Intent(context, OopSixActivity.class);
                    context.startActivity(intent5);
                    break;
                case 6:
                    Intent intent6 = new Intent(context, OopSevenActivity.class);
                    context.startActivity(intent6);
                    break;
                case 7:
                    Intent intent7 = new Intent(context, OopEightActivity.class);
                    context.startActivity(intent7);
                    break;
                case 8:
                    Intent intent8 = new Intent(context, OopNineActivity.class);
                    context.startActivity(intent8);
                    break;
                case 9:
                    Intent intent9 = new Intent(context, OopTenActivity.class);
                    context.startActivity(intent9);
                    break;
                case 10:
                    Intent intent10 = new Intent(context, OopElevenActivity.class);
                    context.startActivity(intent10);
                    break;
                case 11:
                    Intent intent11 = new Intent(context, OopTwelveActivity.class);
                    context.startActivity(intent11);
                    break;
                case 12:
                    Intent intent12 = new Intent(context, OopThirteenActivity.class);
                    context.startActivity(intent12);
                    break;
                case 13:
                    Intent intent13 = new Intent(context, OopFourteenActivity.class);
                    context.startActivity(intent13);
                    break;
                case 14:
                    Intent intent14 = new Intent(context, OopFifteenActivity.class);
                    context.startActivity(intent14);
                    break;
                case 15:
                    Intent intent15 = new Intent(context, OopSixteenActivity.class);
                    context.startActivity(intent15);
                    break;
                case 16:
                    Intent intent16 = new Intent(context, OopSeventeenActivity.class);
                    context.startActivity(intent16);
                    break;
                case 17:
                    Intent intent17 = new Intent(context, ExceptionsEighteenActivity.class);
                    context.startActivity(intent17);
                    break;
                case 18:
                    Intent intent18 = new Intent(context, ExceptionsNineteenActivity.class);
                    context.startActivity(intent18);
                    break;
                case 19:
                    Intent intent19 = new Intent(context, ExceptionsTwentyActivity.class);
                    context.startActivity(intent19);
                    break;
            }


        }
    }

    public RecyclerViewAdapterOop(ArrayList<RecyclerViewItem> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RececlerViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item, viewGroup, false);
        RececlerViewViewHolder receclerViewViewHolder = new RececlerViewViewHolder(view);
        return receclerViewViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RececlerViewViewHolder receclerViewViewHolder, int i) {
        RecyclerViewItem recyclerViewItem = arrayList.get(i);
        receclerViewViewHolder.imageView.setImageResource(recyclerViewItem.getImageResource());
        receclerViewViewHolder.textView1.setText(recyclerViewItem.getText1());
        receclerViewViewHolder.textView2.setText(recyclerViewItem.getText2());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
