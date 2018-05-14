package com.example.juanpedrog.laboratorio51;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder>{
    List<Item> datos;

    public Adapter(List<Item> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        AdapterViewHolder listaViewHolder=new AdapterViewHolder(v);
        return listaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        holder.nombre.setText(datos.get(position).getNombre());
        holder.fabricante.setText(datos.get(position).getFabricante());
        holder.version.setText(datos.get(position).getVersion());
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class AdapterViewHolder extends RecyclerView.ViewHolder{
        TextView nombre,fabricante,version;
        public AdapterViewHolder(View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.nombre);
            fabricante=itemView.findViewById(R.id.fabricante);
            version=itemView.findViewById(R.id.version);
        }
    }
}
