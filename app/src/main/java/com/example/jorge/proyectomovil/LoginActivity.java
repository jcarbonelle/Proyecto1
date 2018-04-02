package com.example.jorge.proyectomovil;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.jorge.proyectomovil.entities.Usuario;
import com.example.jorge.proyectomovil.viewmodel.UserViewModel;

import java.util.List;


public class LoginActivity extends AppCompatActivity {

    private UserViewModel usermodel;
    private List<Usuario> data;
    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user= findViewById(R.id.editText);
        pass=findViewById(R.id.editText2);

        usermodel= ViewModelProviders.of(this).get(UserViewModel.class);
        usermodel.getUsuarios().observe(this, usuarios ->{
            data= usuarios;

        });
    }
    public void Entrar (View view){

        Intent i= new Intent (this, MainActivity.class);
        startActivity(i);
    }
    public void Registro(View view) {
        usermodel.addUsuario(new Usuario(user.getText().toString(), pass.getText().toString()));
        Log.v("Mensaje", data.size() + "");
    }
}
