package com.example.a3toolsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calcActivity extends AppCompatActivity {
Button add, sub, mul, div;
EditText num1, num2;
TextView showResult;
int txt1, txt2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        showResult = findViewById(R.id.textView);
        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);
        add = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        mul = findViewById(R.id.button3);
        div = findViewById(R.id.button4);

    }

    public void addNumber(View v){
        txt1 = Integer.parseInt(num1.getText().toString());
        txt2 = Integer.parseInt(num2.getText().toString());
        result = txt1 + txt2;
        showResult.setText(String.valueOf(result));

    }

    public void subNumber(View v){
        txt1 = Integer.parseInt(num1.getText().toString());
        txt2 = Integer.parseInt(num2.getText().toString());
        result = txt1 - txt2;
        showResult.setText(String.valueOf(result));

    }

    public void mulNumber(View v){
        txt1 = Integer.parseInt(num1.getText().toString());
        txt2 = Integer.parseInt(num2.getText().toString());
        result = txt1 * txt2;
        showResult.setText(String.valueOf(result));

    }

    public void divNumber(View v){
        txt1 = Integer.parseInt(num1.getText().toString());
        txt2 = Integer.parseInt(num2.getText().toString());
        result = txt1 / txt2;
        showResult.setText(String.valueOf(result));

    }


}