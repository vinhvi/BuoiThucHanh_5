package com.example.myapplication.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.adapter.FoodAdapter;
import com.example.myapplication.model.Food;

import java.util.ArrayList;

public class Main extends AppCompatActivity {

    ListView lvFood;
    FoodAdapter fad;
    ArrayList<Food> arrayList;

    @Override
    protected void onCreate(Bundle saveIndstanceState) {
        super.onCreate(saveIndstanceState);
        setContentView(R.layout.activity_main);
        lvFood = findViewById(R.id.lvFood);

        arrayList = new ArrayList<>();
        arrayList.add(new Food(R.drawable.donut_yellow_1, "Tasty Dount", "$10.00"));
        arrayList.add(new Food(R.drawable.green_donut_1, "Pink Dount", "$20.00"));
        arrayList.add(new Food(R.drawable.tasty_donut_1, "Floating Dount", "$30.00"));
        arrayList.add(new Food(R.drawable.donut_red_1, "Floating Dount", "$30.00"));

        fad = new FoodAdapter(this, R.layout.list_item, arrayList);
        lvFood.setAdapter(fad);
    }
}
