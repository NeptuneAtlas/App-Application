package com.example.a3toolsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.PackageManagerCompat;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class photoActivity extends AppCompatActivity {
ImageView image;
Button takePhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        image = findViewById(R.id.imageView);
        takePhoto = findViewById(R.id.button11);
    }




    public void takesPhoto(View v){

    }

}