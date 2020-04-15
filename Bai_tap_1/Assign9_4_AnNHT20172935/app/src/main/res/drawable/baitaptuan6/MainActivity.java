package com.andeptrai.baitaptuan6;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ItemModel> itemModelList;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img_large);

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

        LinearLayout layoutList = findViewById(R.id.layout_list1);
        for(int i = 0; i < itemModelList.size(); i++){
            final View itemView = getLayoutInflater().inflate(R.layout.layout_item, null);
            itemView.setId(i);
            ImageView imageView = itemView.findViewById(R.id.image_view);
            TextView textView = itemView.findViewById(R.id.text_item);
            textView.setText(itemModelList.get(i).getLabel());
            imageView.setImageResource(itemModelList.get(i).getThumbnailResource());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int i = itemView.getId();
                    img.setImageResource(itemModelList.get(i).getImageId());
                }
            });

            layoutList.addView(itemView);
        }

    }
}
