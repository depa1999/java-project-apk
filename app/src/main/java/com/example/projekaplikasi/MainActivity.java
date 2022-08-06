package com.example.projekaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    EditText editText3;
    Button button;

    String nama;
    String nim;
    String jurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.nama);
        editText2=findViewById(R.id.nim);
        editText3=findViewById(R.id.jurusan);
    }

    public void KirimData(View view) {
        String namaisi=editText.getText().toString();
        String nimisi=editText2.getText().toString();
        String jurusanisi=editText3.getText().toString();
        Intent intent=new Intent(MainActivity.this,MainActivity1.class);
        intent.putExtra("nama",namaisi);
        intent.putExtra("nim",nimisi);
        intent.putExtra("jurusan",jurusanisi);
        startActivity(intent);
    }
}