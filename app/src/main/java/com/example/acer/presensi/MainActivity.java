package com.example.acer.presensi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.acer.presensi.model.DataPresensi;
import com.example.acer.presensi.model.ItemPresensi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initPresensi();
    }
    public void onTambahPresensiClick (View view){
        Intent tambahPresensi = new Intent(this, TambahPresensi.class);

        this.startActivity(tambahPresensi);
    }
    public void onOpenDaftarPresensi (View view){
        Intent listPresensi = new Intent( this, TambahPresensi.class);

        this.startActivity(listPresensi);
    }
    private void initPresensi(){
        ItemPresensi saya = new ItemPresensi("Saya", "16", "TI");
        ItemPresensi siapa = new ItemPresensi("Siapa", "17", "TE");
        ItemPresensi ya = new ItemPresensi("Ya", "18", "TETI");

        DataPresensi.listPresensi.add(saya);
        DataPresensi.listPresensi.add(siapa);
        DataPresensi.listPresensi.add(ya);
    }
}
