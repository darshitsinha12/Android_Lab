package com.example.bundleeeeee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText num;
    boolean b=true;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPage(View view){
        num=(EditText)findViewById(R.id.num);
        a=Integer.parseInt(num.getText().toString());
        if(a%2==0){
            b=true;
        }
        else{
            b=false;
        }
        Bundle bun=new Bundle();
        Intent it=new Intent(this,second.class);
        bun.putBoolean("key1",b);
        it.putExtras(bun);
        startActivity(it);



    }

}