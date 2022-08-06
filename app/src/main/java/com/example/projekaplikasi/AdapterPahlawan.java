package com.example.projekaplikasi;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterPahlawan extends ArrayAdapter{
    String namapahlawan[];
    String ket_pahlawan[];
    int gambar_pahlawan[];
    Activity activity;

    public AdapterPahlawan(MainPahlawan activity,
                       String[] nama_pahlawan,
                       int[] gambar_pahlawan,
                       String[] ket_pahlawan
    )
    {
        super(activity, R.layout.list_item,nama_pahlawan);
        this.namapahlawan = nama_pahlawan;
        this.ket_pahlawan = ket_pahlawan;
        this.gambar_pahlawan = gambar_pahlawan;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.list_item,null);

        ImageView gambar;
        TextView nama_pahlawan;

        gambar=v.findViewById(R.id.gambar_pahlawan);
        nama_pahlawan=v.findViewById(R.id.nama_pahlawan);

        gambar.setImageResource(gambar_pahlawan[position]);
        nama_pahlawan.setText(namapahlawan[position]);

        return v;
    }
}
