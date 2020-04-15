package com.andeptrai.assign9_4_annht20172935;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BaiTap1Activity extends AppCompatActivity {

    ListView lst_view_bt1;
    List<Mails> mails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap1);

        lst_view_bt1 = findViewById(R.id.lst_view_bt1);
        mails = new ArrayList<>();
        mails.add(new Mails("Nguyen 1", "abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc  abc abc abc abc  abc abc abc abc "));
        mails.add(new Mails("Anh 1", "Anh abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc  abc abc abc abc  abc abc abc abc "));
        mails.add(new Mails("Hung 1", "Hung abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc  abc abc abc abc  abc abc abc abc "));
        mails.add(new Mails("Quan 1", "Quan abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc  abc abc abc abc  abc abc abc abc "));
        mails.add(new Mails("Tung 1", "Tung abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Phu 1", "Phu abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Huong 1", "Huong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Trong 1", "Trong abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("My 1", "My abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Nhung 1", "Nhung abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Binh 1", "Binh abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));
        mails.add(new Mails("Vu 1", "Vu abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc "));

        MailsAdapter adapter = new MailsAdapter(mails);
        lst_view_bt1.setAdapter(adapter);
    }
}
