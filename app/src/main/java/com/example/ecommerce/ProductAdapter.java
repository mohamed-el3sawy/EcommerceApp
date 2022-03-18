package com.example.ecommerce;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {

    ArrayList<Product> products;
    Type type;
    Context context;

    public ProductAdapter(Context context) {
        this.context = context;
    }

    public ProductAdapter(Type type, Context context) {
        this.type = type;
        this.context = context;
    }

    private ArrayList<Product> list(){
        products = new ArrayList<>();
        products.add(new Product("T-shirt", 89.00, R.drawable.img1, Type.men));
        products.add(new Product("Shirt", 106.99, R.drawable.img2, Type.men, 64.99));
        products.add(new Product("Dress", 499.62, R.drawable.img3, Type.men));
        products.add(new Product("Lambada", 70.99, R.drawable.img4, Type.men));
        products.add(new Product("Lambada", 70.99, R.drawable.img5, Type.women));
        products.add(new Product("Lambada", 70.99, R.drawable.img6, Type.women));
        products.add(new Product("Lambada", 70.99, R.drawable.img7, Type.women, 42.99));
        products.add(new Product("Lambada", 70.99, R.drawable.img8, Type.women));
        products.add(new Product("Shoes", 672.64, R.drawable.img9, Type.shoes));
        products.add(new Product("Sandal", 99.82, R.drawable.img10, Type.shoes, 70.89));

        return products;
    }

    private ArrayList<Product> listType(ArrayList<Product> products , Type type){

        ArrayList<Product> items = new ArrayList<>();

        for (int i =0; i<products.size(); i++){
            if (products.get(i).type == type || (products.get(i).isSale() &&  type == null)){
                items.add(products.get(i));
            }
        }
        return items;
    }

    @Override
    public int getCount() {
        return listType(list() ,type).size();
    }

    @Override
    public Product getItem(int i) {
        return listType(list() ,type).get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if (v == null){
            v = LayoutInflater.from(context).inflate(R.layout.product_layout, null , false);
        }

        Product product = getItem(i);

        ImageView image = v.findViewById(R.id.image);
        image.setImageResource(product.image);

        TextView name = v.findViewById(R.id.product);
        name.setText(product.name);

        TextView price = v.findViewById(R.id.price);
        TextView sale = v.findViewById(R.id.new_price);

        if (product.isSale()){
            sale.setText("USD " + product.sale);
            price.setTextSize(14);
            price.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        }
        price.setText("USD " + product.price);

//        RatingBar rate = v.findViewById(R.id.rate);
//
//        rate.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
//            @Override
//            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//                product.setRate(rating);
//            }
//        });

        ImageView fav = v.findViewById(R.id.favourite);
        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (product.isFavourite()) {
                    fav.setImageResource(R.drawable.ic_favorite);
                    product.setFavourite(false);
                }else {
                    fav.setImageResource(R.drawable.ic_red_favorite);
                    product.setFavourite(true);
                }
            }
        });


        return v;
    }
}
