package com.bharath.salokye.wildkrafts.models;

import android.graphics.drawable.Drawable;

/**
 * Created by srn on 12/4/15.
 *
 */
public class SubCategory {
    String title;
    Drawable image;

    public SubCategory(String title, Drawable image) {
        this.title = title;
        this.image = image;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
