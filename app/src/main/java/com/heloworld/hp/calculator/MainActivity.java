package com.heloworld.hp.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    Button one;
    Button two;
    Button three;
    Button add;
    Button five;
    Button six;
    Button seven;
    Button sub;
    Button nine;
    Button ten;
    Button eleven;
    Button mul;
    Button thirteen;
    Button clear;
    Button equal;
    Button div;
    EditText editText;

    Float param1, param2;
    boolean addition, subtraction, multiply, division;

    ArrayList<String> operators = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initalization();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() .toString().concat("1"));

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() .concat("2"));

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString().concat("3"));

            }

        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString().concat("4"));
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString().concat("5"));
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString().concat("6"));
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString().concat("7"));
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString().concat("8"));
            }
        });
        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString().concat("9"));
            }
        });
        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString().concat("0"));
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");

                }else {
                    param1=Float.parseFloat(editText.getText().toString().concat(""));
                    addition=true;

                    editText.setText(editText.getText().toString().concat("+"));
                    //editText.setText(null);
                }
            }

        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                param1=Float.parseFloat(editText.getText().toString().concat(""));
                subtraction=true;
                editText.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                param1=Float.parseFloat(editText.getText().toString().concat(""));
                multiply=true;
                editText.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                param1=Float.parseFloat(editText.getText().toString().concat(""));
                division=true;
                editText.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //param2=Float.parseFloat(editText.getText().toString().concat(""));
                String equation = editText.getText().toString().replace("+","@");
                Log.d("EQUAL",equation);

                String[] params = equation.split("@",2);

                if(addition==true){
                    float result =  Float.parseFloat(params[0]) + Float.parseFloat(params[1]);

                    editText.setText(String.valueOf(result));
                    addition=false;
                }
                if(subtraction==true){
                    editText.setText(param1-param2+"");
                    subtraction=false;
                }
                if(multiply==true){
                    editText.setText(param1*param2+"");
                    multiply=false;
                }
                if(division==true){
                    editText.setText(param1/param2+"");
                    division=false;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.getText().clear();
            }
        });
    }

    public void initalization() {
        one = findViewById(R.id.b1);
        two = findViewById(R.id.b2);
        three = findViewById(R.id.b3);
        add = findViewById(R.id.add);
        five = findViewById(R.id.b5);
        six = findViewById(R.id.b6);
        seven = findViewById(R.id.b7);
        sub = findViewById(R.id.sub);
        nine = findViewById(R.id.b9);
        ten = findViewById(R.id.b10);
        eleven = findViewById(R.id.b11);
        mul = findViewById(R.id.mul);
        thirteen = findViewById(R.id.b13);
        clear = findViewById(R.id.b14);
        equal = findViewById(R.id.b15);
        div = findViewById(R.id.div);
        editText = findViewById(R.id.et);

        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");


    }
}