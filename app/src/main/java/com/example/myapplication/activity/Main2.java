package com.example.myapplication.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.model.Food;

public class Main2 extends AppCompatActivity {
    private TextView name;
    private TextView price;
    private ImageView img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("2");

        name = findViewById(R.id.txtName);
        price = findViewById(R.id.txtPrice);
        img = findViewById(R.id.imgFood);


        if (getIntent().getExtras() != null) {
            Food food = (Food) getIntent().getExtras().get("focus_food");

            name.setText(food.getName());
            price.setText(food.getPrice());
            img.setImageResource(food.getId());
        }

    }
}
