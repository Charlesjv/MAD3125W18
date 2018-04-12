package com.example.macstudent.poll;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Poll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poll);

    final Context context;
    context = this;

    Thread timer = new Thread(){
        public void run(){
            try{
                sleep(3000);
            }catch (Exception ex){
                Log.e("Launcher","Thread wait failed");
            }
            finally {
                finish();
                Intent loginIntent = new Intent(context,HomeActivity.class);
                startActivity(loginIntent);
            }
        }
    };

        timer.start();
}
}
