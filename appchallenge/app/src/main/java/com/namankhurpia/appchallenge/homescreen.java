package com.namankhurpia.appchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class homescreen extends AppCompatActivity {

    private ImageButton sell,buy;
    private ImageButton btnhome,btnsolution,btnchat,btnlog,btnprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_homescreen);

        sell=(ImageButton)findViewById(R.id.sell);
        buy=(ImageButton)findViewById(R.id.buy);

        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i =new Intent(homescreen.this,selectveggie.class);
                startActivity(i);
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(homescreen.this,selectveggie.class);
                startActivity(i);
            }
        });

        btnsolution = (ImageButton)findViewById(R.id.solutionb);
        btnhome = (ImageButton)findViewById(R.id.homeb);
        btnchat = (ImageButton)findViewById(R.id.chatb);
        btnlog = (ImageButton)findViewById(R.id.logb);
        btnprofile = (ImageButton)findViewById(R.id.profileb);
        btnsolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homescreen.this,SolutionsActivity.class));
            }
        });
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homescreen.this,chatactivity.class));
            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homescreen.this,LogActivity.class));
            }
        });
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homescreen.this,profiletab.class));
            }
        });


    }
}
