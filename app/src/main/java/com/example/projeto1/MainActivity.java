package com.example.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber5;

    private EditText editTextNumber6;

    private EditText editTextNumber7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber5 = findViewById(R.id.editTextNumber5);
        editTextNumber6 = findViewById(R.id.editTextNumber6);
        editTextNumber7 = findViewById(R.id.editTextNumber7);
    }

    public void somar(View view) {
        int x,y,soma;
        x = Integer.parseInt(editTextNumber5.getText().toString());
        y = Integer.parseInt(editTextNumber6.getText().toString());
        soma = x + y;
        editTextNumber7.setText(Integer.toString(soma));
    }
}