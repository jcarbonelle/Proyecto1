package com.example.jorge.proyectomovil;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.jorge.proyectomovil.adapter.ViewAdapter;
import com.example.jorge.proyectomovil.entities.Partido;
import com.example.jorge.proyectomovil.viewmodel.PartidosViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ViewAdapter adapter;
    private PartidosViewModel JSonmodel;
    private List<Partido> partidos;
    private AppDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSonmodel= ViewModelProviders.of(this).get(PartidosViewModel.class);
        /*JSonmodel.getPartidos().observe(this, data ->{
            partidos=data;
        });

        adapter=new ViewAdapter(this, partidos);
        recycler.findViewById(R.id.recycle);
        recycler.setAdapter(adapter);
        */
    }
}

