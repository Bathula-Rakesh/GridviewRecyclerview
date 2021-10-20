package com.example.gridviewrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<GridModel> gridModelList =new ArrayList<>();
    GridRecyclerAdapter gridRecyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view_1);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));


        gridRecyclerAdapter = new GridRecyclerAdapter(getApplicationContext(),gridModelList);

        recyclerView.setAdapter(gridRecyclerAdapter);

        loaddata();


    }

    private void loaddata() {


        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"Rakesh"));
        gridModelList.add(new GridModel(R.drawable.ic_launcher_background,"ramya"));
        return;
    }
}