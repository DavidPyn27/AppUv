package com.casasolarctpi.uv.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.casasolarctpi.uv.R;
import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity implements View.OnClickListener {

    TextInputEditText txtUsuario,  txtContrasena;
    Button btnIngresar;
    TextView txtOlvidarConstraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        inicializar();
    }

    private void inicializar() {
        txtUsuario = findViewById(R.id.txtUsuario);
        txtContrasena = findViewById(R.id.txtContrasena);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(this);
        txtOlvidarConstraseña = findViewById(R.id.txtRestablecer);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnIngresar:
                Intent intent = new Intent(Login.this, MenuPrincipal.class);
                startActivity(intent);
                break;

            case R.id.txtRestablecer:

                break;
        }
    }
}
