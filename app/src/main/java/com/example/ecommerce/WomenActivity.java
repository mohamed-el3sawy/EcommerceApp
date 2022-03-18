package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Objects;

public class WomenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);
        Objects.requireNonNull(getSupportActionBar()).setElevation(0);

        GridView gridView = findViewById(R.id.grid_view);

        ProductAdapter adapter = new ProductAdapter(Type.women, this);

        gridView.setAdapter(adapter);

    }
}