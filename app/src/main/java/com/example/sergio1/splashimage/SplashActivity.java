package com.example.sergio1.splashimage;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;


import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class SplashActivity extends AppCompatActivity {

    Timer timer;
    TimerTask timerTask;


    private long SPLASH_DELAY = 6000; //6 segundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iniciarTimerTask();
    }
    public void iniciarTimerTask() {

            TimerTask TimerTask = new TimerTask() {
                @Override
                public void run() {
                    Intent mainIntent = new Intent(getApplicationContext(),
                            MainActivity.class);
                    startActivity(mainIntent);
                    //Destruimos esta activity para prevenir


                    //que el usuario retorne aqui presionando el boton Atras.
                    finish();
                }
            };

            Timer timer = new Timer();
            timer.schedule(TimerTask, SPLASH_DELAY);

        }
    }

