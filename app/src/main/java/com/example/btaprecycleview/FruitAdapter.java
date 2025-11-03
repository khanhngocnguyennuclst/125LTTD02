package com.example.btaprecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {

    private Context context;
    private List<Fruit> fruitList;

    // Constructor
    public FruitAdapter(Context context, List<Fruit> fruitList) {
        this.context = context;
        this.fruitList = fruitList;
    }

    @NonNull
    @Override
    public FruitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Gắn layout cho từng item
        View view = LayoutInflater.from(context).inflate(R.layout.item_fruit, parent, false);
        return new FruitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FruitViewHolder holder, int position) {
        Fruit fruit = fruitList.get(position);
        holder.tvName.setText(fruit.getName());
        holder.tvDesc.setText(fruit.getDesc());
        holder.imgFruit.setImageResource(fruit.getImage());

        // Sự kiện click vào từng item
        holder.itemView.setOnClickListener(v ->
                Toast.makeText(context, fruit.getName(), Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    // Lớp ViewHolder
    public static class FruitViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFruit;
        TextView tvName, tvDesc;

        public FruitViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFruit = itemView.findViewById(R.id.imgFruit);
            tvName = itemView.findViewById(R.id.txtName);
            tvDesc = itemView.findViewById(R.id.txtDesc);
        }
    }
}
