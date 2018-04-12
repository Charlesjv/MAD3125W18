package com.example.macstudent.poll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener{


    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        btnsend = (Button)(Button) findViewById(R.id.btn_send);
        btnsend.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_timsubmit){
           sendEmail();
        }
    }


    private void sendEmail(){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/plain");

        emailIntent.putExtra(Intent.EXTRA_EMAIL,
                new String[]{"charles764jaison@gmail.com"});

        emailIntent.putExtra(Intent.EXTRA_SUBJECT,
                "Test Email");
        emailIntent.putExtra(Intent.EXTRA_TEXT,
                "This is a test message");

        emailIntent.setType("message/rfc822");

        startActivity(Intent.createChooser(emailIntent,
                "Select Email Client"));
    }

}
