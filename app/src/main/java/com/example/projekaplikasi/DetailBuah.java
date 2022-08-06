package com.example.projekaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBuah extends AppCompatActivity {
    ImageView gambarpahlawan_masuk;
    TextView namapahlawan_masuk,ketpahlawan_masuk;

    String nm_kunci="namapahlawan";
    String ket_kunci="keter";
    int gambarpahlawan;

    String namapahlawane;
    String ketpahlawane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buah);

        gambarpahlawan_masuk=findViewById(R.id.gambarterima);
        namapahlawan_masuk=findViewById(R.id.nmpahlawan);
        ketpahlawan_masuk=findViewById(R.id.ketpahlawan);

        Bundle bundle=getIntent().getExtras();

        gambarpahlawan=bundle.getInt(String.valueOf("gambarpahlawan"));
        gambarpahlawan_masuk.setImageResource(gambarpahlawan);

        namapahlawane=bundle.getString("namapahlawan");
        ketpahlawane=bundle.getString("keter");

        namapahlawan_masuk.setText(namapahlawane);
        ketpahlawan_masuk.setText(ketpahlawane);
    }
}