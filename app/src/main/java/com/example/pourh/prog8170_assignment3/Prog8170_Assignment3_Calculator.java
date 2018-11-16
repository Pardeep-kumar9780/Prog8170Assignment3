package com.example.pourh.prog8170_assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Prog8170_Assignment3_Calculator extends AppCompatActivity {

    public double addition(double i, double j){
        return (i+j);
    }
    public double subtraction(double i, double j){
        return (i-j);
    }
    public double multiplication(double i, double j){
        return (i*j);
    }
    public double division(double i, double j){
        return (i*j);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog8170__assignment3);

    }
}
