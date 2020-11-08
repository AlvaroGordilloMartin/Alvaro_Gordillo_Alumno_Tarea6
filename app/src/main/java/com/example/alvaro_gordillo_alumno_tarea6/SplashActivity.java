package com.example.alvaro_gordillo_alumno_tarea6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private static final long WAIT_TIME=2000;

    Animation bottomAnimation, topAnimation;

    TextView txtTakeTheThrow;
    ImageView iv_icono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //region Animacion Splash
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.splash_text_bottom_animation);
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.splash_image_top_aniamtion);

        iv_icono = findViewById(R.id.iv_icono);
        txtTakeTheThrow = findViewById(R.id.txt_TakeTheTrow);

        iv_icono.setAnimation(topAnimation);
        txtTakeTheThrow.setAnimation(bottomAnimation);
        //endregion
    }



    @Override
    protected void onStart() {
        super.onStart();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                initLogin();
            }
        },WAIT_TIME);
    }

    private void initLogin() {
        startActivity(new Intent(SplashActivity.this,LoginActivity.class));
        finish();
    }
}