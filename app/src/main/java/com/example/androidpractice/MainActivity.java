package com.example.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    int progress;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove Title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressbarid);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                doWork();
            }
        });
        thread.start();
    }

    public void doWork(){

        for (progress=10; progress<=100; progress=progress+10){


            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}