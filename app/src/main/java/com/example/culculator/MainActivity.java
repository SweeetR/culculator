package com.example.culculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int sign;
    double a,b,answer,tempans;
    EditText et;
    String temp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.et);
        sign = 1;
        a = 0;
        b = 0;
        answer = 0;
        temp = "";
        et.setText("");

    }

    public void veod(View view) {
        if (et.getText().toString().equals("")) {
            et.setText("");
            Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
        } else {
            a = Double.parseDouble(et.getText().toString());
            sign = 1;
            et.setText("");
        }
    }

    public void pahot(View view) {
        if (et.getText().toString().equals("")) {
            et.setText("");
            Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
        } else {
            a = Double.parseDouble(et.getText().toString());
            sign = 2;
            et.setText("");
        }
    }

    public void caful(View view) {
        if (et.getText().toString().equals("")) {
            et.setText("");
            Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
        } else {
            a = Double.parseDouble(et.getText().toString());
            sign = 3;
            et.setText("");
        }
    }

    public void helkei(View view) {
        if (et.getText().toString().equals("")) {
            et.setText("");
            Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
        } else {
            a = Double.parseDouble(et.getText().toString());
            sign = 4;
            et.setText("");
        }
    }

    public void reset(View view) {
        a = 0;
        b = 0;
        answer = 0;
        temp = "";
        et.setText("");
    }

    public void shavee(View view) {
        if(et.getText().toString().equals("")){
        et.setText("");
            Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
        }
        else{
        b = Double.parseDouble(et.getText().toString());
        switch(sign) {
            case 1:
                answer = a + b;
                temp = temp + answer;
                et.setText(temp);
                temp = "";
                tempans = answer;
                break;
            case 2:
                answer = a - b;
                temp = temp + answer;
                et.setText(temp);
                temp = "";
                tempans = answer;
                break;
            case 3:
                answer = a * b;
                temp = temp + answer;
                et.setText(temp);
                temp = "";
                tempans = answer;
                break;
            case 4:
                answer = a / b;
                temp = temp + answer;
                et.setText(temp);
                temp = "";
                tempans = answer;
                break;
        }
        }
    }


    public void go(View view) {
        Intent si = new Intent(this,CreditScreen.class);
        si.putExtra("n",tempans);
        startActivity(si);
    }
}
