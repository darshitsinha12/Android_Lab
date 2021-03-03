package com.example.media;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=MediaPlayer.create(this,R.raw.test);
    }
    public void play(View view){
        mediaPlayer.start();
    }
    public void pause(View view){
        mediaPlayer.pause();
    }
    public void forward(View view){
        mediaPlayer.seekTo(51500);
    }
    public void rewind(View view){
        if(mediaPlayer.getCurrentPosition()>5000) {
            mediaPlayer.seekTo(mediaPlayer.getCurrentPosition() - 5000);
        }
        else{
            Toast.makeText(this,"MADARCHOD TIME ME KAR", Toast.LENGTH_LONG).show();
        }
    }
}