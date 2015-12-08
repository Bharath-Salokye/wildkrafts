package com.bharath.salokye.wildkrafts.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bharath.salokye.wildkrafts.R;
import com.bharath.salokye.wildkrafts.models.FormalShoe;

import java.util.ArrayList;

/**
 * Created by srn on 12/8/15.
 */
public class ShoeAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<FormalShoe> shoes;
    public ShoeAdapter(Context c){
        this.mContext = c;

        shoes = new ArrayList<>();

        shoes.add(
                new FormalShoe(ContextCompat.getDrawable(mContext, R.drawable.t1), "R 499", "Shoe Mate Black Formal\n(sm-291) Lace up Shoes", "-50%")
        );
        shoes.add(
                new FormalShoe(ContextCompat.getDrawable(mContext, R.drawable.t2), "R 499", "Shoe Mate Sm283 Lace up\nShoes", "-50%")
        );
        shoes.add(
                new FormalShoe(ContextCompat.getDrawable(mContext, R.drawable.t3), "R 599", "Wonker GAN-13 Slip on Shoes", "-69%")
        );
        shoes.add(
                new FormalShoe(ContextCompat.getDrawable(mContext, R.drawable.t1), "R 599", "Kraasa High Ankle Lace Up\nShoes", "-64%")
        );

    }

    @Override
    public int getCount() {
        return shoes.size();
    }

    @Override
    public FormalShoe getItem(int position) {
        return shoes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_formal_shoe, parent, false);
        }

        ImageView image = (ImageView)convertView.findViewById(R.id.shoe_image);
        TextView title = (TextView)convertView.findViewById(R.id.shoe_title);
        TextView price = (TextView)convertView.findViewById(R.id.shoe_price);
        TextView discount = (TextView)convertView.findViewById(R.id.shoe_discount);




        FormalShoe shoe = getItem(position);
        image.setImageDrawable(shoe.image);
        title.setText(shoe.title);
        price.setText(shoe.price);
        discount.setText(shoe.discount);


        return convertView;

    }




}

// 12 - 180
// 6/11 - 172
// 6/10 - 167
// 7/9 - 193

// tolta 712