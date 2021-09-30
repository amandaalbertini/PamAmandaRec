package com.example.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario;
    EditText edtSenha;
    Button btnLogin;
    Button btnNovo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnNovo = (Button) findViewById(R.id.btnNovo);
    }

    public void Login (View v){
        Intent login = new Intent(MainActivity.this, Menu.class);
        startActivity(login);
    }

    public void Novo (View v){
        Intent novo = new Intent(MainActivity.this, CriarUsuario.class);
        startActivity(novo);
    }
}