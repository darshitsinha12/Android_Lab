package com.example.bundleeeeee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class second extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
    }

    public void Even(View view){
        text = (TextView)findViewById(R.id.text);
        Bundle bun=getIntent().getExtras();
        boolean b=bun.getBoolean("key1");
        if(b==true){
            text.setText("Even");
        }
        else{
            text.setText("Odd");
        }


    }
}