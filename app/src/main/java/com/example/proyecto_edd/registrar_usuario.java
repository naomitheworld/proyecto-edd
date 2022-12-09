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
        SQLiteDatabase db = admin.getWritableDatabase();
        String u = usuario.getText().toString();
        String p = contraseña.getText().toString();
        ContentValues registro = new ContentValues();
        registro.put("usuario",u);
        registro.put("contraseña",p);
        db.insert("usuarios", null, registro);
        db.close();
        Toast.makeText(this, "Usuario guardado", Toast.LENGTH_LONG).show();
        usuario.setText("");
        contraseña.setText("");
    }
}