package com.example.alvaro_gordillo_alumno_tarea6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void showSingUp(View view){
        Intent intent = new Intent(LoginActivity.this,SingUpActivity.class);
        startActivity(intent);
    }

    public void showHome(View view){
        Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
        startActivity(intent);
    }



}