package com.example.proyecto_edd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registrar_usuario extends AppCompatActivity {
EditText usuario, contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);
        getSupportActionBar().hide();
        usuario = findViewById(R.id.et_usr_r);
        contraseña = findViewById(R.id.et_pw_r);
    }

    public void registrarUsuario(View v){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase db = admin.getReadableDatabase();
        String u = usuario.getText().toString();
        String c = contraseña.getText().toString();
        ContentValues nvoUsuario = new ContentValues();
        nvoUsuario.put("usuario", u);
        nvoUsuario.put("contraseña", c);
        db.insert("usuarios", null, nvoUsuario);
        db.close();
        Toast.makeText(this, "Usuario registrado", Toast.LENGTH_LONG);
    }
}