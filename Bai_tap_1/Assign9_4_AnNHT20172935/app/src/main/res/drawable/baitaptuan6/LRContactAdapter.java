package com.andeptrai.baitaptuan6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LRContactAdapter extends BaseAdapter {

    List<ContactModel> contacts;

    public LRContactAdapter(List<ContactModel> contacts) {
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return contacts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemViewType(int position) {
        if (contacts.get(position).isLeft() == true){
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        if (getItemViewType(i) == 0)
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_m3, viewGroup, false);
        else{
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_right, viewGroup, false);
        }

        ImageView imageView = view.findViewById(R.id.img_avt);
        TextView textView = view.findViewById(R.id.txt_m3);

        ContactModel contactModel = contacts.get(i);
        imageView.setImageResource(contactModel.getAvt());
        textView.setText(contactModel.getFullname());


        return view;
    }

    class ViewHolder{
        ImageView imageView;
        TextView textView;
        CheckBox checkBox;
    }

}
