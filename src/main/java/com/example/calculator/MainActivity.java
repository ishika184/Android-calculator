package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Num1, Num2;
    TextView textview;
    Button Add, Sub, Multiply, Div;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = findViewById(R.id.editTextNum1);
        Num2 = findViewById(R.id.editTextNum2);
        textview = findViewById(R.id.textView);
        Add = findViewById(R.id.buttonAdd);
        Sub = findViewById(R.id.buttonSub);
        Multiply = findViewById(R.id.buttonMultiply);
        Div = findViewById(R.id.buttonDiv);

        Add.setOnClickListener(v -> {
            int firstValue, secondValue, ans;
            firstValue = Integer.parseInt(Num1.getText().toString());
            secondValue = Integer.parseInt(Num2.getText().toString());

            ans = firstValue + secondValue;

            textview.setText(" "+ans);
        });

        Sub.setOnClickListener(v -> {
            int firstValue, secondValue, ans;
            firstValue = Integer.parseInt(Num1.getText().toString());
            secondValue = Integer.parseInt(Num2.getText().toString());

            ans = firstValue - secondValue;

            textview.setText(" "+ans);
        });

        Multiply.setOnClickListener(v -> {
            int firstValue, secondValue, ans;
            firstValue = Integer.parseInt(Num1.getText().toString());
            secondValue = Integer.parseInt(Num2.getText().toString());

            ans = firstValue * secondValue;

            textview.setText(" "+ans);
        });

        Div.setOnClickListener(v -> {
            int firstValue, secondValue, ans;
            firstValue = Integer.parseInt(Num1.getText().toString());
            secondValue = Integer.parseInt(Num2.getText().toString());

            ans = firstValue / secondValue;

            textview.setText(" "+ans);
        });
    }
}