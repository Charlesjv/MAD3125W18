package com.example.macstudent.poll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TechnologyActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);

        btnsubmit = (Button) findViewById(R.id.btn_tecsubmit);
        btnsubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_tecsubmit) {
            Toast.makeText(getApplicationContext(),
                    "Your vote submitted", Toast.LENGTH_LONG).show();


        }
    }
}