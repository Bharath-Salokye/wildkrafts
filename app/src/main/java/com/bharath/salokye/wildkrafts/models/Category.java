package com.bharath.salokye.wildkrafts.models;

import android.graphics.drawable.Drawable;

/**
 * Created by srn on 12/4/15.
 */
public class Category {
    long _id;
    String title;



    String caption;
    Drawable image;
    int backgroundColor;



    public Category(String title,String caption, Drawable image,int bg) {
        this.title = title;
        this.image = image;
        this.caption = caption;

        this.backgroundColor = bg;
    }
    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }


}
