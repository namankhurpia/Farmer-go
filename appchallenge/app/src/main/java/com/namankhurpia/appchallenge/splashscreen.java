package com.namankhurpia.appchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        final
        Thread mythread=new Thread()
        {
            @Override
            public void run() {
                super.run();

                try {
                    sleep(2000);
                    //transfer to slide
                    Intent i=new Intent(splashscreen.this,MainActivity.class);
                    startActivity(i);
                    finish();

                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        mythread.start();

    }

    }

