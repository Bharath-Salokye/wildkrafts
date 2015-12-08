package com.bharath.salokye.wildkrafts.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bharath.salokye.wildkrafts.R;
import com.bharath.salokye.wildkrafts.adapters.SubCategoryAdapter;
import com.bharath.salokye.wildkrafts.models.SubCategory;

import java.util.ArrayList;

/**
 * Created by srn on 12/4/15.
 *
 */
public class SubCategoryActivity extends AppCompatActivity {
    ListView subCategoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);
        getSupportActionBar().setTitle("Men");

        subCategoryList = (ListView)findViewById(R.id.sub_category_list);

        ArrayList<SubCategory> subCategories = new ArrayList<>();
        subCategories.add(
                new SubCategory("Clothings", ContextCompat.getDrawable(this,R.drawable.s1))
        );
        subCategories.add(
                new SubCategory("Shoes", ContextCompat.getDrawable(this,R.drawable.s2))
        );
        subCategories.add(
                new SubCategory("Bags", ContextCompat.getDrawable(this,R.drawable.s3))
        );
        subCategories.add(
                new SubCategory("Coats", ContextCompat.getDrawable(this,R.drawable.s6))
        );
        subCategories.add(
                new SubCategory("Belts", ContextCompat.getDrawable(this,R.drawable.s5))
        );
        subCategories.add(
                new SubCategory("Shoes", ContextCompat.getDrawable(this,R.drawable.s2))
        );
        SubCategoryAdapter adapter = new SubCategoryAdapter(this,R.layout.item_sub_category,subCategories);

        subCategoryList.setAdapter(adapter);

        subCategoryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(SubCategoryActivity.this,ShoesActivity.class);
                startActivity(i);
            }
        });

    }
}
