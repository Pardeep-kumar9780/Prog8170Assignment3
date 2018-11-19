package com.example.pourh.prog8170_assignment3;

import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.PrivateKey;

public class Prog8170_Assignment3_Calculator extends AppCompatActivity {

    private Button one, two, three, four, five, six, seven, eight, nine, zero, mul, add, div, sub, clear, equal;
   // to get user input and display the result.
    private TextView display, Result;
    // to get type of operation.
    private char OperationType;
    private final char ADD='+';
    private final char SUB = '-';
    private final char MUL = '*';
    private final char DIV = '/';
    private final char Equal = 0;
    //two variables to perform operations.
    private double i = Double.NaN;
    private double j;


    public double addition(double i, double j) {
        return (i + j);
    }

    public double subtraction(double i, double j) {
        return (i - j);
    }

    public double multiplication(double i, double j) {
        return (i * j);
    }

    public double division(double i, double j) {
        return (i / j);
    }
    private void calculate(){
        if(!Double.isNaN(i)){
            j = Double.parseDouble(display.getText().toString());
            switch(OperationType){
                case ADD:
                    i= addition(i,j);
                    break;
                case SUB:
                    i= subtraction(i,j);
                    break;
                case MUL:
                    i=multiplication(i,j);
                    break;
                case DIV:
                    i=division(i,j);
                    break;
                case Equal:
                    break;
            }
        }
        else{
            i = Double.parseDouble(display.getText().toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog8170__assignment3);

        //Getting the id's of buttons.
        zero = (Button) findViewById(R.id.btn0);
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        add = (Button) findViewById(R.id.btnadd);
        mul = (Button) findViewById(R.id.btnmul);
        sub = (Button) findViewById(R.id.btnsub);
        div = (Button) findViewById(R.id.btndivide);
        clear=(Button)findViewById(R.id.btnclear);
        equal=(Button)findViewById(R.id.btnequal);
        display = (TextView) findViewById(R.id.Control);
        Result = (TextView) findViewById(R.id.Result);

        //Assigning value to each button
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "9");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                OperationType = SUB;
                Result.setText(String.valueOf(i) + "-");
                display.setText(null);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                OperationType = ADD;
                Result.setText(String.valueOf(i) + "+");
                display.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                OperationType = MUL;
                Result.setText(String.valueOf(i) + "*");
                display.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                OperationType = DIV;
                Result.setText(String.valueOf(i) + "/");
                display.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                OperationType = Equal;
                Result.setText(Result.getText().toString() + String.valueOf(j) + "=" + String.valueOf(i));
                display.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().length() > 0){
                    CharSequence name = display.getText().toString();
                    display.setText(name.subSequence(0, name.length()-1));
                }
                else{
                    i = Double.NaN;
                    j = Double.NaN;
                    display.setText(null);
                    Result.setText(null);
                }
            }
        });

    }
}
