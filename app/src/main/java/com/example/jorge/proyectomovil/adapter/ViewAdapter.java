package com.example.jorge.proyectomovil.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jorge.proyectomovil.R;
import com.example.jorge.proyectomovil.entities.Partido;

import java.util.List;

/**
 * Created by Jorge on 31/03/2018.
 */

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.MyViewHolder>{

    private LayoutInflater inflater;
    private List<Partido> partidos;

    public ViewAdapter(Context context, List<Partido> partidos) {
        inflater=LayoutInflater.from(context);
        this.partidos = partidos;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.row,parent,false);
        MyViewHolder holder= new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Partido partido =partidos.get(position);
        holder.tvhome.setText(partido.getEquipo1());
        holder.tvaway.setText(partido.getEquipo2());
        holder.tvresult.setText(partido.getGoles1()+" - "+partido.getGoles2());
    }

    @Override
    public int getItemCount() {
        return partidos.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvhome;
        private TextView tvaway;
        private TextView tvresult;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvhome= itemView.findViewById(R.id.textHome);
            tvaway= itemView.findViewById(R.id.textAway);
            tvresult= itemView.findViewById(R.id.textResult);
        }
    }
}
