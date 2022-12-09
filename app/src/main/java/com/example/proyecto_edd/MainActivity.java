package com.example.proyecto_edd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText usuario, contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        usuario = findViewById(R.id.et_usr);
        contraseña = findViewById(R.id.et_pw);
    }

    public void login(View v){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase db = admin.getReadableDatabase();
        String u = usuario.getText().toString();
        String c = contraseña.getText().toString();
        if (u.equals("")){
            Toast.makeText(this, "El usuario no puede estar vacío", Toast.LENGTH_LONG).show();
        }else{
            Cursor row = db.rawQuery("SELECT * FROM usuarios WHERE usuario = '" + u + "' and contraseña ='" + c + "'", null);
            if (row.equals(1)){
                //abrir la siguiente pantalla
                Intent ini = new Intent(this, nueva_review.class);
                startActivity(ini);
            }else{
                usuario.setText("");
                contraseña.setText("");
                Toast.makeText(this, "El usuario no existe o es incorrecto", Toast.LENGTH_LONG).show();
            }
        }
        db.close();
    }

    public void register(View v){
        Intent reg = new Intent(this, registrar_usuario.class);
        startActivity(reg);
    }
}