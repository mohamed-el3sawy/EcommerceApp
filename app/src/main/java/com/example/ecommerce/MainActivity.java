package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.Objects;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setElevation(0);

        navigator(R.id.women_category, WomenActivity.class);
        navigator(R.id.men_category, MenActivity.class);
        navigator(R.id.kids_category, KidsActivity.class);
        navigator(R.id.baby_category, BabyActivity.class);
        navigator(R.id.sale_category, SaleActivity.class);
        navigator(R.id.shoe_category, ShoesActivity.class);
        navigator(R.id.sale_category_top, SaleActivity.class);

    }

    void navigator(int id, Class<?> des){
        View v = findViewById(id);
        v.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, des);
            startActivity(intent);
        });
    }

}