package com.bharath.salokye.wildkrafts.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.bharath.salokye.wildkrafts.R;
import com.bharath.salokye.wildkrafts.adapters.ShoeAdapter;
import com.bharath.salokye.wildkrafts.models.FormalShoe;

import java.util.List;

/**
 * Created by srn on 12/8/15.
 */
public class FormalShoesActivity extends AppCompatActivity {
    GridView gridView;
    ShoeAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formal_shoes);
        getSupportActionBar().setTitle("Men's Formal Shoes");

        gridView = (GridView)findViewById(R.id.shoes_grid);
        adapter = new ShoeAdapter(this);

        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(FormalShoesActivity.this,CheckoutActivity.class);
                startActivity(i);
            }
        });



    }
}
