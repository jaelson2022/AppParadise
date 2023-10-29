package com.example.paradise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Quartos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quartos);

        Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

        //Toolbar toolbar = findViewById(R.id.toolbar);
        //        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.quartos){
            Toast.makeText(this, "Create a new quartos", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.cadastro){
            Toast.makeText(this, "Create a new cadastro", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.login){
            Toast.makeText(this, "Create a new login", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.tela_principal){
            Toast.makeText(this, "Create a new tela_principal", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}