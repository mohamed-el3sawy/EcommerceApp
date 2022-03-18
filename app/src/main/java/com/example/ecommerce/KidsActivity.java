package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Objects;

public class KidsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);
        Objects.requireNonNull(getSupportActionBar()).setElevation(0);

        GridView view = findViewById(R.id.grid_view);

        ProductAdapter adapter = new ProductAdapter(Type.kids, this);

        view.setAdapter(adapter);

    }
}