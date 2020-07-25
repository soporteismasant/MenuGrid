package com.example.menugrid.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menugrid.R;
import com.example.menugrid.Tablas.Ciclo;

import java.util.ArrayList;

public class ListaCiclosAdaptar extends RecyclerView.Adapter<ListaCiclosAdaptar.CiclosViewHolder> {
    private Context mContext;
    ArrayList<Ciclo> listaCiclo;

    public ListaCiclosAdaptar(Context mContext, ArrayList<Ciclo> listaCiclo) {
        this.mContext = mContext;
        this.listaCiclo = listaCiclo;
    }

    @NonNull
    @Override
    public CiclosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ciclos_list,null,false);
        return new CiclosViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CiclosViewHolder holder, int position) {
        final Ciclo ciclo = listaCiclo.get(position);

        holder.idCiclo.setText(listaCiclo.get(position).getIdCiclo().toString());
        holder.nombreCiclo.setText(listaCiclo.get(position).getNombreCiclo());

    }

    @Override
    public int getItemCount() {
        return listaCiclo.size();
    }

    public class CiclosViewHolder extends RecyclerView.ViewHolder{
        TextView idCiclo, nombreCiclo;

        public CiclosViewHolder(@NonNull View itemView) {
            super(itemView);

            idCiclo = (TextView) itemView.findViewById(R.id.listIdCiclo);
            nombreCiclo = (TextView) itemView.findViewById(R.id.listNombreCiclo);
        }
    }
}
