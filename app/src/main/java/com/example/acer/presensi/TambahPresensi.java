package com.example.acer.presensi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.acer.presensi.model.DataPresensi;
import com.example.acer.presensi.model.ItemPresensi;

public class TambahPresensi extends AppCompatActivity {

    private EditText editNama;
    private EditText editNim;
    private EditText editJurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_presensi);

        editNama = findViewById(R.id.edit_nama);
        editNim = findViewById(R.id.edit_nim);
        editJurusan = findViewById(R.id.edit_jurusan);
    }

    public void onTambahClick (View view){
        String nama, nim, jurusan;

        nama = editNama.getText().toString();
        nim = editNim.getText().toString();
        jurusan = editJurusan.getText().toString();


        ItemPresensi itemPresensi = new ItemPresensi(nama, nim, jurusan);

        DataPresensi.listPresensi.add(itemPresensi);
    }
}
