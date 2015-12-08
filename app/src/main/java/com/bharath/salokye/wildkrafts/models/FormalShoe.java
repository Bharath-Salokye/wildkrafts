package com.bharath.salokye.wildkrafts.models;

import android.graphics.drawable.Drawable;

/**
 * Created by srn on 12/8/15.
 */
public class FormalShoe {
    public Drawable image;
    public String title;
    public String price;
    public String discount;

    public FormalShoe(Drawable image, String price, String title,String discount) {
        this.image = image;
        this.price = price;
        this.title = title;
        this.discount = discount;

    }
}
