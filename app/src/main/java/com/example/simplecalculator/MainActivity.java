package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText valueOne;
    private EditText valueTwo;
    private Spinner operator;
    private TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valueOne = findViewById(R.id.valueOne);
        valueTwo = findViewById(R.id.valueTwo);
        operator = (Spinner) findViewById(R.id.spinner);
        ans = findViewById(R.id.result);
    }

    public void calc(View view) {
        String oprt = operator.getSelectedItem().toString();
        String a = valueOne.getText().toString();
        String b = valueTwo.getText().toString();


        if (oprt.equals("add")){
            Add addition = new Add(Double.parseDouble(a),Double.parseDouble(b));
            ans.setText(addition.toString());

        }else if (oprt.equals("subtract")){
            Subtract subtract = new Subtract(Double.parseDouble(a),Double.parseDouble(b));
            ans.setText(subtract.string());
        }else if (oprt.equals("multiply")){
            Multiply multiply = new Multiply(Double.parseDouble(a),Double.parseDouble(b));
            ans.setText(multiply.toString());
        }else if (oprt.equals("divide")){
            if (b.equals("0")){
                Toast.makeText(this,"Error: division by 0",Toast.LENGTH_SHORT).show();
            }else {
                Divide divide = new Divide(Double.parseDouble(a),Double.parseDouble(b));
                ans.setText(divide.toString());
            }
        }
    }
}