package com.example.food_recepie_application.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_recepie_application.Models.ExtendedIngredient;
import com.example.food_recepie_application.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class IngrediantsAdapter extends RecyclerView.Adapter<IngrediantsViewHolder> {

    Context context;
    List<ExtendedIngredient> list;

    public IngrediantsAdapter(Context context, List<ExtendedIngredient> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public IngrediantsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new IngrediantsViewHolder(LayoutInflater.from(context).inflate(R.layout.list_meal_ingrediants,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull IngrediantsViewHolder holder, int position) {
        holder.textView_ingrediants_name.setSelected(true);
        holder.textView_ingrediants_quantity.setSelected(true);
        holder.textView_ingrediants_name.setText(list.get(position).name);
        holder.textView_ingrediants_quantity.setText(list.get(position).original);
        Picasso.get().load("https://spoonacular.com/cdn/ingredients_100x100/"+list.get(position).image).into(holder.imageView_ingrediants);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class IngrediantsViewHolder extends RecyclerView.ViewHolder {
    TextView textView_ingrediants_quantity,textView_ingrediants_name;
    ImageView imageView_ingrediants;
    public IngrediantsViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_ingrediants_quantity = itemView.findViewById(R.id.textView_ingrediants_quantity);
        textView_ingrediants_name = itemView.findViewById(R.id.textView_ingrediants_name);
        imageView_ingrediants = itemView.findViewById(R.id.imageView_ingrediants);
    }
}