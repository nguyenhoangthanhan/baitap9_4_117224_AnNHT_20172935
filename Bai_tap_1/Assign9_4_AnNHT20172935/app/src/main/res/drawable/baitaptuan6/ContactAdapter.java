package com.andeptrai.baitaptuan6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    List<ContactModel> contacts;

    public ContactAdapter(List<ContactModel> contacts) {
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
    public View getView(final int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_m3, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.textView = view.findViewById(R.id.txt_m3);
            viewHolder.imageView = view.findViewById(R.id.img_avt);
            view.setTag(viewHolder);

        }
        else{
            viewHolder = (ViewHolder)view.getTag();
        }

        ContactModel contactModel = contacts.get(i);
        viewHolder.imageView.setImageResource(contactModel.getAvt());
        viewHolder.textView.setText(contactModel.getFullname());

        return view;
    }

    class ViewHolder{
        ImageView imageView;
        TextView textView;
        CheckBox checkBox;
    }

}
