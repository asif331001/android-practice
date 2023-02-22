package com.example.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton playButton, pauseButton;
    private MediaPlayer mediaPlayer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (ImageButton) findViewById(R.id.playButtonId);
        pauseButton = (ImageButton) findViewById(R.id.pauseButtonId);

        mediaPlayer1 = MediaPlayer.create(this,R.raw.give_tnx_allah);

        playButton.setOnClickListener(this);
        pauseButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.playButtonId){

            if (mediaPlayer1!=null){

                mediaPlayer1.start();
                int duration = mediaPlayer1.getDuration();
                Toast.makeText(MainActivity.this,"Song Played "+duration,Toast.LENGTH_SHORT).show();
            }

        }

        if (view.getId()==R.id.pauseButtonId){

            if (mediaPlayer1!=null){

                mediaPlayer1.pause();
                Toast.makeText(MainActivity.this,"Song Paused",Toast.LENGTH_SHORT).show();
            }
        }

    }

    @Override
    protected void onDestroy() {
         if (mediaPlayer1!=null && mediaPlayer1.isPlaying() ) {

             mediaPlayer1.stop();
             mediaPlayer1.release();
             mediaPlayer1=null;
         }
         super.onDestroy();
    }
}