package com.example.menugrid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.menugrid.BaseDeDatos.incidencia;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {
    public ConexionSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(incidencia.CREAR_TABLA_CICLO);
        sqLiteDatabase.execSQL(incidencia.CREAR_TABLA_GRUPO);
        sqLiteDatabase.execSQL(incidencia.CREAR_TABLA_INCIDENCIA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + incidencia.CREAR_TABLA_CICLO);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + incidencia.CREAR_TABLA_GRUPO);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + incidencia.CREAR_TABLA_INCIDENCIA);
        onCreate(sqLiteDatabase);
    }
}
