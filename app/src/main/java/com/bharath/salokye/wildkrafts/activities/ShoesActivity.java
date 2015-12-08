package com.bharath.salokye.wildkrafts.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bharath.salokye.wildkrafts.R;
import com.bharath.salokye.wildkrafts.adapters.SubCategoryAdapter;
import com.bharath.salokye.wildkrafts.models.SubCategory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by srn on 12/8/15.
 */
public class ShoesActivity extends AppCompatActivity {
    ListView listView;
    SubCategoryAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);
        getSupportActionBar().setTitle("Shoes");
        listView = (ListView)findViewById(R.id.shoes_list);
        ArrayList<SubCategory> shoes = new ArrayList<>();

        shoes.add(
                new SubCategory("Slippers", ContextCompat.getDrawable(this, R.drawable.p1))
        );
        shoes.add(
                new SubCategory("Moccasins", ContextCompat.getDrawable(this, R.drawable.p2))
        );
        shoes.add(
                new SubCategory("Loafers", ContextCompat.getDrawable(this, R.drawable.p3))
        );
        shoes.add(
                new SubCategory("Boots", ContextCompat.getDrawable(this, R.drawable.p4))
        );
        shoes.add(
                new SubCategory("Formal Shoes", ContextCompat.getDrawable(this, R.drawable.p5))
        );
        shoes.add(
                new SubCategory("Sports Shoes", ContextCompat.getDrawable(this, R.drawable.p6))
        );
        adapter = new SubCategoryAdapter(this,R.layout.item_sub_category,shoes);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ShoesActivity.this,FormalShoesActivity.class);
                startActivity(i);
            }
        });


    }
}
