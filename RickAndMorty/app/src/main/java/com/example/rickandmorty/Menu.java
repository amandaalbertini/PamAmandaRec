package com.example.rickandmorty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    Button btnPersonagens;
    Button btnEpisodios;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        btnPersonagens = (Button) findViewById(R.id.btnPersonagens);
        btnEpisodios = (Button) findViewById(R.id.btnEpisodios);
        btnLogout = (Button) findViewById(R.id.btnLogout);
    }

    public void Pers (View v){
        Intent pers = new Intent(Menu.this, Personagens.class);
        startActivity(pers);
    }

    public void Ep (View v){
        Intent eps = new Intent(Menu.this, Episodios.class);
        startActivity(eps);
    }

    public void Out (View v){
        Intent out = new Intent(Menu.this, MainActivity.class);
        startActivity(out);
    }
}
