package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Objects;

public class MenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);
        Objects.requireNonNull(getSupportActionBar()).setElevation(0);

        GridView view = findViewById(R.id.grid_view);

        ProductAdapter adapter = new ProductAdapter(Type.men, this);

        view.setAdapter(adapter);

    }
}