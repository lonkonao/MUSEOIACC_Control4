package com.example.museoiacc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView Listado;

    String [] [] datos = {
            {"Toki kura o kachal kura","Piedra. Colección Objetos Mapuche, Museo Regional de Rancagua."},
            {"Trewa metawe","Aparentemente un trewa metawe (jarro con forma de perro)"},
            {"Trong trong","Un trong trong (vasija de cuero) es un objeto de uso cotidiano utilizado para almacenar y transportar líquidos"},
            {"Rali","Un rali (plato de madera) es un objeto de uso cotidiano"},
            {""},
    };



    int [] datosimg = {R.drawable.foto1,R.drawable.foto2,R.drawable.foto3,R.drawable.foto4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Listado = (ListView) findViewById(R.id.index);
        Listado.setAdapter(new adaptador(this,datos,datosimg));

    }
}