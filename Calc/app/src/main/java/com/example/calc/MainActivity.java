package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText num1,num2;
TextView res;
int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
       num1=(EditText)findViewById(R.id.num1);
       num2=(EditText)findViewById(R.id.num2);
       res=(TextView)findViewById(R.id.res);
        a=Integer.parseInt(num1.getText().toString());
        b=Integer.parseInt(num2.getText().toString());
        c= a+b;
        res.setText(Integer.toString(c));
    }
    public void sub(View view){
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        res=(TextView)findViewById(R.id.res);
        a=Integer.parseInt(num1.getText().toString());
        b=Integer.parseInt(num2.getText().toString());
        c= a-b;
        res.setText(Integer.toString(c));
    }
}