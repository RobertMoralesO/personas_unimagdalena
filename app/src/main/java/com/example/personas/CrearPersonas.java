package com.example.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class CrearPersonas extends AppCompatActivity {
	private EditText cedula, nombre, apellido;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crear_personas);

		cedula = findViewById(R.id.txtCedula);
		nombre = findViewById(R.id.txtNombre);
		apellido = findViewById(R.id.txtApellido);
	}

	public void limpiar(View v){
		cedula.setText("");
		nombre.setText("");
		apellido.setText("");
		cedula.requestFocus();
	}
}
