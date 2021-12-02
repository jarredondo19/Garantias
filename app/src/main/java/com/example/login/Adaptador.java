package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {

    Context context;
    ArrayList<User> list;

    public Adaptador(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
       return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        User user = list.get(position);
        holder.nit.setText(user.getNit());
        holder.nit.setText(user.getNombre());
        holder.nit.setText(user.getProducto());
        holder.nit.setText(user.getDano());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nit,nombre,producto,dano;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nit = itemView.findViewById(R.id.tvnit);
            nombre = itemView.findViewById(R.id.tvnombre);
            producto = itemView.findViewById(R.id.tvproducto);
            dano = itemView.findViewById(R.id.tvdono);

        }
    }
}
