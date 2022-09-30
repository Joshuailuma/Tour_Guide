package com.example.android.tour_guide;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fields_list, container, false);
        Resources r = getResources();
        // Create a list of fields
        final ArrayList<Field> fields = new ArrayList<>();
        fields.add(new Field(r.getString(R.string.Buka), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.cafe));
        fields.add(new Field(r.getString(R.string.Food), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.cafe));
        fields.add(new Field(r.getString(R.string.Chilling), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.chill));
        fields.add(new Field(r.getString(R.string.China), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.china));
        fields.add(new Field(r.getString(R.string.Sweet), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.foodie));
        fields.add(new Field(r.getString(R.string.GT), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.gt));
        fields.add(new Field(r.getString(R.string.Kadis), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.kadis));
        // Create an {@link FieldAdapter}, whose data source is a list of {@link Field}s. The
        // adapter knows how to create list items for each item in the list.
        FieldAdapter adapter = new FieldAdapter(getActivity(), fields);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.rootView);
        // Make the {@link ListView} use the {@link FieldAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Field} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}