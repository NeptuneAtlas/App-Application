package com.example.a3toolsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button, button1, button2;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button5);
        button1 = findViewById(R.id.button6);
        button2 = findViewById(R.id.button10);
        image = findViewById(R.id.imageView2);
    }



    public void viewCalc(View v){///takes you from home page to the actual program
        Intent launch = new Intent(this, calcActivity.class);
        startActivity(launch);
}
    public void viewStop(View v){
        Intent launch = new Intent(this, stopActivity.class);
        startActivity(launch);
    }
    public void viewPhoto(View v){
        Intent launch = new Intent(this, photoActivity.class);
        startActivity(launch);
    }



}