package com.example.paradise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Quartos extends AppCompatActivity {

    private AppCompatButton bt_reservar;
    private AppCompatButton bt_reservar01;

    private AppCompatButton bt_reservar02;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quartos);

        IniciarComponentes();
        bt_reservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Quartos.this,FormLogin.class);
                startActivity(intent);
            }
        });

        bt_reservar01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Quartos.this,FormLogin.class);
                startActivity(intent);
            }
        });

        bt_reservar02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quartos.this,FormLogin.class);
                startActivity(intent);
            }
        });

    }
    private void IniciarComponentes(){
        bt_reservar = findViewById(R.id.bt_reservar);
        bt_reservar01 = findViewById(R.id.bt_reservar01);
        bt_reservar02 = findViewById(R.id.bt_Reservar02);
    }

    public void voltar(View view) {
        finish();
    }
}
