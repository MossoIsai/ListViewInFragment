package com.isaigarciamoso.listviewinfragment.Controls;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.isaigarciamoso.listviewinfragment.R;

import java.util.List;

import models.Familia;

/**
 * Created by isaigarciamoso on 12/03/17.
 */

public class AdapterFamilia extends ArrayAdapter<Familia> {


    public AdapterFamilia(Context context, List<Familia> familiaList) {
        super(context, 0, familiaList);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rootView =  convertView;
        if (convertView == null) {
            rootView = inflater.inflate(R.layout.item_list, viewGroup, false);
        }
        TextView texto = (TextView) rootView.findViewById(R.id.names);
        Familia familia = getItem(position);

        texto.setText(familia.getNombre());
        return rootView;
    }

}
