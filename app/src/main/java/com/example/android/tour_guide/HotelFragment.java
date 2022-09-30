package com.example.android.tour_guide;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NumbersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fields_list, container, false);
        Resources r = getResources();
        // Create a list of fields
        final ArrayList<Field> fields = new ArrayList<Field>();
        fields.add(new Field(r.getString(R.string.Protea), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.buka));
        fields.add(new Field(r.getString(R.string.Stanbic), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.hotel1));
        fields.add(new Field(r.getString(R.string.q), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.hotel2));
        fields.add(new Field(r.getString(R.string.Eko), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.hotel3));
        fields.add(new Field(r.getString(R.string.Park), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.hotel4));
        fields.add(new Field(r.getString(R.string.Mansari), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.hotel5));
        fields.add(new Field(r.getString(R.string.Uyi), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.hotel6));
        fields.add(new Field(r.getString(R.string.Eko), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.hotel7));
        fields.add(new Field(r.getString(R.string.Rest), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.hotel8));
        fields.add(new Field(r.getString(R.string.Relax), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.p_lekki));
        fields.add(new Field(r.getString(R.string.Perch), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.hotel9));
        fields.add(new Field(r.getString(R.string.Plus), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.hotel10));
        // Create an {@link FieldAdapter}, whose data source is a list of {@link Field}s. The
        // adapter knows how to create list items for each item in the list.
        FieldAdapter adapter = new FieldAdapter(getActivity(), fields);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.rootView);
        // Make the {@link ListView} use the {@link FieldAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Field} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}