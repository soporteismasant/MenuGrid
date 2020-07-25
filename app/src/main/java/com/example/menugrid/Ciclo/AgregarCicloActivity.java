package com.example.menugrid.Ciclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.media.audiofx.AutomaticGainControl;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.menugrid.BaseDeDatos.incidencia;
import com.example.menugrid.ConexionSQLiteHelper;
import com.example.menugrid.R;

public class AgregarCicloActivity extends AppCompatActivity {
    EditText nombreCiclo;
    Button btnlimpiarCiclo, btnguardarCiclo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_ciclo);
        
        nombreCiclo = findViewById(R.id.ed_agregarCiclo);
        btnlimpiarCiclo = findViewById(R.id.btn_Limpiar_agregarCiclo);
        btnguardarCiclo = findViewById(R.id.btn_Guardar_agregarCiclo);
        
        
        btnlimpiarCiclo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LimpiarCiclos();
            }
        });

        btnguardarCiclo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GuardarCiclos();
            }
        });


    }

    private void GuardarCiclos() {
        ConexionSQLiteHelper conn= new ConexionSQLiteHelper(AgregarCicloActivity.this,"incidencias",null,1);
        SQLiteDatabase bd= conn.getWritableDatabase();

        if (TextUtils.isEmpty(nombreCiclo.getText().toString()))
        {
           Toast.makeText(AgregarCicloActivity.this,"Debes llenar el campo ciclo",Toast.LENGTH_SHORT).show();
        } else
        {
            ContentValues values = new ContentValues();
            values.put(incidencia.CAMPO_NOMBRE_CICLO,nombreCiclo.getText().toString());

            long idRegistro = bd.insert(incidencia.TABLA_CICLO, incidencia.CAMPO_NOMBRE_CICLO,values);
            Toast.makeText(AgregarCicloActivity.this,"Registro número :" + idRegistro,Toast.LENGTH_SHORT).show();
            bd.close();
            LimpiarCiclos();
        }

    }

    private void LimpiarCiclos() {
        nombreCiclo.setText("");
    }


}