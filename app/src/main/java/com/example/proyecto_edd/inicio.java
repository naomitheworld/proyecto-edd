package com.example.proyecto_edd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        getSupportActionBar().hide();
    }

    public void nva_res(View v){
        Intent nr = new Intent(this, nueva_review.class);
        startActivity(nr);
    }

    public void ver_res(View v){
        Intent vr = new Intent(this, reviews.class);
        startActivity(vr);
    }
}