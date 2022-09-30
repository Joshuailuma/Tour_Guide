package com.example.android.tour_guide;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fields_list, container, false);
        Resources r = getResources();
        // Create a list of fields
        final ArrayList<Field> fields = new ArrayList<Field>();
        fields.add(new Field(r.getString(R.string.Kanu), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.p_kanu));
        fields.add(new Field(r.getString(R.string.Lekki), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.p_lekki));
        fields.add(new Field(r.getString(R.string.James), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.p_io));
        fields.add(new Field(r.getString(R.string.Olumo), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.p_olumo));
        fields.add(new Field(r.getString(R.string.Pemsi), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.p_nature));
        fields.add(new Field(r.getString(R.string.Tinubu), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.p_tinubu));
        fields.add(new Field(r.getString(R.string.National), r.getString(R.string.portharcourt), r.getString(R.string.number), R.drawable.p_ski));
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