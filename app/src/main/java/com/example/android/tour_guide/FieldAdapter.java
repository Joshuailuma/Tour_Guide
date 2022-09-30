package com.example.android.tour_guide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class FieldAdapter extends ArrayAdapter<Field> {
    private static final String LOG_TAG = FieldAdapter.class.getSimpleName();

    public FieldAdapter(Activity context, ArrayList<Field> fields) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, fields);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Field currentFieldAdapter = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        // Get the version name from the current Field object and
        // set this text on the name TextView
        titleTextView.setText(currentFieldAdapter.getTitle());
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView description1TextView = listItemView.findViewById(R.id.description1_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        description1TextView.setText(currentFieldAdapter.getDescription1());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView description2TextView = listItemView.findViewById(R.id.description2_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        description2TextView.setText(currentFieldAdapter.getDescription2());
        // Find the ImageView in the music_item.xml layout with the ID imageView
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current Music object and
        // set the image
        if (currentFieldAdapter.hasImage()) {
            imageView.setImageResource(currentFieldAdapter.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}