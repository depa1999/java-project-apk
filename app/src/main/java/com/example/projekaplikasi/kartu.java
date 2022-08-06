package com.example.projekaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class kartu extends AppCompatActivity {
    TextView skskirim;
    int sks=14;
    String sksnya;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kartu);

        String no_matkul[]={"1","2","3","4"};
        String kode_matkul[]={"A12.661","A12.662","A12.663","A12.664"};
        String nama_matkul[]={"Apk Mobile","Tek Berger","Arsit Enter","Tugas Akhir"};
        String sks_matkul[]={"4","2","2","6"};
        String nilai_angka_matkul[]={"70","75","80","85"};
        String nilai_huruf_matkul[]={"B","B","A","A"};


        listView=findViewById(R.id.listmatkul);
        AdapterMatkul adapterMatkul=new AdapterMatkul(this,no_matkul,kode_matkul,nama_matkul,sks_matkul,nilai_angka_matkul,nilai_huruf_matkul);
        listView.setAdapter(adapterMatkul);
    }
    public void Masuk(View view){
        skskirim=findViewById(R.id.totalipk);

    }
}