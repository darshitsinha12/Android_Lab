package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
EditText e;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Start",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Resume",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Stop",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"destroyer",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"pause",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Restart",Toast.LENGTH_SHORT).show();
    }
    public void next_page(View view){
        Intent it = new Intent(this,second.class);
        startActivity(it);
    }
    public void web_page(View view){
        String url;
        e=(EditText)findViewById(R.id.e1);
        t=(TextView)findViewById(R.id.t1);
        url = e.getText().toString();
        t.setText(url);
    }

}