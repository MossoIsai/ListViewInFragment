package com.isaigarciamoso.listviewinfragment.Controls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.isaigarciamoso.listviewinfragment.R;

public class Principal extends AppCompatActivity {

    private Button btn;
    private View.OnClickListener listenerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //Inicializando Vistas
        initViews();
    }
    private void initViews() {
        btn = (Button) findViewById(R.id.button);
        listenerBtn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentList fragmentList = new FragmentList();
                getFragmentManager().
                        beginTransaction().
                        add(R.id.activity_principal, fragmentList)
                        .commit();
            }
        };
        btn.setOnClickListener(listenerBtn);
    }

}
