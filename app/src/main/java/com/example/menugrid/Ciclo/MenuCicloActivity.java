package com.example.menugrid.Ciclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.menugrid.R;

public class MenuCicloActivity extends AppCompatActivity {
    private ImageView ciclo, listarCiclos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ciclo);

        ciclo = findViewById(R.id.iv_menuAgregarCiclo);
        listarCiclos = findViewById(R.id.iv_menuVerCiclos);

        ciclo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cicloIntent = new Intent(MenuCicloActivity.this, AgregarCicloActivity.class);
                startActivity(cicloIntent);
            }
        });

        listarCiclos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vercicloIntent = new Intent(MenuCicloActivity.this, VerCiclosActivity.class);
                startActivity(vercicloIntent);
            }
        });
    }
}