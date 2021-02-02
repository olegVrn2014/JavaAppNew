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
import ru.livemotivation.myapplication.lessons_collections.CollectionsEightActivity;
import ru.livemotivation.myapplication.lessons_collections.CollectionsFiveActivity;
import ru.livemotivation.myapplication.lessons_collections.CollectionsFourActivity;
import ru.livemotivation.myapplication.lessons_collections.CollectionsNineActivity;
import ru.livemotivation.myapplication.lessons_collections.CollectionsOneActivity;
import ru.livemotivation.myapplication.lessons_collections.CollectionsSevenActivity;
import ru.livemotivation.myapplication.lessons_collections.CollectionsSixActivity;
import ru.livemotivation.myapplication.lessons_collections.CollectionsTenActivity;
import ru.livemotivation.myapplication.lessons_collections.CollectionsThreeActivity;
import ru.livemotivation.myapplication.lessons_collections.CollectionsTwoActivity;

public class RecyclerViewAdapterCollections extends RecyclerView.Adapter<RecyclerViewAdapterCollections.RececlerViewViewHolder> {
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
                    Intent intent = new Intent(context, CollectionsOneActivity.class);
                    context.startActivity(intent);
                    break;
                case 1:
                    Intent intent1 = new Intent(context, CollectionsTwoActivity.class);
                    context.startActivity(intent1);
                    break;
                case 2:
                    Intent intent2 = new Intent(context, CollectionsThreeActivity.class);
                    context.startActivity(intent2);
                    break;
                case 3:
                    Intent intent3 = new Intent(context, CollectionsFourActivity.class);
                    context.startActivity(intent3);
                    break;
                case 4:
                    Intent intent4 = new Intent(context, CollectionsFiveActivity.class);
                    context.startActivity(intent4);
                    break;
                case 5:
                    Intent intent5 = new Intent(context, CollectionsSixActivity.class);
                    context.startActivity(intent5);
                    break;
                case 6:
                    Intent intent6 = new Intent(context, CollectionsSevenActivity.class);
                    context.startActivity(intent6);
                    break;
                case 7:
                    Intent intent7 = new Intent(context, CollectionsEightActivity.class);
                    context.startActivity(intent7);
                    break;
                case 8:
                    Intent intent8 = new Intent(context, CollectionsNineActivity.class);
                    context.startActivity(intent8);
                    break;
                case 9:
                    Intent intent9 = new Intent(context, CollectionsTenActivity.class);
                    context.startActivity(intent9);
                    break;
                default:
            }


        }
    }

    public RecyclerViewAdapterCollections(ArrayList<RecyclerViewItem> arrayList, Context context) {
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
