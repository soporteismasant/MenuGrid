package com.example.menugrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.menugrid.Ciclo.AgregarCicloActivity;
import com.example.menugrid.Ciclo.MenuCicloActivity;

public class MainActivity extends AppCompatActivity {
    ImageView ciclo, dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ciclo = findViewById(R.id.IV_Ciclo);
        dos = findViewById(R.id.dos);

        ciclo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuCicloActivity.class);
                startActivity(intent);
            }
        });



    }
}