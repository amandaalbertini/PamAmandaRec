package com.example.rickandmorty;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Buscar extends AppCompatActivity {

    EditText edtBuscar;
    Button btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        edtBuscar = (EditText) findViewById(R.id.edtBuscar);
        btnBuscar = (Button) findViewById(R.id.btnBuscar);
    }
}
