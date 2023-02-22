package com.example.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedBack extends AppCompatActivity implements View.OnClickListener {

    private Button sendButton, clearButton;
    private EditText nameEditText, mailEditText, messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        sendButton = (Button) findViewById(R.id.sendButtonID);
        clearButton = (Button) findViewById(R.id.clearButtonID);

        nameEditText = (EditText) findViewById(R.id.nameEditTextid);
        messageEditText = (EditText) findViewById(R.id.msgEditTextid);
        mailEditText = (EditText) findViewById(R.id.mailEditTextid);

        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        try {


            String name = nameEditText.getText().toString();
            String message = messageEditText.getText().toString();
            String mail = mailEditText.getText().toString();

            if (view.getId() == R.id.sendButtonID) {

                Intent intent2 = new Intent(Intent.ACTION_SEND);
                intent2.setType("text/email");

                intent2.putExtra(Intent.EXTRA_EMAIL, new String[]{"asif95331001@gmail.com"});

                intent2.putExtra(Intent.EXTRA_SUBJECT, "Feedback from app");
                intent2.putExtra(Intent.EXTRA_TEXT, "Name: " + name + "\n Email: " + mail + "\n Feedback: " + message);

                startActivity(Intent.createChooser(intent2, "Feedback with"));
            }
            if (view.getId() == R.id.clearButtonID) {

                nameEditText.setText("");
                mailEditText.setText("");
                messageEditText.setText("");
            }

        } catch (Exception e) {

            Toast.makeText(getApplicationContext(), "Exception: " + e, Toast.LENGTH_SHORT).show();
        }


    }
}