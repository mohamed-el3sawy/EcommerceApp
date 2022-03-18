package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Objects;

public class SaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);
        Objects.requireNonNull(getSupportActionBar()).setElevation(0);

        GridView view = findViewById(R.id.grid_view);

        ProductAdapter adapter = new ProductAdapter(this);

        view.setAdapter(adapter);
    }
}