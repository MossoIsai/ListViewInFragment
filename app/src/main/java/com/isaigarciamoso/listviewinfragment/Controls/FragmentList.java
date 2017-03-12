package com.isaigarciamoso.listviewinfragment.Controls;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.isaigarciamoso.listviewinfragment.R;

import java.util.ArrayList;
import java.util.List;

import models.Familia;

/**
 * Created by isaigarciamoso on 11/03/17.
 */
public class FragmentList extends Fragment {
    private ListView listView;
    private AdapterFamilia familiaArrayAdapter;
    private List<Familia> listFamilia;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);
        listFamilia = new ArrayList<Familia>();
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listFamilia.add(new Familia("ISAI"));
        listView = (ListView) rootView.findViewById(R.id.lista);
        familiaArrayAdapter = new AdapterFamilia(getActivity().getApplicationContext(), listFamilia);
        listView.setAdapter(familiaArrayAdapter);
        return rootView;
    }

}
