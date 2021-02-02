package ru.livemotivation.myapplication;

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
import ru.livemotivation.myapplication.lessons_java.LessonsEightActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsEighteenActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsElevenActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsFifteenActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsFiveAriphmeticsActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsFourConsolActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsFourteenActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsNineActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsOneHelloWorldActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsSevenActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsSeventeenActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsSixActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsSixteenActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsTenActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsThirteenActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsThreeTypeActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsTwelveActivity;
import ru.livemotivation.myapplication.lessons_java.LessonsTwoVariablesActivity;

public class RecyclerViewAdapterJava extends RecyclerView.Adapter<RecyclerViewAdapterJava.RececlerViewViewHolder> {
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
                    Intent intent = new Intent(context, LessonsOneHelloWorldActivity.class);
                    context.startActivity(intent);
                    break;
                case 1:
                    Intent intent1 = new Intent(context, LessonsTwoVariablesActivity.class);
                    context.startActivity(intent1);
                    break;
                case 2:
                    Intent intent2 = new Intent(context, LessonsThreeTypeActivity.class);
                    context.startActivity(intent2);
                    break;
                case 3:
                    Intent intent3 = new Intent(context, LessonsFourConsolActivity.class);
                    context.startActivity(intent3);
                    break;
                case 4:
                    Intent intent4 = new Intent(context, LessonsFiveAriphmeticsActivity.class);
                    context.startActivity(intent4);
                    break;
                case 5:
                    Intent intent5 = new Intent(context, LessonsSixActivity.class);
                    context.startActivity(intent5);
                    break;
                case 6:
                    Intent intent6 = new Intent(context, LessonsSevenActivity.class);
                    context.startActivity(intent6);
                    break;
                case 7:
                    Intent intent7 = new Intent(context, LessonsEightActivity.class);
                    context.startActivity(intent7);
                    break;
                case 8:
                    Intent intent8 = new Intent(context, LessonsNineActivity.class);
                    context.startActivity(intent8);
                    break;

                case 9:
                    Intent intent9 = new Intent(context, LessonsTenActivity.class);
                    context.startActivity(intent9);
                    break;
                case 10:
                    Intent intent10 = new Intent(context, LessonsElevenActivity.class);
                    context.startActivity(intent10);
                    break;
                case 11:
                    Intent intent11 = new Intent(context, LessonsTwelveActivity.class);
                    context.startActivity(intent11);
                    break;
                case 12:
                    Intent intent12 = new Intent(context, LessonsThirteenActivity.class);
                    context.startActivity(intent12);
                    break;
                case 13:
                    Intent intent13 = new Intent(context, LessonsFourteenActivity.class);
                    context.startActivity(intent13);
                    break;
                case 14:
                    Intent intent14 = new Intent(context, LessonsFifteenActivity.class);
                    context.startActivity(intent14);
                    break;
                case 15:
                    Intent intent15 = new Intent(context, LessonsSixteenActivity.class);
                    context.startActivity(intent15);
                    break;
                case 16:
                    Intent intent16 = new Intent(context, LessonsSeventeenActivity.class);
                    context.startActivity(intent16);
                    break;
                case 17:
                    Intent intent17 = new Intent(context, LessonsEighteenActivity.class);
                    context.startActivity(intent17);
                    break;
            }


        }
    }

    public RecyclerViewAdapterJava(ArrayList<RecyclerViewItem> arrayList, Context context) {
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
