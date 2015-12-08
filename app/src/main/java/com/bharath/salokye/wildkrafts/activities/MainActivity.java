package com.bharath.salokye.wildkrafts.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bharath.salokye.wildkrafts.R;
import com.bharath.salokye.wildkrafts.adapters.CategoryAdapter;
import com.bharath.salokye.wildkrafts.models.Category;

import java.util.ArrayList;


/**
 * Created by srn on 12/4/15.
 *
 */
public class MainActivity  extends AppCompatActivity{
    ListView categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar ab = getSupportActionBar();

        ab.setElevation(0);
        ab.hide();



        categoryList = (ListView)findViewById(R.id.category_list);

        ArrayList<Category> categories = new ArrayList<>();

        categories.add(
                new Category("Men","Clothing, Shoes, Bags, Watches", ContextCompat.getDrawable(this,R.drawable.one), Color.parseColor("#289fa5"))
        );
        categories.add(
                new Category("Women","Clothing, Shoes, Bags, Jewellery & Watches",ContextCompat.getDrawable(this,R.drawable.two),Color.parseColor("#e93165"))
        );
        categories.add(
                new Category("Kids & babies","Girls, Boys, Toys, Sale",ContextCompat.getDrawable(this,R.drawable.three),Color.parseColor("#9fbe3c"))
        );
        categories.add(
                new Category("Beauty","Beauty, Appliances, Makeup, Skin care",ContextCompat.getDrawable(this,R.drawable.four),Color.parseColor("#f8ac1b"))
        );

        CategoryAdapter adapter = new CategoryAdapter(this,R.layout.item_category,categories);

        categoryList.setAdapter(adapter);

        categoryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this,SubCategoryActivity.class);
                startActivity(i);

            }
        });



    }
}
