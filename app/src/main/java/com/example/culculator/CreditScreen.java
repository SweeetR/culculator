package com.example.culculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CreditScreen extends AppCompatActivity {
    TextView tv1;
    String temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_screen);
        Intent gi = getIntent();
        double lastanswer = gi.getDoubleExtra("n",0);
        tv1 =(TextView) findViewById(R.id.tv1);
        temp = ""+lastanswer;
        tv1.setText("last answer was:"+temp);
    }
}
