package com.bharath.salokye.wildkrafts.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bharath.salokye.wildkrafts.R;
import com.bharath.salokye.wildkrafts.models.Category;

import java.util.ArrayList;

/**
 * Created by srn on 12/4/15.
 */
public class CategoryAdapter extends ArrayAdapter<Category> {

    public CategoryAdapter(Context context, int resource,ArrayList<Category> categories) {
        super(context, resource,categories);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        Category category = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_category, parent, false);
        }

        convertView.setBackgroundColor(category.getBackgroundColor());

        TextView title = (TextView)convertView.findViewById(R.id.category_title);
        TextView caption = (TextView)convertView.findViewById(R.id.category_caption);

        ImageView image = (ImageView)convertView.findViewById(R.id.category_image);

        title.setText(category.getTitle());
        caption.setText(category.getCaption());
        image.setImageDrawable(category.getImage());



        return convertView;
    }
}
