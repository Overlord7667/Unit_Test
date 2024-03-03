package com.betelgeuse.corp.unittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.betelgeuse.corp.unittest.models.Calculator;
import com.betelgeuse.corp.unittest.models.PhoneStateReceiver;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber;
    EditText secondNumber;
    TextView answer;
    Button addBTN;
    Button subtractBTN;
    Button multiplyBTN;
    Button divideBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhoneStateReceiver phoneStateReceiver = new PhoneStateReceiver();

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        answer = findViewById(R.id.answer);
        addBTN = findViewById(R.id.buttonAdd);
        subtractBTN = findViewById(R.id.buttonSubtract);
        multiplyBTN = findViewById(R.id.buttonMultiply);
        divideBTN = findViewById(R.id.buttonDivide);

        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('+');
            }
        });

        subtractBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('-');
            }
        });

        multiplyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('*');
            }
        });

        divideBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('/');
            }
        });
    }
    private void calculate(char operation){
        String numA = firstNumber.getText().toString();
        String numB = secondNumber.getText().toString();

        if (numA.isEmpty() || numB.isEmpty()){
            answer.setText("Введите все числа");
        }

        int a = Integer.parseInt(numA);
        int b = Integer.parseInt(numB);

        Calculator calculator = new Calculator(a, b);
        int result = 0;

        switch (operation){
            case '+':
                result = calculator.add();
                break;

            case '-':
                result = calculator.subtract();
                break;

            case '*':
                result = calculator.multiply();
                break;

            case '/':
                double division = calculator.divide();
                answer.setText("" + division);
                return;

        }

        answer.setText("" + result);
    }
}