package com.sanju784.android_custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String> {

    CustomAdapter(Context context, String[] cars) {
        super(context, R.layout.list_row, cars);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.list_row, parent, false);

        String car = getItem(position);
        TextView tv = (TextView) customView.findViewById(R.id.textView);
        ImageView img = (ImageView) customView.findViewById(R.id.imageView);

        tv.setText(car);
        img.setImageResource(R.drawable.car1);

        return customView;
    }
}