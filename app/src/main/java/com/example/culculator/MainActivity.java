package com.example.culculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int sign;
    double a,b,answer;
    EditText et;
    String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = 0;
        et = (EditText) findViewById(R.id.et);
        temp ="";
    }

    public void veod(View view) {
        a = Double.parseDouble(et.getText().toString());
        sign = 1 ;
        et.setText("");
    }

    public void pahot(View view) {
        a = Double.parseDouble(et.getText().toString());
        sign = 2 ;
        et.setText("");
    }

    public void caful(View view) {
        a = Double.parseDouble(et.getText().toString());
        sign = 3 ;
        et.setText("");
    }

    public void helkei(View view) {
        a = Double.parseDouble(et.getText().toString());
        sign = 4 ;
        et.setText("");
    }

    public void reset(View view) {
        a = 0;
        b = 0;
        et.setText("");
    }

    public void shavee(View view) {
        b = Double.parseDouble(et.getText().toString());
        switch(sign){
            case 1:answer = a+b;
            temp =temp+answer;
            et.setText(temp);break;
            case 2:answer = a-b;
            temp =temp+answer;
            et.setText(temp);break;
            case 3:answer = a*b;
            temp =temp+answer;
            et.setText(temp);break;
            case 4:answer = a/b;
            temp =temp+answer;
            et.setText(temp);break;

        }
    }


    public void go(View view) {
        Intent si = new Intent(this,CreditScreen.class);
        si.putExtra("n",answer);
        startActivity(si);
    }
}
