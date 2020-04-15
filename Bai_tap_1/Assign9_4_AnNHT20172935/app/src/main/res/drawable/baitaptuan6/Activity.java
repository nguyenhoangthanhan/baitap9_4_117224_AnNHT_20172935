package com.andeptrai.baitaptuan6;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Activity extends AppCompatActivity {

    List<ContactModel> contactModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        contactModelList = new ArrayList<>();
        contactModelList.add(new ContactModel("Name 1", R.drawable.thumb1, true));
        contactModelList.add(new ContactModel("Name 2", R.drawable.thumb2,false));
        contactModelList.add(new ContactModel("Name 3", R.drawable.thumb3, true));
        contactModelList.add(new ContactModel("Name 4", R.drawable.thumb4,false));
        contactModelList.add(new ContactModel("Name 5", R.drawable.thumb5, true));
        contactModelList.add(new ContactModel("Name 6", R.drawable.thumb6, true));
        contactModelList.add(new ContactModel("Name 7", R.drawable.thumb7,false));
        contactModelList.add(new ContactModel("Name 8", R.drawable.thumb8,false));
        contactModelList.add(new ContactModel("Name 9", R.drawable.thumb9,false));

        LRContactAdapter adapter = new LRContactAdapter(contactModelList);
        ListView listView = findViewById(R.id.list_view_m3);
        listView.setAdapter(adapter);
    }


}
