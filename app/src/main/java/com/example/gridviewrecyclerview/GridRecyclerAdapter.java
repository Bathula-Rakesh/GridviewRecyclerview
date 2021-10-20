package com.example.gridviewrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class GridRecyclerAdapter extends RecyclerView.Adapter<GridRecyclerAdapter.viewholder> {
    Context context;
    List<GridModel> gridModelList=new ArrayList<>();

    public GridRecyclerAdapter(Context context, List<GridModel> gridModelList) {
        this.context = context;
        this.gridModelList = gridModelList;
    }

    @NonNull
    @Override
    public GridRecyclerAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customdesign,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridRecyclerAdapter.viewholder holder, int position) {
        holder.imageView.setImageResource(gridModelList.get(position).getImage());
        holder.textView.setText(gridModelList.get(position).getName());
    }

    @Override
    public int getItemCount() {
     return gridModelList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_iv);
            textView = itemView.findViewById(R.id.name_tv);
        }
    }
}
