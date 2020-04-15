package com.andeptrai.baitaptuan6;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class ImageAdapter extends BaseAdapter {

    List<ItemModel> itemModelList;
    Context context;

    int itemWidth;

    public ImageAdapter(List<ItemModel> itemModelList, Context context) {
        this.itemModelList = itemModelList;
        this.context = context;

        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int spac = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, displayMetrics);

        itemWidth = (displayMetrics.widthPixels - spac) / 3;

    }

    public List<ItemModel> getItemModelList() {
        return itemModelList;
    }

    public void setItemModelList(List<ItemModel> itemModelList) {
        this.itemModelList = itemModelList;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return itemModelList.size();
    }

    @Override
    public Object getItem(int i) {
        return itemModelList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;

        if(view == null){
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(itemWidth, itemWidth));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        else{
            imageView = (ImageView) view;
        }

        imageView.setImageResource(itemModelList.get(i).getThumbnailResource());

        return imageView;
    }
}
