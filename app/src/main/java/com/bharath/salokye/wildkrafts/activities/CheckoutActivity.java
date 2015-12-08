package com.bharath.salokye.wildkrafts.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bharath.salokye.wildkrafts.R;

/**
 * Created by srn on 12/8/15.
 */
public class CheckoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        getSupportActionBar().setTitle("Checkout");
    }
}
