package com.example.acer.presensi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.acer.presensi.R;
import com.example.acer.presensi.model.ItemPresensi;

import java.util.ArrayList;

public class PresensiAdapter extends RecyclerView.Adapter<PresensiAdapter.ViewHolder> {

    private ArrayList<ItemPresensi> listPresensi;

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtNama;
        public TextView txtNim;
        public TextView txtJurusan;

        public ViewHolder (View itemView){
            super(itemView);

            txtNama = itemView.findViewById(R.id.txt_nama);
            txtNim =itemView.findViewById(R.id.txt_nim);
            txtJurusan=itemView.findViewById(R.id.txt_jurusan);
        }
    }


    public PresensiAdapter(ArrayList<ItemPresensi> listPresensi){
        this.listPresensi = listPresensi;
    }

    @NonNull
    @Override
    public PresensiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View itemPresensiView = inflater.inflate(R.layout.layout_item_presensi, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(itemPresensiView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemPresensi itemPresensi = listPresensi.get(position);

        holder.txtNama.setText(itemPresensi.nama);
        holder.txtNim.setText(itemPresensi.nim);
        holder.txtJurusan.setText(itemPresensi.jurusan);
    }

    @Override
    public int getItemCount() {
        return listPresensi.size();
    }
}
