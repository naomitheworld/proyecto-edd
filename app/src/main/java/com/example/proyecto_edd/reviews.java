package com.example.proyecto_edd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class reviews extends AppCompatActivity {
Spinner ordenar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);
        getSupportActionBar().hide();
        ordenar = findViewById(R.id.sp_orden);
        String[] orden = {"Por aplicación","Por conductor","Más recientes","Más antiguas",
                "Mejor calificación","Peor calificación"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,orden);
        ordenar.setAdapter(adapter);

        initialize();
    }

    private void initialize(){
        ordenar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String seleccion = ordenar.getSelectedItem().toString();
                mostrarReseña(seleccion);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void mostrarReseña(String s){
        if (s.equals("Por aplicación")){

        }
        if (s.equals("Por conductor")){

        }
        if (s.equals("Más recientes")){

        }
        if (s.equals("Más antiguas")){

        }
        if (s.equals("Mejor calificación")){

        }
        if (s.equals("Peor calificación")){

        }
    }

}