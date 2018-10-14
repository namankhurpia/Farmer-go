package com.namankhurpia.appchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class LogActivity extends AppCompatActivity {
    private ImageButton btnhome,btnsolution,btnchat,btnlog,btnprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        btnsolution = (ImageButton)findViewById(R.id.solutionb);
        btnhome = (ImageButton)findViewById(R.id.homeb);
        btnchat = (ImageButton)findViewById(R.id.chatb);
        btnlog = (ImageButton)findViewById(R.id.logb);
        btnprofile = (ImageButton)findViewById(R.id.profileb);
        btnsolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogActivity.this,SolutionsActivity.class));
            }
        });
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogActivity.this,chatactivity.class));
            }
        });
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogActivity.this,homescreen.class));
            }
        });
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogActivity.this,profiletab.class));
            }
        });

    }
}
