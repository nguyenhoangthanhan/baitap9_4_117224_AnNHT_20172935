package com.andeptrai.assign9_4_annht20172935;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MailsAdapter extends BaseAdapter {

    List<Mails> mails;

    public MailsAdapter(List<Mails> mails) {
        this.mails = mails;
    }

    @Override
    public int getCount() {
        return mails.size();
    }

    @Override
    public Object getItem(int i) {
        return mails.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_bt1, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.txt_avt = view.findViewById(R.id.img_circle1);
            viewHolder.name = view.findViewById(R.id.txt_fullname);
            viewHolder.content = view.findViewById(R.id.txt_content);
            viewHolder.img_star = view.findViewById(R.id.img_star);
            view.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)view.getTag();
        }

        String avt = String.valueOf(mails.get(i).getName().charAt(0));
        viewHolder.txt_avt.setText(avt);
        if (avt.equals("A") || avt.equals("B") || avt.equals("C") || avt.equals("D") || avt.equals("E") || avt.equals("F")){
            viewHolder.txt_avt.setBackgroundResource(R.drawable.img_circle);
        }
        else if(avt.equals("G") || avt.equals("H") || avt.equals("I") || avt.equals("J") || avt.equals("K")){
            viewHolder.txt_avt.setBackgroundResource(R.drawable.img_circle2);
        }
        else if(avt.equals("L") || avt.equals("M") || avt.equals("N") || avt.equals("O") || avt.equals("P")){
            viewHolder.txt_avt.setBackgroundResource(R.drawable.img_circle3);
        }
        else if(avt.equals("Q") || avt.equals("R") || avt.equals("S") || avt.equals("T") || avt.equals("U")){
            viewHolder.txt_avt.setBackgroundResource(R.drawable.img_circle4);
        }
        else{
            viewHolder.txt_avt.setBackgroundResource(R.drawable.img_circle5);
        }

        viewHolder.name.setText(mails.get(i).getName());
        viewHolder.content.setText(mails.get(i).getContent());
        if (mails.get(i).isSelect_star()){
            viewHolder.img_star.setImageResource(R.drawable.ic_star_yellow_24dp);
        }
        else{
            viewHolder.img_star.setImageResource(R.drawable.ic_star_border_gray_24dp);
        }

        viewHolder.img_star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mails.get(i).setSelect_star(!mails.get(i).isSelect_star());
                notifyDataSetChanged();
            }
        });

        return view;
    }

    class ViewHolder{
        TextView txt_avt;
        TextView name;
        TextView content;
        ImageView img_star;
    }

}
