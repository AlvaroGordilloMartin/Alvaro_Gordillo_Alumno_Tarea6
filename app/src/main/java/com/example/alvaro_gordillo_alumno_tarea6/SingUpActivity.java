package com.example.alvaro_gordillo_alumno_tarea6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
    }

    public void toLogin(View view){
        Intent intent = new Intent(SingUpActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}