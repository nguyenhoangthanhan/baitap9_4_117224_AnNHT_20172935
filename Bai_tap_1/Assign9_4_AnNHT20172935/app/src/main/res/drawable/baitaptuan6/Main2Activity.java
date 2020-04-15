package com.andeptrai.baitaptuan6;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    List<ItemModel> itemModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        itemModelList = new ArrayList<>();
        itemModelList.add(new ItemModel("Data 1", R.drawable.thumb1, R.drawable.wall1));
        itemModelList.add(new ItemModel("Data 2", R.drawable.thumb2, R.drawable.wall2));
        itemModelList.add(new ItemModel("Data 3", R.drawable.thumb3, R.drawable.wall3));
        itemModelList.add(new ItemModel("Data 4", R.drawable.thumb4, R.drawable.wall4));
        itemModelList.add(new ItemModel("Data 5", R.drawable.thumb5, R.drawable.wall5));
        itemModelList.add(new ItemModel("Data 6", R.drawable.thumb6, R.drawable.wall6));
        itemModelList.add(new ItemModel("Data 7", R.drawable.thumb7, R.drawable.wall7));
        itemModelList.add(new ItemModel("Data 8", R.drawable.thumb8, R.drawable.wall8));
        itemModelList.add(new ItemModel("Data 9", R.drawable.thumb9, R.drawable.wall9));
        itemModelList.add(new ItemModel("Data 10", R.drawable.thumb10, R.drawable.wall10));
        itemModelList.add(new ItemModel("Data 11", R.drawable.thumb11, R.drawable.wall11));
        itemModelList.add(new ItemModel("Data 12", R.drawable.thumb12, R.drawable.wall12));
        itemModelList.add(new ItemModel("Data 13", R.drawable.thumb13, R.drawable.wall13));
        itemModelList.add(new ItemModel("Data 14", R.drawable.thumb14, R.drawable.wall14));
        itemModelList.add(new ItemModel("Data 15", R.drawable.thumb15, R.drawable.wall15));
        itemModelList.add(new ItemModel("Data 16", R.drawable.thumb16, R.drawable.wall16));

        ImageAdapter adapter = new ImageAdapter(itemModelList, this);
        GridView gridView = findViewById(R.id.grid_view_m2);
        gridView.setAdapter(adapter);

    }
}
