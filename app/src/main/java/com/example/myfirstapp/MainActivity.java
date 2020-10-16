package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnSub, btnMul, btnDiv, btnEql, btnClr;
    TextView result;
    char sign = ' ';

    StringBuilder res = new StringBuilder();
    StringBuilder res2 = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnEql = findViewById(R.id.btnEql);
        btnClr = findViewById(R.id.btnClr);
        result = findViewById(R.id.result);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.append(0);
                result.setText(res2 + " " + sign + " " + res);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.append(1);
                result.setText(res2 + " " + sign + " " + res);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.append(2);
                result.setText(res2 + " " + sign + " " + res);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.append(3);
                result.setText(res2 + " " + sign + " " + res);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.append(4);
                result.setText(res2 + " " + sign + " " + res);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.append(5);
                result.setText(res2 + " " + sign + " " + res);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.append(6);
                result.setText(res2 + " " + sign + " " + res);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.append(7);
                result.setText(res2 + " " + sign + " " + res);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.append(8);
                result.setText(res2 + " " + sign + " " + res);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.append(9);
                result.setText(res2 + " " + sign + " " + res);

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checker()) {


                    res2.append(res);
                    res.setLength(0);
                    sign = '+';
                    result.setText(res2 + " " + sign);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checker()) {
                    res2.append(res);
                    res.setLength(0);
                    sign = '-';
                    result.setText(res2 + " " + sign);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checker()) {
                    res2.append(res);
                    res.setLength(0);
                    sign = '*';
                    result.setText(res2 + " " + sign);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (checker()) {
                    res2.append(res);
                    res.setLength(0);
                    sign = '/';
                    result.setText(res2 + " " + sign);
                }
            }
        });

        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double a = Integer.parseInt(res2.toString());
                    double b = Integer.parseInt(res.toString());
                    double c = 0;

                    if (sign == '+') {
                        c = a + b;
                    }
                    if (sign == '-') {
                        c = a - b;
                    }
                    if (sign == '*') {
                        c = a * b;
                    }
                    if (sign == '/') {
                        c = a / b;
                    }
                    result.setText(String.valueOf(c));

                    res.setLength(0);
                    res2.setLength(0);
                    sign = ' ';
                } catch (Exception ex) {
                    Toast.makeText(getApplicationContext(), "Invalid Expression", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setLength(0);
                res2.setLength(0);
                sign = ' ';
                result.setText(null);

            }
        });

    }

    boolean checker() {
        return sign <= '*' || sign >= '/';
    }
}