package com.example.myapplication.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
    ArrayList<Food> arrSearch;
    Button btnSearch;
    EditText foodSearch;

    private Button[] btn = new Button[3];
    private Button btn_Unfocus;
    private int[] btnID = {R.id.btnDonut, R.id.btnPinkD, R.id.btnFloating};

    @Override
    protected void onCreate(Bundle saveIndstanceState) {
        super.onCreate(saveIndstanceState);
        setContentView(R.layout.activity_main);
        lvFood = findViewById(R.id.lvFood);

        btnSearch = findViewById(R.id.btnSearch);
        foodSearch = findViewById(R.id.foodSearch);

        arrayList = new ArrayList<>();
        arrayList.add(new Food(R.drawable.donut_yellow_1, "Tasty Dount", "$10.00"));
        arrayList.add(new Food(R.drawable.green_donut_1, "Pink Dount", "$20.00"));
        arrayList.add(new Food(R.drawable.tasty_donut_1, "Floating Dount", "$30.00"));
        arrayList.add(new Food(R.drawable.donut_red_1, "Floating Dount", "$30.00"));

        fad = new FoodAdapter(this, R.layout.list_item, arrayList);
        lvFood.setAdapter(fad);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrSearch.clear();
                for (Food food : arrayList) {
                    String st = foodSearch.getText().toString();
                    if (food.getName().toString().equals(st)) {
                        arrSearch.add(food);
                    }
                }
                lvFood.setAdapter(new FoodAdapter(Main.this, R.layout.list_item, arrSearch));
                btn[0] = (Button) findViewById(btnID[0]);
                btn[0].setBackgroundColor(Color.rgb(3, 106, 150));
                btn[0].setOnClickListener(this);

                btn[1] = (Button) findViewById(btnID[1]);
                btn[1].setBackgroundColor(Color.rgb(207, 207, 207));
                btn[1].setOnClickListener((View.OnClickListener) Main.this);

                btn[2] = (Button) findViewById(btnID[1]);
                btn[2].setBackgroundColor(Color.rgb(207, 207, 207));
                btn[2].setOnClickListener((View.OnClickListener) Main.this);

                btn_Unfocus = btn[0];
            }
        });


    }
}
