package com.example.androidpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

        mediaPlayer1 = MediaPlayer.create(this, R.raw.give_tnx_allah);

        playButton.setOnClickListener(this);
        pauseButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.playButtonId) {

            if (mediaPlayer1 != null) {

                mediaPlayer1.start();
                int duration = mediaPlayer1.getDuration();
                Toast.makeText(MainActivity.this, "Song Played " + duration, Toast.LENGTH_SHORT).show();
            }

        }

        if (view.getId() == R.id.pauseButtonId) {

            if (mediaPlayer1 != null) {

                mediaPlayer1.pause();
                Toast.makeText(MainActivity.this, "Song Paused", Toast.LENGTH_SHORT).show();
            }
        }

    }

    @Override
    protected void onDestroy() {
        if (mediaPlayer1 != null && mediaPlayer1.isPlaying()) {

            mediaPlayer1.stop();
            mediaPlayer1.release();
            mediaPlayer1 = null;
        }
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.shareid) {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject = "Android App";
            String body = "Install and enjoy \n package com.example.androidpractice";

            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, body);

            startActivity(Intent.createChooser(intent, " share with "));

        }

        if (item.getItemId() == R.id.feedbackid) {

            Intent intent1 = new Intent(getApplicationContext(), FeedBack.class);
            startActivity(intent1);
        }

        if (item.getItemId() == R.id.aboutusid) {


        }

        return super.onOptionsItemSelected(item);
    }
}