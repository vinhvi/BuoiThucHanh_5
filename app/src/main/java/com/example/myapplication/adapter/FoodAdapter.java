package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.model.Food;

import java.util.ArrayList;

public class FoodAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Food> arrayList;

    public FoodAdapter(Context ctx, int layoutItem, ArrayList<Food> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem, viewGroup, false);
        // Ánh sạ các textview và img
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvPrice = view .findViewById(R.id.texPrice);
        ImageView imgFood = view.findViewById(R.id.imgFood);
        //Gán giá trị từ mảng cho textview và img
        tvName.setText(arrayList.get(i).getName());
        tvPrice.setText(arrayList.get(i).getPrice());
        imgFood.setImageResource(arrayList.get(i).getId());
        return view;
    }
}
