package com.example.gf_reyesdelciclismo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irARegistrarse (View view) {
        Intent i = new Intent(this, Registrarse.class);
        startActivity(i);
    }

    public void irAInscritos (View view) {
        Intent i = new Intent(this, Inscritos.class);
        startActivity(i);
    }
}