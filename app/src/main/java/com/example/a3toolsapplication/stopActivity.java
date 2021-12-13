package com.example.a3toolsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class stopActivity extends AppCompatActivity {
Button start, pause, reset;
Chronometer chronometer;
boolean running;
public long pauseTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);

        start = findViewById(R.id.button7);
        pause = findViewById(R.id.button8);
        reset = findViewById(R.id.button9);
        chronometer = findViewById(R.id.chronometer1);
    }

    public void startTimer(View v){
    if(!running){
        chronometer.setBase(SystemClock.elapsedRealtime() - pauseTime);// makes sure to ignore how long program runs for more accurate time
        chronometer.start();
        running = true;
    }
    }
    public void pauseTimer(View v){
    if(running){
        chronometer.stop();
        pauseTime = SystemClock.elapsedRealtime() - chronometer.getBase();
        running = false;
    }
    }
    public void restTimer(View v){
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseTime = 0; // makes sure everything has been reset
    }
}