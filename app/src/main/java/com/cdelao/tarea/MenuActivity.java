package com.cdelao.tarea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private Button crearTareaButton;
    private Button borrarTareaButton;
    private Button editarTareaButton;
    private Button listaTareasButton;
    private Button historialTareaButton; // Nuevo botón

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        crearTareaButton = findViewById(R.id.crearTareaButton);
        borrarTareaButton = findViewById(R.id.borrarTareaButton);
        editarTareaButton = findViewById(R.id.editarTareaButton);
        listaTareasButton = findViewById(R.id.listaTareasButton);
        historialTareaButton = findViewById(R.id.historialTareaButton); // Inicializar nuevo botón

        // Acción para crear tarea
        crearTareaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        // Acción para borrar tarea
        borrarTareaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Acción para editar tarea
        editarTareaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Acción para mostrar lista de tareas
        listaTareasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Acción para mostrar historial de tareas
        historialTareaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
