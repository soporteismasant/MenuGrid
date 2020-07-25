package com.example.menugrid.Ciclo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import com.example.menugrid.Adapter.ListaCiclosAdaptar;
import com.example.menugrid.ConexionSQLiteHelper;
import com.example.menugrid.R;
import com.example.menugrid.Tablas.Ciclo;

import java.util.ArrayList;

public class VerCiclosActivity extends AppCompatActivity {
    ArrayList<Ciclo> listaCiclos;
    RecyclerView recyclerViewCiclos;
    ConexionSQLiteHelper conn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_ciclos);

        conn = new ConexionSQLiteHelper(this, "incidencias",null,1);

        listaCiclos = new ArrayList<>();
        recyclerViewCiclos = (RecyclerView) findViewById(R.id.listarCiclosRecycler);
        recyclerViewCiclos.setLayoutManager(new LinearLayoutManager(this));

        ListaCiclosAdaptar adaptar = new ListaCiclosAdaptar(getApplicationContext(),listaCiclos);
        recyclerViewCiclos.setAdapter(adaptar);

        consultarListaCiclos();


    }

    private void consultarListaCiclos() {
        SQLiteDatabase db = conn.getReadableDatabase();
        Ciclo ciclo = null;

        Cursor cursor = db.rawQuery("SELECT * FROM ciclo ORDER BY idCiclo DESC",null);

        while (cursor.moveToNext()){
            ciclo = new Ciclo();
            ciclo.setIdCiclo(cursor.getInt(0));
            ciclo.setNombreCiclo(cursor.getString(1));
            listaCiclos.add(ciclo);
        }
    }
}