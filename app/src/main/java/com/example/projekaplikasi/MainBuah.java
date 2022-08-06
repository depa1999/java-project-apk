package com.example.projekaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainBuah extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_buah);

        String nama_pahlawan[]={
                "Diponegoro",
                "Pattimura",
                "Soedirman",
                "Bung Tomo",
                "Kartini",
                "Sultan Hasanuddin",
                "Soekarno",
                "Ahmad Yani",
                "Moh Hatta",
                "Cut Nyak Dien"
        };

        int gambar_pahlawan[]={
                R.drawable.diponegoro,
                R.drawable.pattimura,
                R.drawable.soedirman,
                R.drawable.bung_tomo,
                R.drawable.kartini,
                R.drawable.hasanuddin,
                R.drawable.soekarno,
                R.drawable.ahmad_yani,
                R.drawable.moh_hatta,
                R.drawable.cut_nya_dien
        };

        String keterangan[]={
                "Pahlawan dari Jawa",
                "Pahlawan dari Maluku",
                "Pahlawan dengan gelar Jenderal Besar",
                "Pahlawan dari Surabaya",
                "Pahlawan dari Jepara",
                "Pahlawan dari Sulawesi",
                "Pahlawan Proklamasi",
                "Pahlawan Revolusi",
                "Pahlawan Proklamasi",
                "Pahlawan dari Aceh"
        };
        listView=findViewById(R.id.listdatapahlawan);
        AdapterBuah adapterPahlawan=new AdapterBuah(this,nama_pahlawan,gambar_pahlawan,keterangan);
        listView.setAdapter(adapterPahlawan);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nm_pahlawan=nama_pahlawan[position].toString();
                int gbr_pahlawan=gambar_pahlawan[position];
                String ket=keterangan[position].toString();

                Intent intent=new Intent(MainBuah.this,DetailBuah.class);
                intent.putExtra("namapahlawan",nm_pahlawan);
                intent.putExtra("gambarpahlawan",gbr_pahlawan);
                intent.putExtra("keter",ket);
                startActivity(intent);
            }
        });
    }
}