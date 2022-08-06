package com.example.projekaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dashboard);
    }

    public void pindah(View view) {
        Intent intent=new Intent(MenuDashboard.this,MainActivity.class);
        startActivity(intent);
    }
}