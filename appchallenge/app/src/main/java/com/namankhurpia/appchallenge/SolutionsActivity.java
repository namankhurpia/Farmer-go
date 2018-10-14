package com.namankhurpia.appchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SolutionsActivity extends AppCompatActivity {
    private ImageButton btnhome,btnsolution,btnchat,btnlog,btnprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solutions);
        btnsolution = (ImageButton)findViewById(R.id.solutionb);
        btnhome = (ImageButton)findViewById(R.id.homeb);
        btnchat = (ImageButton)findViewById(R.id.chatb);
        btnlog = (ImageButton)findViewById(R.id.logb);
        btnprofile = (ImageButton)findViewById(R.id.profileb);
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SolutionsActivity.this,homescreen.class));
            }
        });
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SolutionsActivity.this,chatactivity.class));
            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SolutionsActivity.this,LogActivity.class));
            }
        });
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SolutionsActivity.this,profiletab.class));
            }
        });


    }
}
