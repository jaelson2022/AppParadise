package com.example.paradise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;

    private EditText edit_email,edit_senha;

    private AppCompatButton bt_entrar;




    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        IniciarComponentes();


        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit_email.getText().toString().isEmpty() || edit_senha.getText().toString().isEmpty()){
                    Toast.makeText(FormLogin.this, "Preencha os campos", Toast.LENGTH_LONG).show();
                    edit_email.requestFocus();
                }else if (edit_email.getText().toString().equals("joaopaulo@gmail.com") &&
                          edit_senha.getText().toString().equals("123456")){

                    Intent intent = new Intent(FormLogin.this,TelaBoasVindas.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(FormLogin.this, "Login Incorreto!", Toast.LENGTH_LONG).show();
                    edit_email.requestFocus();
                }
            }
        });


        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(intent);


            }
        });


    }


            private void IniciarComponentes(){
                text_tela_cadastro = findViewById(R.id.tex_tela_cadastro);
                edit_email = findViewById(R.id.edit_email);
                edit_senha = findViewById(R.id.edit_senha);
                bt_entrar = findViewById(R.id.bt_entrar);

                edit_email.requestFocus();
            }
            public void voltar(View view){
                finish();
            }
        }
    