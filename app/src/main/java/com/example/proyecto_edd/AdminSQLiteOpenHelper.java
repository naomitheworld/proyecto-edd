package com.example.proyecto_edd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuarios(usuario text primary key, contraseña text)");
        db.execSQL("create table apps(nombre text primary key)");
        db.execSQL("create table conductores(id int primary key, nombre text, sexo text," +
                " app text references apps(nombre))");
        db.execSQL("create table review(id int primary key, app text references apps(nombre), " +
                "conductor text references conductores(nombre), reseña text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
