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
        ordenar = findViewById(R.id.sp_ordenar);
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

                if (seleccion.equals("Por aplicación")){

                }
                if (seleccion.equals("Pistache")){

                }
                if (seleccion.equals("Miel")){

                }
                if (seleccion.equals("Chorizo")){

                }
                if (seleccion.equals("Nuez garampiñada")){

                }
                if (seleccion.equals("Cajeta")){

                }
                if (seleccion.equals("Pistache garampiñado")){

                }
                if (seleccion.equals("Verduras orgánicas")){

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}