package com.example.android.meemiwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MacBookPro on 8/14/17.
 */

public class MyAdapter extends ArrayAdapter<MyClass> {
    public MyAdapter(Activity context, ArrayList<MyClass> itemList) {
        super(context, 0, itemList);
    }

    ///inflate the getView method to adapt 3 items

    public View getView(int positon, View convertView, ViewGroup parent) {
        MyClass currentItem = getItem(positon);

        View listOfItems = convertView;
        if (listOfItems == null) {
            listOfItems = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView defaultText = (TextView) listOfItems.findViewById(R.id.miwok_text_view);
        defaultText.setText(currentItem.getmDefultText());

        TextView miwokText = (TextView) listOfItems.findViewById(R.id.default_text_view);
        miwokText.setText(currentItem.getmMiwokText());

        ImageView imageView = (ImageView) listOfItems.findViewById(R.id.image_view);
        if (currentItem.hasImage()) {
            imageView.setImageResource(currentItem.getmImage());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);}

            return listOfItems;

        }
    }

