package com.example.projekaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HalloToas extends AppCompatActivity {
    TextView textView;
    int konter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hallo_toas);
        textView=findViewById(R.id.konterview);
    }

    public void tampil(View view) {
        //Toast.makeText(, "", Toast.LENGTH_SHORT).show();
        Toast mytoas=Toast.makeText(HalloToas.this, "Saya Adalah Toas",Toast.LENGTH_LONG);
        mytoas.show();
    }

    public void hitung(View view){
        konter++;
        if(konter%2==0)
        {
            //Genap
            textView.setBackgroundResource(R.color.blue);
        }
        else
        {
            //Ganjil
            textView.setBackgroundResource(R.color.hijau_muda);
        }
        textView.setText(Integer.toString(konter).toString());
    }
}