package com.example.macstudent.poll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TimActivity extends AppCompatActivity implements View.OnClickListener {

Button btn_e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tim);

        btn_e = (Button) findViewById(R.id.btn_timsubmit);
        btn_e.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btn_timsubmit){
        Toast.makeText(getApplicationContext(),
                "Your vote submitted",Toast.LENGTH_LONG).show();
    }
}}
