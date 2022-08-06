package com.example.projekaplikasi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterMatkul extends ArrayAdapter {
    String nomatkul[];
    String kodematkul[];
    String namamatkul[];
    String sks[];
    String nilaiangka[];
    String nilaihuruf[];
    Activity activity;

    public AdapterMatkul(kartu activity,
                         String[] nomatkul,
                         String[] kodematkul,
                         String[] namamatkul,
                         String[] sks,
                         String[] nilaiangka,
                         String[] nilaihuruf)
    {
        super(activity, R.layout.list_khs,namamatkul);
        this.nomatkul = nomatkul;
        this.kodematkul = kodematkul;
        this.namamatkul = namamatkul;
        this.sks = sks;
        this.nilaiangka = nilaiangka;
        this.nilaihuruf = nilaihuruf;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.list_khs,null);

        TextView noe;
        TextView kodee;
        TextView namae;
        TextView skse;
        TextView angkae;
        TextView hurufe;

        noe=v.findViewById(R.id.nomer);
        kodee=v.findViewById(R.id.kode);
        namae=v.findViewById(R.id.nama);
        skse=v.findViewById(R.id.sks);
        angkae=v.findViewById(R.id.nilaiangka);
        hurufe=v.findViewById(R.id.nilaihuruf);

        noe.setText(nomatkul[position]);
        kodee.setText(kodematkul[position]);
        namae.setText(namamatkul[position]);
        skse.setText(sks[position]);
        angkae.setText(nilaiangka[position]);
        hurufe.setText(nilaihuruf[position]);

        return v;
    }
}
