package com.example.projekaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    TextView namaKirim;
    TextView nimKirim;
    TextView jurusanKirim;

    String name="nama";
    String namanya;
    String nim="nim";
    String nimnya;
    String jurusan="jurusan";
    String jurusannya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        namaKirim=findViewById(R.id.penerima);
        nimKirim=findViewById(R.id.penerima2);
        jurusanKirim=findViewById(R.id.penerima3);

        Bundle bundle=getIntent().getExtras();
        namanya=bundle.getString(name);
        namaKirim.setText("Nama: "+namanya);

        nimnya=bundle.getString(nim);
        nimKirim.setText("NIM: "+nimnya);

        jurusannya=bundle.getString(jurusan);
        jurusanKirim.setText("Jurusan: "+jurusannya);
    }
}