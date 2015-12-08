package com.bharath.salokye.wildkrafts.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bharath.salokye.wildkrafts.R;
import com.bharath.salokye.wildkrafts.models.SubCategory;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by srn on 12/4/15.
 *
 */
public class SubCategoryAdapter extends ArrayAdapter<SubCategory> {
    public SubCategoryAdapter(Context context, int resource, ArrayList<SubCategory> subCategories) {
        super(context, resource, subCategories);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_sub_category, parent, false);
        }

        ImageView image = (ImageView)convertView.findViewById(R.id.sub_category_image);
        TextView title = (TextView)convertView.findViewById(R.id.sub_category_title);




        SubCategory subCategory = getItem(position);
            image.setImageDrawable(subCategory.getImage());
            title.setText(subCategory.getTitle());


        return convertView;

    }
}
